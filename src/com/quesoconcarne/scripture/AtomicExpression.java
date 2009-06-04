package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class AtomicExpression extends Expression {

    private Token literal;

    public AtomicExpression(Token literal) {
        super();
        this.literal = literal;
    }

    @Override
    public List<? extends Node> getChildren() {
        return new ArrayList<Node>();
    }

    public Token getLiteral() {
        return literal;
    }

}
