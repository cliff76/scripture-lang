package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Node;
import com.quesoconcarne.scripture.ast.Order;
import com.quesoconcarne.scripture.java.runtime.ScriptureClass;
import com.quesoconcarne.scripture.parser.ScriptureToken;
import com.quesoconcarne.scripture.parser.ScriptureTokenType;
import java.util.List;

public class OrderEmitter implements Emitter<Order> {

    public void emit(Order order, EmitContext context) throws Exception {
        final ScriptureToken name = order.getName();
        final ScriptureToken parentName = order.getParentname();
        final List<? extends Node> blockContents = order.getChildren();
        final EmitterFactory factory = EmitterFactory.getInstance();
        final EmitOutput output = context.getOutput();
        final SourceFile currentSourceFile = output.getCurrentSourceFile();
        
        final SourceChannel channel = new SourceChannel(name.getLexeme());
        currentSourceFile.pushChannel(channel);
        try {
            channel.append("public class ");
            channel.append(name.getLexeme());
            channel.append(" extends ");
            if (parentName != null && parentName.getType() != ScriptureTokenType.CREATION) {
                channel.append(parentName.getLexeme());
            }
            else {
                channel.append(ScriptureClass.class.getSimpleName());
            }
            channel.append(" {\n");

            context.pushContainer(order);
            try {
                for (Node currentNode : blockContents) {
                    final Emitter emitter = factory.getEmitterForNode(currentNode);
                    emitter.emit(currentNode, context);
                }
            }
            finally {
                context.popContainer();
            }

            channel.append("\n} // End of class ");
            channel.append(name.getLexeme());
            channel.append("\n");
        }
        finally {
            currentSourceFile.popChannel();
        }
    }

}
