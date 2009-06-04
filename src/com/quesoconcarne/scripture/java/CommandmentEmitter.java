package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Commandment;
import com.quesoconcarne.scripture.Node;
import java.util.List;
import org.antlr.runtime.Token;

public class CommandmentEmitter implements Emitter<Commandment> {

    public void emit(Commandment commandment, EmitContext context) throws Exception {
        final Token name = commandment.getName();
        final List<Node> blockContents = commandment.getBlockContents();
        final EmitOutput output = context.getOutput();
        final SourceFile sourceFile = output.getCurrentSourceFile();
        final SourceChannel channel = sourceFile.getCurrentChannel();
        final EmitterFactory factory = EmitterFactory.getInstance();
        
        channel.append("public void ");
        channel.append(name.getText());
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
        channel.append(name.getText());
        channel.append("\n");
    }

}
