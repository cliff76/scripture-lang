package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class CreateExpression extends Expression {

    private Token identifier;

    public CreateExpression(Token identifier) {
        super();
        this.identifier = identifier;
    }

    @Override
    public List<? extends Node> getChildren() {
        return new ArrayList<Node>();
    }

    public Token getIdentifier() {
        return identifier;
    }

}
