package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class BinaryExpression extends Expression {

    private Expression left;
    private Token operator;
    private Expression right;

    public BinaryExpression(Expression left, Token operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(left);
        result.add(right);
        return result;
    }

    public Expression getLeft() {
        return left;
    }

    public Token getOperator() {
        return operator;
    }

    public Expression getRight() {
        return right;
    }

}
