package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;

public class IdentifierExpression extends AtomicExpression {

    public IdentifierExpression(ScriptureToken literal) {
        super(literal);
    }

}
