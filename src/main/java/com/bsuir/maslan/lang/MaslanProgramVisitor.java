package com.bsuir.maslan.lang;

import com.bsuir.maslan.lang.gen.MaslanBaseVisitor;
import com.bsuir.maslan.lang.gen.MaslanParser;
import com.bsuir.maslan.lang.util.FunctionSignature;
import com.bsuir.maslan.lang.util.VariableStack;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaslanProgramVisitor extends MaslanBaseVisitor<String> {
    private static final String INTERMEDIATE_BEGINNING = "import com.bsuir.maslan.model.Matrix;\n"
            + "import com.bsuir.maslan.model.Vector;\n"
            + "public class Result {\n"
            + "    public static void main(String[] args) {\n"
            + "        try {\n"
            + "            new Result().start();\n"
            + "        } catch (Exception e) {\n"
            + "            System.err.println(e.getMessage());\n"
            + "        }\n"
            + "    }\n";

    private List<String> errors = new ArrayList<>();
    private VariableStack variables = new VariableStack();
    private List<FunctionSignature> signatures = new ArrayList<>();
    private FunctionSignature currFunctionSignature;

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public String visitProgram(MaslanParser.ProgramContext ctx) {
        StringBuilder buffer = new StringBuilder(INTERMEDIATE_BEGINNING);

        for (MaslanParser.FuncAssigmentContext context : ctx.funcAssigment()) {
            buffer.append(visitFuncAssigment(context));
        }

        currFunctionSignature = new FunctionSignature("main", "void", Collections.emptyList());
        signatures.add(currFunctionSignature);

        buffer.append("private void start() throws Exception ").append(visitBlock(ctx.block())).append("}");

        return buffer.toString();
    }

    @Override
    public String visitBlock(MaslanParser.BlockContext ctx) {
        StringBuilder buffer = new StringBuilder("{\n");
        variables.increase();

        for (MaslanParser.ContentContext context : ctx.content()) {
            buffer.append(visitContent(context)).append("\n");
        }

        if (ctx.returnStatement() != null) {
            buffer.append(visitReturnStatement(ctx.returnStatement()));
        }

        variables.decrease();
        buffer.append("}\n");

        return buffer.toString();
    }

    @Override
    public String visitReturnStatement(MaslanParser.ReturnStatementContext ctx) {
        StringBuilder buffer = new StringBuilder("return");
        if (ctx.ID() != null) {
            String varId = ctx.ID().getText();
            String varType = variables.get(varId);
            buffer.append(" ").append(varId);

            if (varType == null) {
                errors.add("Error: cant find variable " + varId + " in return");
            } else {
                String functionReturnType = currFunctionSignature.getReturnType();
                if ("void".equals(functionReturnType)) {
                    errors.add("Error: function has void result type");
                } else if (!varType.equals(functionReturnType)) {
                    errors.add("Error: required - " + functionReturnType + " result type. Found - " + varType);
                }
            }
        }
        buffer.append(";\n");

        return buffer.toString();
    }

    @Override
    public String visitFuncAssigment(MaslanParser.FuncAssigmentContext ctx) {
        StringBuilder buffer = new StringBuilder();
        String functionName = ctx.ID().getText();
        String functionReturnType = visitType(ctx.type());

        buffer.append("\nprivate ").append(functionReturnType).append(" ").append(functionName).append("(");
        if (ctx.funcParams() != null) {
            buffer.append(visitFuncParams(ctx.funcParams()));
        }
        buffer.append(")").append(" throws Exception ");

        variables.increase();
        List<String> functionParamTypes = new ArrayList<>();
        if (ctx.funcParams().funcParam() != null) {
            for (MaslanParser.FuncParamContext param : ctx.funcParams().funcParam()) {
                String paramName = param.ID().getText();
                String paramType = param.type().getText();
                variables.put(paramName, paramType);
                functionParamTypes.add(paramType);
            }
        }

        makeFuncAssigmentPresets(functionName, functionReturnType.toLowerCase(), functionParamTypes);

        buffer.append(visitBlock(ctx.block()));
        variables.decrease();

        return buffer.toString();
    }

    private void makeFuncAssigmentPresets(String functionName, String functionReturnType, List<String> funcParamTypes) {
        currFunctionSignature = new FunctionSignature(functionName, functionReturnType, funcParamTypes);
        if (!signatures.contains(currFunctionSignature)) {
            signatures.add(currFunctionSignature);
        } else {
            errors.add("Function with name " + functionName + " already exist.");
        }
    }

    @Override
    public String visitFuncParams(MaslanParser.FuncParamsContext ctx) {
        StringBuilder buffer = new StringBuilder();
        List<MaslanParser.FuncParamContext> params = ctx.funcParam();

        int lastIndex = params.size() - 1;
        for (int i = 0; i < lastIndex; i++) {
            buffer.append(visitFuncParam(params.get(i))).append(", ");
        }
        buffer.append(visitFuncParam(params.get(lastIndex)));

        return buffer.toString();
    }

    @Override
    public String visitFuncParam(MaslanParser.FuncParamContext ctx) {
        return visitType(ctx.type()) + " " + ctx.ID().getText();
    }

    @Override
    public String visitFuncCall(MaslanParser.FuncCallContext ctx) {
        StringBuilder buffer = new StringBuilder();

        String functionName = ctx.ID().getText();
        List<String> functionParamTypes = new ArrayList<>();
        if (ctx.funcArgs() != null) {
            String argsLine = visitFuncArgs(ctx.funcArgs());
            buffer.append(functionName).append("(").append(argsLine).append(")");

            String[] functionArgs = argsLine.split(", ");
            for (String arg : functionArgs) {
                functionParamTypes.add(variables.get(arg));
            }
        } else {
            buffer.append(functionName).append("()");
        }

        if (!checkFunctionSignature(functionName, functionParamTypes)) {
            errors.add("Error: cant find function with such signature " + functionName);
        }

        return buffer.toString();
    }

    private boolean checkFunctionSignature(String functionName, List<String> functionParamTypes) {
        boolean isFound = false;
        for (FunctionSignature signature : signatures) {
            if (functionName.equals(signature.getName()) && functionParamTypes.equals(signature.getParameterTypes())) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    @Override
    public String visitFuncArgs(MaslanParser.FuncArgsContext ctx) {
        StringBuilder buffer = new StringBuilder();
        List<MaslanParser.FuncArgContext> args = ctx.funcArg();

        int lastIndex = args.size() - 1;
        for (int i = 0; i < lastIndex; i++) {
            buffer.append(visitFuncArg(args.get(i))).append(", ");
        }
        buffer.append(visitFuncArg(args.get(lastIndex)));

        return buffer.toString();
    }

    @Override
    public String visitFuncArg(MaslanParser.FuncArgContext ctx) {
        String argId = ctx.ID().getText();

        if (variables.get(argId) == null) {
            errors.add("Error: cant find variable with name " + argId);
        }

        return argId;
    }

    @Override
    public String visitType(MaslanParser.TypeContext ctx) {
        if (ctx.MATRIX_TYPE() != null) {
            return "Matrix";
        } else if (ctx.VECTOR_TYPE() != null) {
            return "Vector";
        } else if ((ctx.MATRIX_TYPE() != null && !ctx.MATRIX_TYPE().getText().equals("matrix"))
                || (ctx.VECTOR_TYPE() != null && !ctx.VECTOR_TYPE().getText().equals("vector"))) {
            errors.add("Error: unknown type of variable");
        }

        return "";
    }

    @Override
    public String visitContent(MaslanParser.ContentContext ctx) {
        if (ctx.vectorAssignment() != null) {
            return visitVectorAssignment(ctx.vectorAssignment());
        } else if (ctx.matrixAssignment() != null) {
            return visitMatrixAssignment(ctx.matrixAssignment());
        } else if (ctx.varDeclaration() != null) {
            return visitVarDeclaration(ctx.varDeclaration());
        } else if (ctx.whileOperator() != null) {
            return visitWhileOperator(ctx.whileOperator());
        } else if (ctx.condOperator() != null) {
            return visitCondOperator(ctx.condOperator());
        } else if (ctx.assignment() != null) {
            return visitAssignment(ctx.assignment());
        } else if (ctx.forOperator() != null) {
            return visitForOperator(ctx.forOperator());
        } else if (ctx.funcCallStatement() != null) {
            return visitFuncCallStatement(ctx.funcCallStatement());
        } else {
            return "";
        }
    }

    @Override
    public String visitVectorAssignment(MaslanParser.VectorAssignmentContext ctx) {
        StringBuilder buffer = new StringBuilder();
        String varID = ctx.ID().getText();

        String existVariableType = variables.get(varID);
        if (existVariableType != null) {
            if (ctx.VECTOR_TYPE() != null) {
                errors.add("Error: variable with name " + varID + " already exist.");
            } else if (!"vector".equals(existVariableType)) {
                errors.add("Error: variable with name " + varID + " is not a vector.");
            }
        } else {
            variables.put(varID, "vector");
            buffer.append("Vector ");
        }

        if (ctx.setLine() != null) {
            buffer.append(varID).append(" = new Vector(new int[]")
                    .append(visitSetLine(ctx.setLine())).append(");\n");
        }

        return buffer.toString();
    }

    @Override
    public String visitMatrixAssignment(MaslanParser.MatrixAssignmentContext ctx) {
        StringBuilder buffer = new StringBuilder();
        String varID = ctx.ID().getText();

        String existVariableType = variables.get(varID);
        if (existVariableType != null) {
            if (ctx.MATRIX_TYPE() != null) {
                errors.add("Error: variable with name " + varID + " already exist.");
            } else if (!"matrix".equals(existVariableType)) {
                errors.add("Error: variable with name " + varID + " is not a matrix.");
            }
        } else {
            variables.put(varID, "matrix");
            buffer.append("Matrix ");
        }

        if (ctx.setLines() != null) {
            buffer.append(varID).append(" = new Matrix(new int[][]")
                    .append(visitSetLines(ctx.setLines())).append(");\n");
        }

        return buffer.toString();
    }

    @Override
    public String visitIntAssignment(MaslanParser.IntAssignmentContext ctx) {
        String varID = ctx.ID().getText();
        String existVariableType = variables.get(varID);
        if (existVariableType != null) {
            if (ctx.INT_TYPE() != null) {
                errors.add("Error: variable with name " + varID + " already exist.");
            } else if (!"int".equals(existVariableType)) {
                errors.add("Error: variable with name " + varID + " is not an integer.");
            }
        } else {
            variables.put(varID, "int");
        }

        return "int " + varID + " = " + Integer.parseInt(ctx.INT().getText()) + ";";
    }

    @Override
    public String visitSetLine(MaslanParser.SetLineContext ctx) {
        StringBuilder buffer = new StringBuilder("{");

        int intNumber = ctx.INT().size();
        for (int i = 0; i < intNumber; i++) {
            buffer.append(ctx.INT(i).getText());
            if (i != intNumber - 1) {
                buffer.append(", ");
            }
        }

        buffer.append("}");
        return buffer.toString();
    }

    @Override
    public String visitSetLines(MaslanParser.SetLinesContext ctx) {
        StringBuilder buffer = new StringBuilder("{");

        int linesNumber = ctx.setLine().size();
        for (int i = 0; i < linesNumber; i++) {
            buffer.append(visitSetLine(ctx.setLine(i)));
            if (i != linesNumber - 1) {
                buffer.append(", ");
            }
        }

        buffer.append("}");
        return buffer.toString();
    }

    @Override
    public String visitVarDeclaration(MaslanParser.VarDeclarationContext ctx) {
        StringBuilder buffer = new StringBuilder();
        String varID = ctx.ID().getText();
        String existVariableType = variables.get(varID);

        if ("matrix".equals(existVariableType) || "vector".equals(existVariableType)) {
            errors.add("Error: variable with name " + varID + " was already exist.");
        } else {
            if (ctx.type().MATRIX_TYPE() != null) {
                variables.put(varID, "matrix");
                buffer.append("Matrix ").append(varID).append(" = new Matrix();\n");
            } else {
                variables.put(varID, "vector");
                buffer.append("Vector ").append(varID).append(" = new Vector();\n");
            }
        }

        return buffer.toString();
    }

    @Override
    public String visitCondOperator(MaslanParser.CondOperatorContext ctx) {
        StringBuilder buffer = new StringBuilder(visitIfStatement(ctx.ifStatement()));

        if (ctx.elseStatement() != null) {
            buffer.append(visitElseStatement(ctx.elseStatement()));
        }

        return buffer.toString();
    }

    @Override
    public String visitIfStatement(MaslanParser.IfStatementContext ctx) {
        return "if (" + visitCompOper(ctx.compOper()) + ")" + visitBlock(ctx.block());
    }

    @Override
    public String visitElseStatement(MaslanParser.ElseStatementContext ctx) {
        return "else" + visitBlock(ctx.block());
    }

    @Override
    public String visitWhileOperator(MaslanParser.WhileOperatorContext ctx) {
        return visitWhileStatement(ctx.whileStatement()) + visitBlock(ctx.block());
    }

    @Override
    public String visitDoWhileOperator(MaslanParser.DoWhileOperatorContext ctx) {
        return visitDoStatement(ctx.doStatement()) + visitWhileStatement(ctx.whileStatement()) + ";\n";
    }

    @Override
    public String visitWhileStatement(MaslanParser.WhileStatementContext ctx) {
        return "while (" + visitCompOper(ctx.compOper()) + ")";
    }

    @Override
    public String visitDoStatement(MaslanParser.DoStatementContext ctx) {
        return "do" + visitBlock(ctx.block());
    }

    @Override
    public String visitForOperator(MaslanParser.ForOperatorContext ctx) {
        return "for (" + visitIntAssignment(ctx.intAssignment()) + " " + visitCompOper(ctx.compOper())
                + "; " + visitIterAction(ctx.iterAction()) + ")" + visitBlock(ctx.block());
    }

    @Override
    public String visitIterAction(MaslanParser.IterActionContext ctx) {
        return ctx.ID().getText() + " = " + visitExpression(ctx.expression());
    }

    @Override
    public String visitPrintFunc(MaslanParser.PrintFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfVectorOrMatrixType(varId);

        return ctx.getText();
    }

    @Override
    public String visitGetFunc(MaslanParser.GetFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfVectorOrMatrixType(varId);

        List<MaslanParser.FuncArgContext> argContexts = ctx.funcArg();
        checkStandardFunctionArgs(argContexts);

        int argCount = argContexts.size();
        String varType = variables.get(varId);
        if ("vector".equals(varType)) {
            checkNumberOfArguments(1, argCount);
        } else if ("matrix".equals(varType)) {
            checkNumberOfArguments(2, argCount);
        }

        return ctx.getText();
    }

    @Override
    public String visitSetFunc(MaslanParser.SetFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfVectorOrMatrixType(varId);

        List<MaslanParser.FuncArgContext> argContexts = ctx.funcArg();
        checkStandardFunctionArgs(argContexts);

        int argCount = argContexts.size();
        String varType = variables.get(varId);
        if ("vector".equals(varType)) {
            checkNumberOfArguments(2, argCount);
        } else if ("matrix".equals(varType)) {
            checkNumberOfArguments(3, argCount);
        }

        return ctx.getText();
    }

    private void checkStandardFunctionArgs(List<? extends ParserRuleContext> argContexts) {
        for (ParserRuleContext argContext : argContexts) {
            checkStandardFunctionArg(argContext.getText());
        }
    }

    private void checkNumberOfArguments(int expectedArgCount, int argCount) {
        if (!(argCount == expectedArgCount)) {
            errors.add("Error: incorrect number of arguments. Required - " + expectedArgCount + ", found - " + argCount);
        }
    }

    @Override
    public String visitLenFunc(MaslanParser.LenFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfVectorType(varId);

        return ctx.getText();
    }

    @Override
    public String visitInsertFunc(MaslanParser.InsertFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfVectorType(varId);

        checkStandardFunctionArg(ctx.funcArg().getText());

        return ctx.getText();
    }

    @Override
    public String visitRemoveFunc(MaslanParser.RemoveFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfVectorType(varId);

        return ctx.getText();
    }

    @Override
    public String visitNcolFunc(MaslanParser.NcolFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfMatrixType(varId);

        return ctx.getText();
    }

    @Override
    public String visitNrowFunc(MaslanParser.NrowFuncContext ctx) {
        String varId = ctx.ID().getText();
        checkStandardFunctionVariableOfMatrixType(varId);

        return ctx.getText();
    }

    private void checkStandardFunctionVariableOfVectorOrMatrixType(String varId) {
        String varType = variables.get(varId);
        if (varType == null) {
            errors.add("Error: cant find variable with name " + varId);
        } else if ("int".equals(varType)) {
            errors.add("Error: incorrect type of variable. Required - vector or matrix, found - " + varType);
        }
    }

    private void checkStandardFunctionVariableOfVectorType(String varId) {
        String varType = variables.get(varId);
        if (varType == null) {
            errors.add("Error: cant find variable with name " + varId);
        } else if (!"vector".equals(varType)) {
            errors.add("Error: incorrect type of variable. Required - vector, found - " + varType);
        }
    }

    private void checkStandardFunctionVariableOfMatrixType(String varId) {
        String varType = variables.get(varId);
        if (varType == null) {
            errors.add("Error: cant find variable with name " + varId);
        } else if (!"matrix".equals(varType)) {
            errors.add("Error: incorrect type of variable. Required - matrix, found - " + varType);
        }
    }

    private void checkStandardFunctionArg(String argId) {
        String argType = variables.get(argId);
        if (argType == null) {
            errors.add("Error: cant find variable with name " + argId);
        } else if (!"int".equals(argType)) {
            errors.add("Error: incorrect type of argument. Required - int, found - " + argType);
        }
    }

    @Override
    public String visitAddingOper(MaslanParser.AddingOperContext ctx) {
        List<TerminalNode> intNodes = ctx.INT();
        List<TerminalNode> idNodes = ctx.ID();
        String text = ctx.getText();
        String operation = ctx.ADD().getText();

        checkOperatorsOfArithmeticOperation(intNodes, idNodes);

        return executeArithmeticOperation(intNodes, idNodes, text, operation);
    }

    @Override
    public String visitSubtractingOper(MaslanParser.SubtractingOperContext ctx) {
        List<TerminalNode> intNodes = ctx.INT();
        List<TerminalNode> idNodes = ctx.ID();
        String text = ctx.getText();
        String operation = ctx.SUBTRACT().getText();

        checkOperatorsOfArithmeticOperation(intNodes, idNodes);

        return executeArithmeticOperation(intNodes, idNodes, text, operation);
    }

    @Override
    public String visitMultiplyingOper(MaslanParser.MultiplyingOperContext ctx) {
        List<TerminalNode> intNodes = ctx.INT();
        List<TerminalNode> idNodes = ctx.ID();
        String text = ctx.getText();
        String operation = ctx.MULTIPLY().getText();

        checkOperatorsOfArithmeticOperation(intNodes, idNodes);

        return executeArithmeticOperation(intNodes, idNodes, text, operation);
    }

    private void checkOperatorsOfArithmeticOperation(List<TerminalNode> intNodes, List<TerminalNode> idNodes) {
        int intNodesNumber = intNodes.size();
        if (intNodesNumber < 2) {
            String firstOperand = idNodes.get(0).getText();
            String firstOperandType = variables.get(firstOperand);
            if (firstOperandType == null) {
                errors.add("Error: cant find variable with name " + firstOperand);
            }

            if (intNodesNumber == 0) {
                String secondOperand = idNodes.get(1).getText();
                String secondOperandType = variables.get(secondOperand);
                if (secondOperandType == null) {
                    errors.add("Error: cant find variable with name " + secondOperand);
                } else if (!secondOperandType.equals(firstOperandType)) {
                    errors.add("Error: incorrect type of argument. Required - " + firstOperandType
                            + ", found - " + secondOperandType);
                }
            }
        }
    }

    private String executeArithmeticOperation(List<TerminalNode> intNodes, List<TerminalNode> idNodes,
                                              String text, String operator) {
        StringBuilder buffer = new StringBuilder();

        int intNodesNumber = intNodes.size();
        if (intNodesNumber == 2) {
            buffer.append(text);
        } else {
            String secondOperand;
            if (intNodesNumber == 1) {
                secondOperand = intNodes.get(0).getText();
            } else {
                secondOperand = idNodes.get(1).getText();
            }

            String firstOperand = idNodes.get(0).getText();
            if ("int".equals(variables.get(firstOperand))) {
                buffer.append(text);
            } else {
                buffer.append(firstOperand).append(".").append(getOperatorName(operator));
                buffer.append("(").append(secondOperand).append(")");
            }
        }

        return buffer.toString();
    }

    private String getOperatorName(String operation) {
        switch (operation) {
            case "+":
                return "plus";
            case "-":
                return "minus";
            case "*":
                return "mult";
            default:
                return "";
        }
    }

    @Override
    public String visitAssignment(MaslanParser.AssignmentContext ctx) {
        StringBuilder buffer = new StringBuilder();
        String varId = ctx.ID().getText();

        if (ctx.type() != null) {
            if (variables.get(varId) == null) {
                if ("matrix".equals(ctx.type().getText())) {
                    variables.put(varId, "matrix");
                    buffer.append("Matrix ");
                } else if ("vector".equals(ctx.type().getText())) {
                    variables.put(varId, "vector");
                    buffer.append("Vector ");
                }
            } else {
                errors.add("Error: variable " + varId + " already exist.");
            }
        }
        if (ctx.expression() != null) {
            buffer.append(varId).append(" = ").append(visitExpression(ctx.expression())).append(";");
        }

        return buffer.toString();
    }

    @Override
    public String visitExpression(MaslanParser.ExpressionContext ctx) {
        if (ctx.addingOper() != null) {
            return visitAddingOper(ctx.addingOper());
        } else if (ctx.subtractingOper() != null) {
            return visitSubtractingOper(ctx.subtractingOper());
        } else if (ctx.multiplyingOper() != null) {
            return visitMultiplyingOper(ctx.multiplyingOper());
        } else if (ctx.funcCall() != null) {
            return visitFuncCall(ctx.funcCall());
        } else {
            return "";

        }
    }

    @Override
    public String visitFuncCallStatement(MaslanParser.FuncCallStatementContext ctx) {
        StringBuilder buffer = new StringBuilder();

        if (ctx.printFunc() != null) {
            buffer.append(visitPrintFunc(ctx.printFunc()));
        } else if (ctx.insertFunc() != null) {
            buffer.append(visitInsertFunc(ctx.insertFunc()));
        } else if (ctx.removeFunc() != null) {
            buffer.append(visitRemoveFunc(ctx.removeFunc()));
        } else if (ctx.setFunc() != null) {
            buffer.append(ctx.setFunc());
        } else if (ctx.funcCall() != null) {
            buffer.append(ctx.funcCall());
        } else {
            return "";
        }

        buffer.append(";\n");

        return buffer.toString();
    }

    @Override
    public String visitCompOper(MaslanParser.CompOperContext ctx) {
        List<MaslanParser.CompOperandContext> compOperandContexts = ctx.compOperand();

        String firstOperand = visitCompOperand(compOperandContexts.get(0));
        String secondOperand = visitCompOperand(compOperandContexts.get(1));

        String operator = ctx.compOperator().getText();

        return firstOperand + " " + operator + " " + secondOperand;
    }

    @Override
    public String visitCompOperand(MaslanParser.CompOperandContext ctx) {
        if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.INT() != null) {
            return ctx.INT().getText();
        } else if (ctx.getFunc() != null) {
            return visitGetFunc(ctx.getFunc());
        } else if (ctx.lenFunc() != null) {
            return visitLenFunc(ctx.lenFunc());
        } else if (ctx.ncolFunc() != null) {
            return visitNcolFunc(ctx.ncolFunc());
        } else if (ctx.nrowFunc() != null) {
            return visitNrowFunc(ctx.nrowFunc());
        } else if (ctx.removeFunc() != null) {
            return visitRemoveFunc(ctx.removeFunc());
        } else {
            return "";
        }
    }
}
