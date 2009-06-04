package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;

public class ExpressionStatement extends Statement {

    private Expression expression;

    public ExpressionStatement(Expression expression) {
        super();
        this.expression = expression;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(expression);
        return result;
    }

    public Expression getExpression() {
        return expression;
    }

}
