package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class Prophecy extends Node {

    private ScriptureToken genesis;
    private Expression expression;
    private ScriptureToken alias;
    private List<Node> blockContents;

    Prophecy(ScriptureToken genesis, Expression expression, ScriptureToken alias, List<Node> blockContents) {
        super();
        this.genesis = genesis;
        this.expression = expression;
        this.alias = alias;
        this.blockContents = blockContents;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(expression);
        result.addAll(blockContents);
        return result;
    }

    public ScriptureToken getAlias() {
        return alias;
    }

    public List<Node> getBlockContents() {
        return blockContents;
    }

    public Expression getExpression() {
        return expression;
    }

    public ScriptureToken getGenesis() {
        return genesis;
    }

}
