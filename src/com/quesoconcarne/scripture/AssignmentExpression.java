package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class AssignmentExpression extends BinaryExpression {

    public AssignmentExpression(Expression left, Token operator, Expression right) {
        super(left, operator, right);
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        return result;
    }

}
