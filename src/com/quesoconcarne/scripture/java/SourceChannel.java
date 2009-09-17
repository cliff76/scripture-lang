package com.quesoconcarne.scripture.java;

import java.io.IOException;
import java.io.StringWriter;

public class SourceChannel {

    private String className;
    private StringWriter output = new StringWriter();

    public SourceChannel(String name) {
        this.className = name;
    }

    public void append(String value) throws IOException {
        output.write(value);
    }

    @Override
    public String toString() {
        return output.toString();
    }

    public String getClassName() {
        return className;
    }

}
