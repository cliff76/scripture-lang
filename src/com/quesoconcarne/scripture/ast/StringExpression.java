package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;

public class StringExpression extends AtomicExpression {

    public StringExpression(ScriptureToken literal) {
        super(literal);
    }

}
