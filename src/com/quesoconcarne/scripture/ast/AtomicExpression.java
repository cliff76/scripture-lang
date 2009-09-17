package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class AtomicExpression extends Expression {

    private ScriptureToken literal;

    public AtomicExpression(ScriptureToken literal) {
        super();
        this.literal = literal;
    }

    @Override
    public List<? extends Node> getChildren() {
        return new ArrayList<Node>();
    }

    public ScriptureToken getLiteral() {
        return literal;
    }

}
