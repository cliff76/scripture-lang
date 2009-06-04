package com.quesoconcarne.scripture;

import org.antlr.runtime.Token;

public class IdentifierExpression extends AtomicExpression {

    public IdentifierExpression(Token literal) {
        super(literal);
    }

}
