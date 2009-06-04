package com.quesoconcarne.scripture;

import org.antlr.runtime.Token;

public class ComparativeExpression extends BinaryExpression {

    public ComparativeExpression(Expression left, Token operator, Expression right) {
        super(left, operator, right);
    }

}
