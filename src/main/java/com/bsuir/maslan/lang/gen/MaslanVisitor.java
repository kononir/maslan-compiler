// Generated from D:/My Programs/maslan/src/main/resources\Maslan.g4 by ANTLR 4.7.2
package com.bsuir.maslan.lang.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MaslanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MaslanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MaslanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MaslanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MaslanParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MaslanParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#funcAssigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAssigment(MaslanParser.FuncAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(MaslanParser.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#funcParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParam(MaslanParser.FuncParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MaslanParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(MaslanParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArg(MaslanParser.FuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#printFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunc(MaslanParser.PrintFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#getFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFunc(MaslanParser.GetFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#setFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetFunc(MaslanParser.SetFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#lenFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenFunc(MaslanParser.LenFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#ncolFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcolFunc(MaslanParser.NcolFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#nrowFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNrowFunc(MaslanParser.NrowFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#insertFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertFunc(MaslanParser.InsertFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#removeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveFunc(MaslanParser.RemoveFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#addingOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddingOper(MaslanParser.AddingOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#subtractingOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractingOper(MaslanParser.SubtractingOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#multiplyingOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingOper(MaslanParser.MultiplyingOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MaslanParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MaslanParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MaslanParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#intAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignment(MaslanParser.IntAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#setLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLine(MaslanParser.SetLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#vectorAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorAssignment(MaslanParser.VectorAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#setLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLines(MaslanParser.SetLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#matrixAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixAssignment(MaslanParser.MatrixAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MaslanParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#compOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOper(MaslanParser.CompOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#compOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOperator(MaslanParser.CompOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#compOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOperand(MaslanParser.CompOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MaslanParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(MaslanParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#condOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOperator(MaslanParser.CondOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(MaslanParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MaslanParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#whileOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileOperator(MaslanParser.WhileOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#doWhileOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileOperator(MaslanParser.DoWhileOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#forOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOperator(MaslanParser.ForOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#iterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterAction(MaslanParser.IterActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(MaslanParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaslanParser#funcCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallStatement(MaslanParser.FuncCallStatementContext ctx);
}