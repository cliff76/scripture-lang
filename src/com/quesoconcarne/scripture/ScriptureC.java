package com.quesoconcarne.scripture;

import com.quesoconcarne.scripture.java.ScriptureScriptEngine;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class ScriptureC {

    public static void main(String args[]) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: ScriptureC <source file>");
            System.exit(1);
        }
        String input = args[0];
        ANTLRFileStream inputStream = new ANTLRFileStream(input);
        ScriptureLexer lexer = new ScriptureLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ScriptureParser parser = new ScriptureParser(tokenStream);
        try {
            final Program program = parser.program().result;
            RunnableBackend backend = new ScriptureScriptEngine();
            backend.run(program);
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}