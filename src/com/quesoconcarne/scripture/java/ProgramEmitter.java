package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Domain;
import com.quesoconcarne.scripture.Node;
import com.quesoconcarne.scripture.Program;
import java.util.List;

public class ProgramEmitter implements Emitter<Program> {

    public void emit(Program node, EmitContext context) throws Exception {
        final Program program = (Program) node;
        context.pushContainer(program);
        try {
            final Domain domain = program.getDomain();
            final EmitterFactory factory = EmitterFactory.getInstance();
            if (domain != null) {
                factory.getEmitterForNode(domain).emit(domain, context);
            }
            final List<Node> blockContents = program.getBlockContents();
            if (blockContents != null) {
                for (Node blockItem : blockContents) {
                    Node blockItemNode = (Node) blockItem;
                    factory.getEmitterForNode(blockItemNode).emit(blockItemNode, context);
                }
            }
        }
        finally {
            context.popContainer();
        }
    }

}
