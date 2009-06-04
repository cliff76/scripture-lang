package com.quesoconcarne.scripture.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EmitOutput {

    private List<SourceFile> sourceFileList = new ArrayList<SourceFile>();
    private Stack<SourceFile> sourceFileStack = new Stack<SourceFile>();

    public void pushSourceFile(SourceFile sourceFile) {
        if (!sourceFileList.contains(sourceFile)) {
            sourceFileList.add(sourceFile);
        }
        sourceFileStack.push(sourceFile);
    }

    public SourceFile popSourceFile() {
        return sourceFileStack.pop();
    }

    public SourceFile getCurrentSourceFile() {
        return sourceFileStack.peek();
    }

    public List<SourceFile> getSourceFiles() {
        return new ArrayList<SourceFile>(sourceFileList);
    }

}
