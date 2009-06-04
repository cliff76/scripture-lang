package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.CreateExpression;

public class CreateExpressionEmitter implements Emitter<CreateExpression> {

    public void emit(CreateExpression node, EmitContext context) throws Exception {
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();
        channel.append("new ");
        channel.append(node.getIdentifier().getText());
        channel.append("()");
    }

}
