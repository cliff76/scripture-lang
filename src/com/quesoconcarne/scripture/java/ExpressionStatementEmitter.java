package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.ExpressionStatement;

public class ExpressionStatementEmitter implements Emitter<ExpressionStatement> {

    public void emit(ExpressionStatement statement, EmitContext context) throws Exception {
        final EmitterFactory factory = EmitterFactory.getInstance();
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();
        final Expression expression = statement.getExpression();
        
        factory.getEmitterForNode(expression).emit(expression, context);
        channel.append(";\n");
    }

}
