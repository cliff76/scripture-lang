package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class BinaryExpression extends Expression {

    private Expression left;
    private ScriptureToken operator;
    private Expression right;

    public BinaryExpression(Expression left, ScriptureToken operator, Expression right) {
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

    public ScriptureToken getOperator() {
        return operator;
    }

    public Expression getRight() {
        return right;
    }

}
