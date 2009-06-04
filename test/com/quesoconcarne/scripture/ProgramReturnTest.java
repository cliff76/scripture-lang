package com.quesoconcarne.scripture;

import com.quesoconcarne.scripture.ScriptureParser.program_return;
import java.net.URL;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

public class ProgramReturnTest extends ScriptureTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSimple() throws Exception {
        URL inputURL = getClass().getResource("Test.scripture");
        String inputPath = inputURL.getPath();

        ANTLRFileStream inputStream = new ANTLRFileStream(inputPath);
        ScriptureLexer lexer = new ScriptureLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        ScriptureParser parser = new ScriptureParser(tokenStream);
        program_return program = parser.program();
        assertNotNull(program.result);
        String expectedOutput = getFileAsStream("Test.output");

        TreePrinter printer = new TreePrinter();
        program.result.accept(printer);
        String printerOutput = printer.getOutput();
//        assertEquals(printerOutput, expectedOutput);
    }
}
