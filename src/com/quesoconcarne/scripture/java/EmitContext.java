package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Node;
import java.io.File;
import java.util.Stack;

public class EmitContext {

    private File inputFile;
    private Stack<Node> containerStack = new Stack<Node>();
    private EmitOutput output = new EmitOutput();
    private int currentAnonymousProphecyCounter = 0;

    public void pushContainer(Node node) {
        containerStack.push(node);
    }

    public Node popContainer() {
        return containerStack.pop();
    }

    public Node peekContaner() {
        if (containerStack.isEmpty()) {
            return null;
        }
        return containerStack.peek();
    }

    public EmitOutput getOutput() {
        return output;
    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public int getCurrentAnonymousProphecyCounter() {
        return currentAnonymousProphecyCounter;
    }

    public void incrementAnonymousProphecyCounter() {
        currentAnonymousProphecyCounter++;
    }

}
