package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.PrayStatement;

public class PrayStatementEmitter implements Emitter<PrayStatement> {

    public void emit(PrayStatement pray, EmitContext context) throws Exception {
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();

        channel.append("try { ");
        channel.append("Thread.sleep(((ScriptureNumber)");

        Expression expression = pray.getExpression();
        Emitter expressionEmitter = EmitterFactory.getInstance().getEmitterForNode(expression);
        expressionEmitter.emit(expression, context);

        channel.append(").getValue().intValue());\n");
        channel.append("} catch (InterruptedException e) { throw new RuntimeException(e); }\n");
    }

}
