package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;

public class PrayStatement extends Statement {

    private Expression expression;

    public PrayStatement(Expression expression) {
        super();
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(expression);
        return result;
    }

}
