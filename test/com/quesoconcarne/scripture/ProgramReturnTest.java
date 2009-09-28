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
        final URL inputURL = getClass().getResource("Test.scripture");
        final String inputPath = inputURL.getPath();

        final ScriptureLexer lexer = new LexerLa(new FileReader(inputPath));
        final ScriptureParser parser = new ScriptureParser(lexer);
        final Program program = parser.getProgram();
        final ValidationResult validationResult = parser.getValidationResult();
        
        assertNotNull(validationResult);
        assertFalse("Errors found: " + validationResult.getErrors(), validationResult.hasErrors());
        
        final String expectedOutput = getFileAsStream("Test.output");
        final TreePrinter printer = new TreePrinter();
        program.accept(printer);
        final String printerOutput = printer.getOutput();
        assertEquals(printerOutput, expectedOutput);
    }
}
