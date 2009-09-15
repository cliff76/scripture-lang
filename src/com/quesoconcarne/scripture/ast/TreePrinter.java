package com.quesoconcarne.scripture.ast;

import java.util.List;

public class TreePrinter implements NodeVisitor {

    private StringBuilder out = new StringBuilder();
    private int currentIndentation = 0;

    public void visit(Node node) {
        for (int i = 0; i < currentIndentation; i++) {
            out.append("   ");
        }
        out.append(node.getClass().getSimpleName());
        out.append("\n");
        currentIndentation++;
        List<? extends Node> children = node.getChildren();
        for (Node currentChild : children) {
            currentChild.accept(this);
        }
        currentIndentation--;
    }

    public String getOutput() {
        return out.toString();
    }

}
