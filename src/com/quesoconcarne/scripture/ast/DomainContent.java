package com.quesoconcarne.scripture.ast;

import java.util.List;

public class DomainContent extends Node {

    private List<? extends Node> children;

    public DomainContent(List<? extends Node> children) {
        this.children = children;
    }

    @Override
    public List<? extends Node> getChildren() {
        return children;
    }

}
