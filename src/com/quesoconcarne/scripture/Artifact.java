package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class Artifact extends Node {

    private Token name;
    private Expression value;

    Artifact(Token name) {
        this(name, null);
    }

    Artifact(Token name, Expression value) {
        super();
        this.name = name;
        this.value = value;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        if (value != null) {
            result.add(value);
        }
        return result;
    }

    public Token getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }

}
