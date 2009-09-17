package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.ComparativeExpression;
import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.java.runtime.ScriptureBoolean;
import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.HashMap;
import java.util.Map;

public class ComparativeExpressionEmitter implements Emitter<ComparativeExpression>{

    /**
     * Translates from a Scripture comparisson operator to a Java
     * {@link Comparable#compareTo(java.lang.Object)} result analysis operator.
     */
    private static final Map<String, String> OPERATOR_MAP = new HashMap<String, String>();
    static {
        OPERATOR_MAP.put("==", "== 0");
        OPERATOR_MAP.put("!=", "!= 0");
        OPERATOR_MAP.put("<" , "<  0");
        OPERATOR_MAP.put("<=", "<= 0");
        OPERATOR_MAP.put(">" , ">  0");
        OPERATOR_MAP.put(">=", ">= 0");
    }

    public void emit(ComparativeExpression node, EmitContext context) throws Exception {
        final Expression left = node.getLeft();
        final ScriptureToken operator = node.getOperator();
        final Expression right = node.getRight();
        final EmitOutput output = context.getOutput();
        final SourceFile sourceFile = output.getCurrentSourceFile();
        final SourceChannel channel = sourceFile.getCurrentChannel();
        final EmitterFactory factory = EmitterFactory.getInstance();
        
        final String expectedCompareToResult = OPERATOR_MAP.get(operator.getLexeme());
        if (expectedCompareToResult == null) {
            // Perform a Java object ==.
            
        }
        else {
            // Do a compareTo and decide according to the operator.
            channel.append("new ");
            channel.append(ScriptureBoolean.class.getSimpleName());
            channel.append("(");
            
            factory.getEmitterForNode(left).emit(left, context);
            channel.append(".compareTo(");
            factory.getEmitterForNode(right).emit(right, context);
            channel.append(") ");
            channel.append(expectedCompareToResult);

            // Close the new ScriptureBoolean constructor call.
            channel.append(") ");
        }
    }

}
