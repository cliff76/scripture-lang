package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Commandment;
import com.quesoconcarne.scripture.ast.Node;
import com.quesoconcarne.scripture.ScriptureToken;
import java.util.List;

public class CommandmentEmitter implements Emitter<Commandment> {

    public void emit(Commandment commandment, EmitContext context) throws Exception {
        final ScriptureToken name = commandment.getName();
        final List<? extends Node> blockContents = commandment.getChildren();
        final EmitOutput output = context.getOutput();
        final SourceFile sourceFile = output.getCurrentSourceFile();
        final SourceChannel channel = sourceFile.getCurrentChannel();
        final EmitterFactory factory = EmitterFactory.getInstance();
        
        channel.append("public void ");
        channel.append(name.getLexeme());
        channel.append("() {\n");

        context.pushContainer(commandment);
        try {
            for (Node currentNode : blockContents) {
                final Emitter emitter = factory.getEmitterForNode(currentNode);
                emitter.emit(currentNode, context);
            }
        }
        finally {
            context.popContainer();
        }
        channel.append("} // End of method ");
        channel.append(name.getLexeme());
        channel.append("\n");
    }

}
