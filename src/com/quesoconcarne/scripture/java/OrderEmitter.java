package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Node;
import com.quesoconcarne.scripture.Order;
import com.quesoconcarne.scripture.ScriptureLexer;
import com.quesoconcarne.scripture.java.runtime.ScriptureClass;
import java.util.List;
import org.antlr.runtime.Token;

public class OrderEmitter implements Emitter<Order> {

    public void emit(Order order, EmitContext context) throws Exception {
        final Token name = order.getName();
        final Token parentName = order.getParentname();
        final List<Node> blockContents = order.getBlockContents();
        final EmitterFactory factory = EmitterFactory.getInstance();
        final EmitOutput output = context.getOutput();
        final SourceFile currentSourceFile = output.getCurrentSourceFile();
        
        final SourceChannel channel = new SourceChannel(name.getText());
        currentSourceFile.pushChannel(channel);
        try {
            channel.append("public class ");
            channel.append(name.getText());
            channel.append(" extends ");
            if (parentName != null && parentName.getType() != ScriptureLexer.CREATION) {
                channel.append(parentName.getText());
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
            channel.append(name.getText());
            channel.append("\n");
        }
        finally {
            currentSourceFile.popChannel();
        }
    }

}
