package com.quesoconcarne.scripture.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Root level node.
 */
public class Program extends Node {

    private List<Node> blockContents;
    private Domain domain;

    public Program(List<Node> blockContents) {
        super();
        this.blockContents = blockContents;
    }

    public Program(Domain domain) {
        super();
        this.domain = domain;
    }

    public List<Node> getBlockContents() {
        return blockContents;
    }

    public Domain getDomain() {
        return domain;
    }

    @Override
    public List<? extends Node> getChildren() {
        List<Node> result = new ArrayList<Node>();
        if (blockContents != null) {
            result.addAll(blockContents);
        }
        if (domain != null) {
            result.add(domain);
        }
        return result;
    }

}
