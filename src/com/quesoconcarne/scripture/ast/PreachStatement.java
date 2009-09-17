package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class PreachStatement extends Statement {

    private ScriptureToken stream;
    private Expression expression;

    public PreachStatement(ScriptureToken stream, Expression expression) {
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

    public ScriptureToken getStream() {
        return stream;
    }

}
