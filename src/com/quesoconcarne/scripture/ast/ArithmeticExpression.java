package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.ScriptureToken;

public class ArithmeticExpression extends BinaryExpression {

    public ArithmeticExpression(Expression left, ScriptureToken operator, Expression right) {
        super(left, operator, right);
    }

}
