package com.quesoconcarne.scripture.ast;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends Statement {

    private Expression expression;
    private Block ifBlock;
    private Block elseBlock;

    public IfStatement(Expression expression, Block ifBlock, Block elseBlock) {
        super();
        this.expression = expression;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(expression);
        result.add(ifBlock);
        if (elseBlock != null) {
            result.add(elseBlock);
        }
        return result;
    }

    public Expression getExpression() {
        return expression;
    }

    public Block getElseBlock() {
        return elseBlock;
    }

    public Block getIfBlock() {
        return ifBlock;
    }

}
