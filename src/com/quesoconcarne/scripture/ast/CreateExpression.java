package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class CreateExpression extends AtomicExpression {

    public CreateExpression(ScriptureToken identifier) {
        super(identifier);
    }

    @Override
    public List<? extends Node> getChildren() {
        return new ArrayList<Node>();
    }

    public ScriptureToken getIdentifier() {
        return getLiteral();
    }

}
