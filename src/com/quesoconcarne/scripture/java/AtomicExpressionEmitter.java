package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.AtomicExpression;
import com.quesoconcarne.scripture.java.runtime.ScriptureNumber;
import com.quesoconcarne.scripture.java.runtime.ScriptureRegex;
import com.quesoconcarne.scripture.java.runtime.ScriptureString;
import com.quesoconcarne.scripture.ScriptureToken;

public class AtomicExpressionEmitter implements Emitter<AtomicExpression> {

    public void emit(AtomicExpression expression, EmitContext context) throws Exception {
        SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();
        ScriptureToken literal = expression.getLiteral();
        String text = literal.getLexeme();
        
        switch (literal.getType()) {
            case STRING_LITERAL:
                channel.append("new ");
                channel.append(ScriptureString.class.getSimpleName());
                channel.append("(");
                channel.append(text);
                channel.append(")");
                break;
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                channel.append("new ");
                channel.append(ScriptureNumber.class.getSimpleName());
                channel.append("(");
                channel.append(text);
                channel.append(")");
                break;
            case IDENTIFIER:
                channel.append(text);
                break;
            case REGEXP_LITERAL:
                String escapedRegex = text.replace("\"", "\\\"").replace("\\", "\\\\");
                channel.append("new ");
                channel.append(ScriptureRegex.class.getSimpleName());
                channel.append("(\"");
                channel.append(escapedRegex);
                channel.append("\")");
                break;
            default:
                throw new CompilerBugException("Unsupported atomic expression: " + text);
        }
    }

}
