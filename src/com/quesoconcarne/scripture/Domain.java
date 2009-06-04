package com.quesoconcarne.scripture;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.Token;

public class Domain extends Node {

    private List<Token> nameSegments;
    private List blockContents;

    Domain(List<Token> nameSegments, List blockContents) {
        super();
        this.nameSegments = nameSegments;
        this.blockContents = blockContents;
    }

    public String getSimpleName() {
        List<Token> segments = getNameSegments();
        Token lastSegment = segments.get(segments.size() - 1);
        return lastSegment.getText();
    }

    public boolean hasOrders() {
        for (Object item : getBlockContents()) {
            if (item instanceof Order) {
                return true;
            }
        }
        return false;
    }

    public List getBlockContents() {
        return blockContents;
    }

    public List<Token> getNameSegments() {
        return nameSegments;
    }

    public List<String> getNameSegmentStrings() {
        List<String> result = new ArrayList<String>();
        List<Token> segs = getNameSegments();
        for (Token token : segs) {
            result.add(token.getText());
        }
        return result;
    }

    @Override
    public List<? extends Node> getChildren() {
        return blockContents;
    }

}
