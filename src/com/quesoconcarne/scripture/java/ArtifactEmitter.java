package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Artifact;
import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.java.runtime.ScriptureObject;
import com.quesoconcarne.scripture.parser.ScriptureToken;

public class ArtifactEmitter implements Emitter<Artifact> {

    public void emit(Artifact node, EmitContext context) throws Exception {
        final Expression value = node.getValue();
        if (value == null) {
            return;
        }
        final ScriptureToken name = node.getName();
        String typeName = value.getTypeName();
        if (typeName == null) {
            typeName = ScriptureObject.class.getSimpleName();
        }
        final EmitOutput output = context.getOutput();
        final SourceChannel channel = output.getCurrentSourceFile().getCurrentChannel();
        channel.append(typeName);
        channel.append(" ");
        channel.append(name.getLexeme());
        channel.append(" = ");
        EmitterFactory.getInstance().getEmitterForNode(value).emit(value, context);
        channel.append(";\n");
    }

}
