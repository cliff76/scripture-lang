package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class BooleanExpression extends Expression {

    private Boolean value;
    private Expression left;
    private ScriptureToken operator;
    private Expression right;

    BooleanExpression(Boolean value) {
        super();
        this.value = value;
    }

    BooleanExpression(Expression left, ScriptureToken operator, Expression right) {
        super();
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public BooleanExpression(ScriptureToken operator, Expression right) {
        super();
        this.operator = operator;
        this.right = right;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        if (getLeft() != null) {
            result.add(getLeft());
        }
        if (getRight() != null) {
            result.add(getRight());
        }
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

    public Boolean getValue() {
        return value;
    }

}
