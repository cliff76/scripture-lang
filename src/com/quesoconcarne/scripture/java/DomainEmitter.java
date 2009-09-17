package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Domain;
import com.quesoconcarne.scripture.ast.Node;
import java.util.List;

public class DomainEmitter implements Emitter<Domain> {

    public void emit(Domain domain, EmitContext context) throws Exception {
        final SourceFile sourceFile = context.getOutput().getCurrentSourceFile();

        List<String> nameSegments = domain.getNameSegmentStrings();
        String packageName = ListUtilities.join(nameSegments, ".");
        sourceFile.setPackageName(packageName);

        context.pushContainer(domain);
        try {
            final List blockContents = domain.getChildren();
            for (Object object : blockContents) {
                Node currentNode = (Node) object;
                Emitter emitter = EmitterFactory.getInstance().getEmitterForNode(currentNode);
                emitter.emit(currentNode, context);
            }
        }
        finally {
            context.popContainer();
        }
    }

}
