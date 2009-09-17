package com.quesoconcarne.scripture;

import com.quesoconcarne.scripture.ast.Program;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import junit.framework.TestCase;

public abstract class ScriptureTestCase extends TestCase {

    public ScriptureTestCase(String name) {
        super(name);
    }

    public ScriptureTestCase() {
    }

    public String getFileAsStream(String fileName) throws IOException {
        InputStream inputStream = getClass().getResourceAsStream(fileName);
        InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
        BufferedReader in = new BufferedReader(reader);
        String line = null;
        StringWriter sw = new StringWriter();
        PrintWriter out = new PrintWriter(sw);
        while ((line = in.readLine()) != null) {
            out.println(line);
        }
        return sw.toString();
    }

    public Program getProgram(String fileName) throws IOException {
        ScriptureLexer lexer = new LexerEn(new FileReader(fileName));
        ScriptureParser parser = new ScriptureParser(lexer);
        return parser.getProgram();
    }

}
