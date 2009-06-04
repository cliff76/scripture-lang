package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class Prophecy extends Node {

    private Token genesis;
    private Expression expression;
    private Token alias;
    private List<Node> blockContents;

    Prophecy(Token genesis, Expression expression, Token alias, List<Node> blockContents) {
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

    public Token getAlias() {
        return alias;
    }

    public List<Node> getBlockContents() {
        return blockContents;
    }

    public Expression getExpression() {
        return expression;
    }

    public Token getGenesis() {
        return genesis;
    }

}
