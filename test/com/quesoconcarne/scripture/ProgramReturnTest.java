package com.quesoconcarne.scripture;

import com.quesoconcarne.scripture.ast.Program;
import java.io.FileReader;
import java.net.URL;

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

        ScriptureLexer lexer = new LexerEn(new FileReader(inputPath));
        ScriptureParser parser = new ScriptureParser(lexer);
        Program program = parser.getProgram();
        String expectedOutput = getFileAsStream("Test.output");

        TreePrinter printer = new TreePrinter();
        program.accept(printer);
        String printerOutput = printer.getOutput();
//        assertEquals(printerOutput, expectedOutput);
    }
}
