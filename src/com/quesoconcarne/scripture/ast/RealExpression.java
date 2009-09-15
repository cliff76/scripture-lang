package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;

class RealExpression extends AtomicExpression {

    public RealExpression(ScriptureToken literal) {
        super(literal);
    }

}
