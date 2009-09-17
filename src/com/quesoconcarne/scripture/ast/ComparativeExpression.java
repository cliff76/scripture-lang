package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.ScriptureToken;

public class ComparativeExpression extends BinaryExpression {

    public ComparativeExpression(Expression left, ScriptureToken operator, Expression right) {
        super(left, operator, right);
    }

}
