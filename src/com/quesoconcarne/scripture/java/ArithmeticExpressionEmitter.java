package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.BinaryExpression;
import com.quesoconcarne.scripture.Expression;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.Token;

// TODO: Rename to arithmetic expression emitter.
public class ArithmeticExpressionEmitter implements Emitter<BinaryExpression> {

    private static final Map<String, String> OPERATOR_MAP = new HashMap<String, String>();
    static {
        OPERATOR_MAP.put("+", "add");
        OPERATOR_MAP.put("-", "subtract");
        OPERATOR_MAP.put("*", "multiply");
        OPERATOR_MAP.put("/", "divide");
        OPERATOR_MAP.put("%", "modulus");
    }

    public void emit(BinaryExpression node, EmitContext context) throws Exception {
        final Expression left = node.getLeft();
        final Token operator = node.getOperator();
        final Expression right = node.getRight();
        final EmitOutput output = context.getOutput();
        final SourceFile sourceFile = output.getCurrentSourceFile();
        final SourceChannel channel = sourceFile.getCurrentChannel();
        final EmitterFactory factory = EmitterFactory.getInstance();

        // The left emitter should output a scripture object who will then receive
        // a message that corresponds to the operator and the parameter will be
        // the output of the expression on the right.
        factory.getEmitterForNode(left).emit(left, context);
        channel.append(".");

        final String operatorLexeme = operator.getText();
        final String methodName = OPERATOR_MAP.get(operatorLexeme);
        if (methodName == null) {
            throw new CompilerBugException("Unsupported operator lexeme: " + operatorLexeme);
        }
        channel.append(methodName);
        
        // The expression on the right is the parameter of the message sent to
        // the right expression's ScriptObject instance.
        channel.append("(");
        factory.getEmitterForNode(right).emit(right, context);
        channel.append(")");
    }

}
