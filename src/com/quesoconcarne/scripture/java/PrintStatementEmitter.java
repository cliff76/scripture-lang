package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Expression;
import com.quesoconcarne.scripture.PrintStatement;

public class PrintStatementEmitter implements Emitter<PrintStatement> {

    public void emit(PrintStatement print, EmitContext context) throws Exception {
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();

        channel.append("System.out.println(");
        
        Expression expression = print.getExpression();
        Emitter expressionEmitter = EmitterFactory.getInstance().getEmitterForNode(expression);
        expressionEmitter.emit(expression, context);
        
        channel.append(");\n");
    }

}
