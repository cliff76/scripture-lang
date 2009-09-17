package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class AssignmentExpression extends BinaryExpression {

    public AssignmentExpression(Expression left, ScriptureToken operator, Expression right) {
        super(left, operator, right);
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        return result;
    }

}
