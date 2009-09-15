package com.quesoconcarne.scripture.ast;

import java.util.List;

/**
 * Base Scripture AST node.
 */
public abstract class Node {

    public abstract List<? extends Node> getChildren();

    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }

}
