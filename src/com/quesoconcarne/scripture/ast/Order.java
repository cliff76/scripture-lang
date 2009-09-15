package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.List;

public class Order extends Node {

    private ScriptureToken name;
    private ScriptureToken parentname;
    private List<Node> blockContents;

    Order(ScriptureToken name, ScriptureToken parentname, List<Node> blockContents) {
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

    public ScriptureToken getName() {
        return name;
    }

    public ScriptureToken getParentname() {
        return parentname;
    }

}
