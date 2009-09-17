package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class Prophecy extends Node {

    private ScriptureToken genesis;
    private Expression expression;
    private ScriptureToken alias;
    private Block block;

    public Prophecy(ScriptureToken genesis, Expression expression, ScriptureToken alias, Block block) {
        super();
        this.genesis = genesis;
        this.expression = expression;
        this.alias = alias;
        this.block = block;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        if (expression != null) {
            result.add(expression);
        }
        result.addAll(block.getChildren());
        return result;
    }

    public Expression getExpression() {
        return expression;
    }

    public ScriptureToken getGenesis() {
        return genesis;
    }

    public ScriptureToken getAlias() {
        return alias;
    }

    public Block getBlock() {
        return block;
    }

}
