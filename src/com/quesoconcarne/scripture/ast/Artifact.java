package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class Artifact extends Node {

    private ScriptureToken name;
    private Expression value;

    public Artifact(ScriptureToken name) {
        this(name, null);
    }

    public Artifact(ScriptureToken name, Expression value) {
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

    public ScriptureToken getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }

}
