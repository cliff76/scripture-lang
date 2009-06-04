package com.quesoconcarne.scripture;

import com.quesoconcarne.scripture.ScriptureParser.program_return;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import junit.framework.TestCase;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

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

    public Program getProgram(String fileName) throws IOException, RecognitionException {
        ANTLRFileStream inputStream = new ANTLRFileStream(fileName);
        ScriptureLexer lexer = new ScriptureLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        ScriptureParser parser = new ScriptureParser(tokenStream);
        program_return program = parser.program();
        return program.result;
    }

}
