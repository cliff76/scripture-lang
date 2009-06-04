package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends Statement {

    private Expression expression;
    private List blockContents;
    private List elseBlockContents;

    IfStatement(Expression expression, List blockContents, List elseBlockContents) {
        super();
        this.expression = expression;
        this.blockContents = blockContents;
        this.elseBlockContents = elseBlockContents;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(expression);
        result.addAll(blockContents);
        if (elseBlockContents != null) {
            result.addAll(elseBlockContents);
        }
        return result;
    }

    public List getBlockContents() {
        return blockContents;
    }

    public List getElseBlockContents() {
        return elseBlockContents;
    }

    public Expression getExpression() {
        return expression;
    }

}
