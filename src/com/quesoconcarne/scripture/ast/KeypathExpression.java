package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class KeypathExpression extends Expression {

    private Expression left;
    private ScriptureToken operator;
    private ScriptureToken key;

    public KeypathExpression(Expression left, ScriptureToken operator, ScriptureToken key) {
        super();
        this.left = left;
        this.operator = operator;
        this.key = key;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        result.add(left);
        return result;
    }

    public ScriptureToken getKey() {
        return key;
    }

    public Expression getLeft() {
        return left;
    }

    public ScriptureToken getOperator() {
        return operator;
    }

}
