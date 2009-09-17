package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.ScriptureToken;
import java.util.List;

public class Order extends Node {

    private ScriptureToken name;
    private ScriptureToken parentname;
    private OrderContent content;

    public Order(ScriptureToken name, ScriptureToken parentname, OrderContent content) {
        super();
        this.name = name;
        this.parentname = parentname;
        this.content = content;
    }

    @Override
    public List<? extends Node> getChildren() {
        return content.getChildren();
    }

    public OrderContent getContent() {
        return content;
    }

    public ScriptureToken getName() {
        return name;
    }

    public ScriptureToken getParentname() {
        return parentname;
    }

}
