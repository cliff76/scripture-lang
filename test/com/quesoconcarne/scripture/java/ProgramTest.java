package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Program;
import com.quesoconcarne.scripture.ScriptureTestCase;
import java.net.URL;

public class ProgramTest extends ScriptureTestCase {

    public void testSimpleProgram() throws Exception {
        URL inputURL = getClass().getResource(getClass().getSimpleName() + ".scripture");
        Program program = getProgram(inputURL.getPath());
        ScriptureScriptEngine target = new ScriptureScriptEngine();
        target.setOutputFile("/tmpt/javaTargetTest");
        target.run(program);
    }

}
