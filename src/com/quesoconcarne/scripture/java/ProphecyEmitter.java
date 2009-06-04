package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Expression;
import com.quesoconcarne.scripture.Node;
import com.quesoconcarne.scripture.Prophecy;
import com.quesoconcarne.scripture.java.runtime.GenesisListener;
import com.quesoconcarne.scripture.java.runtime.ProphecyNotificationCenter;
import java.util.List;
import org.antlr.runtime.Token;

public class ProphecyEmitter implements Emitter<Prophecy> {

    public void emit(Prophecy prophecy, EmitContext context) throws Exception {
        // TODO: Implement expression prophecies.
        // TODO: Check if the prophecy is in a class.  If that is the case, then
        // the prophecy should only be an expression prophecy.
        final Expression expression = prophecy.getExpression();
        if (expression != null) {
            throw new CompilerBugException("Sorry, expression prophecies are not yet implemented.");
        }
        final Token alias = prophecy.getAlias();
        final List<Node> blockContents = prophecy.getBlockContents();

        final EmitOutput output = context.getOutput();
        final SourceFile sourceFile = output.getCurrentSourceFile();

        String prophecyName;
        if (alias != null) {
            prophecyName = alias.getText();
        }
        else {
            final int count = context.getCurrentAnonymousProphecyCounter();
            prophecyName = "AnonymousScriptureProphecy" + count;
            context.incrementAnonymousProphecyCounter();
        }
        final SourceChannel channel = new SourceChannel(prophecyName);

        sourceFile.pushChannel(channel);
        try {
            // Start class declaration
            channel.append("class ");
            channel.append(prophecyName);
            channel.append(" extends ");
            channel.append(GenesisListener.class.getSimpleName());
            channel.append(" {\n");
            channel.append("    private static final ");
            channel.append(prophecyName);
            channel.append(" INSTANCE = new ");
            channel.append(prophecyName);
            channel.append("();\n");

            // Constructor
            channel.append("    private ");
            channel.append(prophecyName);
            channel.append("() {\n");
            channel.append("        ");
            channel.append(ProphecyNotificationCenter.class.getSimpleName());
            channel.append(".getSharedInstance().");
            channel.append(ProphecyNotificationCenter.ADD_GENESIS_SUBSCRIBER_METHOD_NAME);
            channel.append("(this);\n    }\n");

            // Genesis start
            channel.append("    public void run() {\n");
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
            channel.append("    }\n");

            // End of class
            channel.append("}\n");
        }
        finally {
            sourceFile.popChannel();
        }
    }

}
