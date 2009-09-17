package com.quesoconcarne.scripture.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Root level node.
 */
public class Program extends Node {

    private DomainContent content;
    private Domain domain;

    public Program(DomainContent content) {
        super();
        this.content = content;
    }

    public Program(Domain domain) {
        super();
        this.domain = domain;
    }

    public DomainContent getContent() {
        return content;
    }

    public Domain getDomain() {
        return domain;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        if (content != null) {
            result.addAll(content.getChildren());
        }
        if (domain != null) {
            result.add(domain);
        }
        return result;
    }

}
