package com.quesoconcarne.scripture;

import java.util.List;
import org.antlr.runtime.Token;

public class Order extends Node {

    private Token name;
    private Token parentname;
    private List<Node> blockContents;

    Order(Token name, Token parentname, List<Node> blockContents) {
        super();
        this.name = name;
        this.parentname = parentname;
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

    public Token getParentname() {
        return parentname;
    }

}
