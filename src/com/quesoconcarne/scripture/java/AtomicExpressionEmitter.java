package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.AtomicExpression;
import com.quesoconcarne.scripture.ScriptureLexer;
import com.quesoconcarne.scripture.java.runtime.ScriptureNumber;
import com.quesoconcarne.scripture.java.runtime.ScriptureRegex;
import com.quesoconcarne.scripture.java.runtime.ScriptureString;
import org.antlr.runtime.Token;

public class AtomicExpressionEmitter implements Emitter<AtomicExpression> {

    public void emit(AtomicExpression expression, EmitContext context) throws Exception {
        SourceChannel channel = context.getOutput().getCurrentSourceFile().getCurrentChannel();
        Token literal = expression.getLiteral();
        String text = literal.getText();
        
        final int tokenType = literal.getType();
        switch (tokenType) {
            case ScriptureLexer.STRING_LITERAL:
                channel.append("new ");
                channel.append(ScriptureString.class.getSimpleName());
                channel.append("(");
                channel.append(text);
                channel.append(")");
                break;
            case ScriptureLexer.INTEGER_LITERAL:
            case ScriptureLexer.REAL_LITERAL:
                channel.append("new ");
                channel.append(ScriptureNumber.class.getSimpleName());
                channel.append("(");
                channel.append(text);
                channel.append(")");
                break;
            case ScriptureLexer.IDENTIFIER:
                channel.append(text);
                break;
            case ScriptureLexer.REGEXP_LITERAL:
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
