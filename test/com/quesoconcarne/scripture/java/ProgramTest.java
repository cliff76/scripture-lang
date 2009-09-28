package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Program;
import com.quesoconcarne.scripture.ScriptureTestCase;
import java.net.URL;

public class ProgramTest extends ScriptureTestCase {

    public void testSimpleProgram() throws Exception {
        final URL inputURL = getClass().getResource(getClass().getSimpleName() + ".scripture");
        final Program program = getProgram(inputURL.getPath());

        final ScriptureScriptEngine target = new ScriptureScriptEngine();
        target.setOutputFile("/tmp/javaTargetTest");
        target.run(program);
    }

}
