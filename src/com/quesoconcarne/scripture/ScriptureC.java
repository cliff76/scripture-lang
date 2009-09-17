package com.quesoconcarne.scripture;

import com.quesoconcarne.scripture.ast.Program;
import com.quesoconcarne.scripture.java.ScriptureScriptEngine;
import com.quesoconcarne.scripture.parser.ScriptureLexer;
import com.quesoconcarne.scripture.parser.ScriptureParser;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Constructor;

public class ScriptureC {

    private static void printUsage() {
        System.err.println("Usage: ScriptureC [2-letter locale code] <source file>");
    }

    public static void main(String args[]) throws Exception {
        if (args.length != 2) {
            printUsage();
            System.exit(1);
        }
        String locale = args[0];
        if (locale.length() != 2) {
            printUsage();
            System.exit(2);
        }
        final Class lexerClass;
        try {
            lexerClass = Class.forName("Lexer" + locale.toUpperCase());
        }
        catch (Exception e) {
            throw new Exception("Cannot load lexer for locale: " + locale, e);
        }
        final String inputFilename = args[1];
        final FileReader fileReader = new FileReader(inputFilename);
        final Constructor<?> constructor = lexerClass.getConstructor(Reader.class);
        final ScriptureLexer lexer = (ScriptureLexer) constructor.newInstance(fileReader);
        ScriptureParser parser = new ScriptureParser(lexer);
        final Program program = parser.getProgram();
        ScriptureScriptEngine backend = new ScriptureScriptEngine();
        backend.run(program);
    }
}