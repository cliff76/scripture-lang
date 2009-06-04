package com.quesoconcarne.scripture;

import org.antlr.runtime.Token;

public class ArithmeticExpression extends BinaryExpression {

    public ArithmeticExpression(Expression left, Token operator, Expression right) {
        super(left, operator, right);
    }

}
