package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.Node;
import com.quesoconcarne.scripture.ast.Prophecy;
import com.quesoconcarne.scripture.parser.ScriptureToken;
import java.util.List;

public class ProphecyEmitter implements Emitter<Prophecy> {

    public void emit(Prophecy prophecy, EmitContext context) throws Exception {
        // TODO: Implement expression prophecies.
        // TODO: Check if the prophecy is in a class.  If that is the case, then
        // the prophecy should only be an expression prophecy.
        final Expression expression = prophecy.getExpression();
        if (expression != null) {
            throw new CompilerBugException("Sorry, expression prophecies are not yet implemented.");
        }
        final ScriptureToken alias = prophecy.getAlias();
        final List<? extends Node> blockContents = prophecy.getChildren();

        final EmitOutput output = context.getOutput();
        final SourceFile sourceFile = output.getCurrentSourceFile();

        String prophecyName;
        if (alias != null) {
            prophecyName = alias.getLexeme();
        }
        else {
            final int count = context.getCurrentAnonymousProphecyCounter();
            prophecyName = "AnonymousScriptureProphecy" + count;
            context.incrementAnonymousProphecyCounter();
        }
        
        final SourceChannel channel = new ProphecyChannel(prophecyName);
        sourceFile.pushChannel(channel);
        try {
            final EmitterFactory factory = EmitterFactory.getInstance();
            context.pushContainer(prophecy);
            try {
                for (Node currentNode : blockContents) {
                    factory.getEmitterForNode(currentNode).emit(currentNode, context);
                }
            }
            finally {
                context.popContainer();
            }
        }
        finally {
            sourceFile.popChannel();
        }
    }

}
