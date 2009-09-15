package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;

public class IntegerExpression extends AtomicExpression {

    public IntegerExpression(ScriptureToken literal) {
        super(literal);
    }

}
