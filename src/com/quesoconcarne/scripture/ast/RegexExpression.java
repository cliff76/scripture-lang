package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;

class RegexExpression extends AtomicExpression {

    public RegexExpression(ScriptureToken literal) {
        super(literal);
    }

}
