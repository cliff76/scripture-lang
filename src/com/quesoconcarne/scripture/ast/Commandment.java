package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.List;

public class Commandment extends Node {

    private ScriptureToken name;
    private List<Node> blockContents;

    Commandment(ScriptureToken name, List<Node> blockContents) {
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

    public ScriptureToken getName() {
        return name;
    }

}
