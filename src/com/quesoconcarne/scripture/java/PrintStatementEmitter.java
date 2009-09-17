package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.PreachStatement;

public class PrintStatementEmitter implements Emitter<PreachStatement> {

    public void emit(PreachStatement print, EmitContext context) throws Exception {
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();

        channel.append("System.out.println(");
        
        Expression expression = print.getExpression();
        Emitter expressionEmitter = EmitterFactory.getInstance().getEmitterForNode(expression);
        expressionEmitter.emit(expression, context);
        
        channel.append(");\n");
    }

}
