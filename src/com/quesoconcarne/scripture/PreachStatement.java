package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class PreachStatement extends Statement {

    private Token stream;
    private Expression expression;

    public PreachStatement(Token stream, Expression expression) {
        super();
        this.stream = stream;
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

    public Token getStream() {
        return stream;
    }

}
