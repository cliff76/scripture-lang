package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.IfStatement;
import com.quesoconcarne.scripture.ast.Node;
import java.util.List;

public class IfStatementEmitter implements Emitter<IfStatement> {

    public void emit(IfStatement node, EmitContext context) throws Exception {
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();
        final Expression expression = node.getExpression();
        channel.append("if ((");
        EmitterFactory.getInstance().getEmitterForNode(expression).emit(expression, context);
        channel.append(").booleanValue()) {\n");
        
        final List ifBlockContents = node.getChildren();
        if (ifBlockContents != null) {
            for (Object item : ifBlockContents) {
                if (item instanceof Node) {
                    Node itemNode = (Node) item;
                    EmitterFactory.getInstance().getEmitterForNode(itemNode).emit(itemNode, context);
                }
                else {
                    throw new CompilerBugException("Unsupported block item: " + item);
                }
            }
        }
        channel.append("} // End of if \n");
        
        final List elseBlockContents = node.getChildren();
        if (elseBlockContents != null) {
            channel.append("else {\n");
            for (Object item : elseBlockContents) {
                if (item instanceof Node) {
                    Node itemNode = (Node) item;
                    EmitterFactory.getInstance().getEmitterForNode(itemNode).emit(itemNode, context);
                }
                else {
                    throw new CompilerBugException("Unsupported block item: " + item);
                }
            }
            channel.append("} // End of else\n");
        }
    }

}
