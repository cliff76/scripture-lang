package com.quesoconcarne.scripture.ast;

import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.ArrayList;
import java.util.List;

public class Domain extends Node {

    private List<ScriptureToken> nameSegments;
    private DomainContent content;

    public Domain(List<ScriptureToken> nameSegments, DomainContent content) {
        super();
        this.nameSegments = nameSegments;
        this.content = content;
    }

    public String getSimpleName() {
        List<ScriptureToken> segments = getNameSegments();
        ScriptureToken lastSegment = segments.get(segments.size() - 1);
        return lastSegment.getLexeme();
    }

    public boolean hasOrders() {
        final List<? extends Node> contentChildren = content.getChildren();
        for (Node item : contentChildren) {
            if (item instanceof Order) {
                return true;
            }
        }
        return false;
    }

    public DomainContent getContent() {
        return content;
    }

    public List<ScriptureToken> getNameSegments() {
        return nameSegments;
    }

    public List<String> getNameSegmentStrings() {
        List<String> result = new ArrayList<String>();
        List<ScriptureToken> segs = getNameSegments();
        for (ScriptureToken token : segs) {
            result.add(token.getLexeme());
        }
        return result;
    }

    @Override
    public List<? extends Node> getChildren() {
        return content.getChildren();
    }

}
