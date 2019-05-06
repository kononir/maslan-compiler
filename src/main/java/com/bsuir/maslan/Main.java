package com.bsuir.maslan;

import com.bsuir.maslan.lang.MaslanProgramVisitor;
import com.bsuir.maslan.lang.gen.MaslanLexer;
import com.bsuir.maslan.lang.gen.MaslanParser;
import com.bsuir.maslan.util.ErrorsShower;
import com.bsuir.maslan.util.ResultWriter;
import com.bsuir.maslan.util.exception.WritingFilesException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream stream = CharStreams.fromFileName(args[0]);
            MaslanLexer lexer = new MaslanLexer(stream);

            MaslanParser parser = new MaslanParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            MaslanProgramVisitor visitor = new MaslanProgramVisitor();
            String output = visitor.visit(tree);

            new ResultWriter().writeResult(output);

            new ErrorsShower().showErrors(visitor.getErrors());
        } catch (IOException | WritingFilesException e) {
            e.printStackTrace();
        }
    }
}
