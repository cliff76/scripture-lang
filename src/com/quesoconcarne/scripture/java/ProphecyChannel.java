package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.java.runtime.GenesisListener;
import com.quesoconcarne.scripture.java.runtime.ProphecyNotificationCenter;

public class ProphecyChannel extends SourceChannel {

    public ProphecyChannel(String name) {
        super(name);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        final String className = getClassName();
        final String contents = super.toString();

        // Class declaration
        out.append("public class ");
        out.append(className);
        out.append(" extends ");
        out.append(GenesisListener.class.getSimpleName());
        out.append(" {\n");

        // Shared instance.
        out.append("    private static final ");
        out.append(className);
        out.append(" INSTANCE = new ");
        out.append(className);
        out.append("();\n");
        
        // Private constructor
        out.append("    private "); out.append(className); out.append("() {\n");
        out.append("        "); out.append(ProphecyNotificationCenter.class.getSimpleName()); out.append(".getSharedInstance()."); out.append(ProphecyNotificationCenter.ADD_GENESIS_SUBSCRIBER_METHOD_NAME); out.append("(this);\n");
        out.append("    }\n");

        // Genesis start
        out.append("    public void run() {\n");
        out.append(contents);
        out.append("    }\n");

        // Close class
        out.append("}\n");
        
        return out.toString();
    }

}
