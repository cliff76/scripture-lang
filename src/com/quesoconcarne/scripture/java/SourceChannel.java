package com.quesoconcarne.scripture.java;

import java.io.IOException;
import java.io.StringWriter;
import org.antlr.stringtemplate.AutoIndentWriter;

public class SourceChannel {

    private String className;
    private StringWriter output = new StringWriter();
    private AutoIndentWriter writer = new AutoIndentWriter(output);

    public SourceChannel(String name) {
        this.className = name;
    }

    public void append(String value) throws IOException {
        writer.write(value);
    }

    @Override
    public String toString() {
        return output.toString();
    }

    public String getClassName() {
        return className;
    }

}
