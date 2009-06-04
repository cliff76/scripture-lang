package com.quesoconcarne.scripture;

import java.util.List;
import org.antlr.runtime.Token;

public class Commandment extends Node {

    private Token name;
    private List<Node> blockContents;

    Commandment(Token name, List<Node> blockContents) {
        super();
        this.name = name;
        this.blockContents = blockContents;
    }

    @Override
    public List<? extends Node> getChildren() {
        return blockContents;
    }

    public List<Node> getBlockContents() {
        return blockContents;
    }

    public Token getName() {
        return name;
    }

}
