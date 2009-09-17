package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Domain;
import com.quesoconcarne.scripture.ast.Node;
import com.quesoconcarne.scripture.ast.Program;
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
            final List<? extends Node> blockContents = program.getChildren();
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
