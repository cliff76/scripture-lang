package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.BooleanExpression;
import com.quesoconcarne.scripture.Expression;
import com.quesoconcarne.scripture.ScriptureLexer;
import com.quesoconcarne.scripture.java.runtime.ScriptureBoolean;
import org.antlr.runtime.Token;

public class BooleanExpressionEmitter implements Emitter<BooleanExpression> {

    public void emit(BooleanExpression node, EmitContext context) throws Exception {
        final SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();
        final Boolean constant = node.getValue();
        if (constant == null) {
            final Expression left = node.getLeft();
            final Token operator = node.getOperator();
            final Expression right = node.getRight();

            if (left == null) {
                // Assume negation.
                handleNegation(context, channel, right);
            }
            else {
                handleBinary(context, channel, left, operator, right);
            }
        }
        else {
            // Constant verus/falsus expression.
            channel.append(ScriptureBoolean.class.getSimpleName());
            channel.append(".valueOf(");
            channel.append(constant.toString());
            channel.append(")");
        }
    }

    /**
     * Emits code for a traditional binary boolean expression,
     * e.g. (true and false)
     * @param context {@link EmitContext}
     * @param channel {@link SourceChannel}
     * @param left {@link Expression}
     * @param operator {@link Token}
     * @param right {@link Expression}
     * @throws java.lang.Exception
     */
    private void handleBinary(EmitContext context, SourceChannel channel, Expression left, Token operator, Expression right) throws Exception {
        // Open parenthesis for the entire expression.
        channel.append("new ");
        channel.append(ScriptureBoolean.class.getSimpleName());
        channel.append("(");
        // Parenthesis for the left expression.
        channel.append("(");
        EmitterFactory.getInstance().getEmitterForNode(left).emit(left, context);
        channel.append(").booleanValue()");
        switch (operator.getType()) {
            case ScriptureLexer.AND:
                channel.append(" && ");
                break;
            case ScriptureLexer.OR:
                channel.append(" || ");
                break;
            case ScriptureLexer.XOR:
                channel.append(" ^ ");
                break;
            case ScriptureLexer.NOT:
                channel.append(" && ");
                break;
        }
        // Parenthesis for the right expression.
        channel.append("(");
        EmitterFactory.getInstance().getEmitterForNode(right).emit(right, context);
        channel.append(").booleanValue()");
        // Close parenthesis for the entire expression.
        channel.append(")");
    }

    /**
     * Emits code for a boolean unary expression (most likely something like
     * !expr).
     * @param context {@link EmitContext}
     * @param channel {@link SourceChannel}
     * @param operator {@link Token}
     * @param right {@link Expression}
     */
    private void handleNegation(EmitContext context, SourceChannel channel, Expression right) throws Exception {

        // Open parenthesis for the entire expression.
        channel.append("new ");
        channel.append(ScriptureBoolean.class.getSimpleName());
        channel.append("(!");

        // Parenthesis for the right expression.
        channel.append("(");
        EmitterFactory.getInstance().getEmitterForNode(right).emit(right, context);
        channel.append(").booleanValue()");

        // Close parenthesis for the entire expression.
        channel.append(")");
    }

}
