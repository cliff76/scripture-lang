package com.quesoconcarne.scripture.ast;

import java.util.List;

public class OrderContent extends Node {

    private List<? extends Node> children;

    public OrderContent(List<? extends Node> children) {
        this.children = children;
    }

    @Override
    public List<? extends Node> getChildren() {
        return children;
    }

}
