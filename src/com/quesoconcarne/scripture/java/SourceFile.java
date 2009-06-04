package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.java.runtime.ProphecyNotificationCenter;
import com.quesoconcarne.scripture.java.runtime.ScriptureObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SourceFile {

    public static final String BOOTSTRAP_CLASS_NAME = "ScriptureBootstrap";

    private String packageName;
    private List<SourceChannel> channelList = new ArrayList<SourceChannel>();
    private Stack<SourceChannel> channelStack = new Stack<SourceChannel>();

    public SourceFile() {
        super();
    }

    public String getContents() throws IOException {
        SourceChannel output = new SourceChannel(null);
        final String pkg = getPackageName();
        if (pkg != null) {
            output.append("package ");
            output.append(pkg);
            output.append(";\n");
        }

        output.append("import ");
        output.append(ScriptureObject.class.getPackage().getName());
        output.append(".*;\n");

        output.append("public class ");
        output.append(BOOTSTRAP_CLASS_NAME);
        output.append(" {\n");
        output.append("    public static void main(String[] args) {\n");

        output.append("        // Trigger all the inner classes' static initialization.\n");
        for (SourceChannel sourceChannel : channelList) {
            final String className = sourceChannel.getClassName();
            if (className != null) {
                output.append("        ");
                output.append(className);
                output.append(".class.getName();\n");
            }
        }
        output.append("        ");
        output.append(ProphecyNotificationCenter.class.getSimpleName());
        output.append(".getSharedInstance().startGenesis();\n");
        output.append("    }\n");
        output.append("}\n");

        for (SourceChannel currentChannel : channelList) {
            output.append(currentChannel.toString());
        }

        return output.toString();
    }

    public void pushChannel(SourceChannel channel) {
        if (!channelList.contains(channel)) {
            channelList.add(channel);
        }
        channelStack.push(channel);
    }

    public SourceChannel popChannel() {
        return channelStack.pop();
    }

    public SourceChannel getCurrentChannel() {
        return channelStack.peek();
    }

    public String getPackageName() {
        if (packageName == null) {
            return "scripture.anonymous";
        }
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getName() {
        return BOOTSTRAP_CLASS_NAME;
    }

}
