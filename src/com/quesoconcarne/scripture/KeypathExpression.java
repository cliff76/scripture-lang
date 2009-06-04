package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class KeypathExpression extends Expression {

    private Expression left;
    private Token operator;
    private Token key;

    public KeypathExpression(Expression left, Token operator, Token key) {
        super();
        this.left = left;
        this.operator = operator;
        this.key = key;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(left);
        return result;
    }

    public Token getKey() {
        return key;
    }

    public Expression getLeft() {
        return left;
    }

    public Token getOperator() {
        return operator;
    }

}
