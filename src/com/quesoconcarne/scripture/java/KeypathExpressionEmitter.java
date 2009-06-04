package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Expression;
import com.quesoconcarne.scripture.KeypathExpression;
import com.quesoconcarne.scripture.java.runtime.KeyValueCoding;
import org.antlr.runtime.Token;

public class KeypathExpressionEmitter implements Emitter<KeypathExpression> {

    public void emit(KeypathExpression keypath, EmitContext context) throws Exception {
        final EmitterFactory factory = EmitterFactory.getInstance();
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();
        final Expression receiver = keypath.getLeft();
        final Token key = keypath.getKey();
        // TODO: Consider supporting delimiters other than '.'
        channel.append(KeyValueCoding.class.getSimpleName());
        channel.append(".valueForKey((");
        factory.getEmitterForNode(receiver).emit(receiver, context);
        channel.append("), \"");
        channel.append(key.getText());
        channel.append("\")");
    }

}
