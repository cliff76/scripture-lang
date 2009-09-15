package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.List;

public class Commandment extends Node {

    private ScriptureToken name;
    private Block block;

    public Commandment(ScriptureToken name, Block block) {
        super();
        this.name = name;
        this.block = block;
    }

    @Override
    public List<? extends Node> getChildren() {
        return block.getChildren();
    }

    public ScriptureToken getName() {
        return name;
    }

    public Block getBlock() {
        return block;
    }

}
