package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Artifact;
import com.quesoconcarne.scripture.Expression;
import com.quesoconcarne.scripture.java.runtime.ScriptureObject;
import org.antlr.runtime.Token;

public class ArtifactEmitter implements Emitter<Artifact> {

    public void emit(Artifact node, EmitContext context) throws Exception {
        final Expression value = node.getValue();
        if (value == null) {
            return;
        }
        final Token name = node.getName();
        String typeName = value.getTypeName();
        if (typeName == null) {
            typeName = ScriptureObject.class.getSimpleName();
        }
        final EmitOutput output = context.getOutput();
        final SourceChannel channel = output.getCurrentSourceFile().getCurrentChannel();
        channel.append(typeName);
        channel.append(" ");
        channel.append(name.getText());
        channel.append(" = ");
        EmitterFactory.getInstance().getEmitterForNode(value).emit(value, context);
        channel.append(";\n");
    }

}
