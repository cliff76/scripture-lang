package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Node;
import com.quesoconcarne.scripture.RunnableBackend;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import org.codehaus.janino.SimpleCompiler;

public class JavaTarget implements RunnableBackend {

    private File inputFile;
    private File outputFile;
    private EmitContext context = new EmitContext();

    public void emit(Node node) throws Exception {
        final SourceFile sourceFile = new SourceFile();
        final SourceChannel channel = new SourceChannel(null);

        sourceFile.pushChannel(channel);
        context.getOutput().pushSourceFile(sourceFile);
        context.setInputFile(getInputFile());
        EmitterFactory.getInstance().getEmitterForNode(node).emit(node, context);
    }

    public void run(Node node) throws Exception {
        emit(node);
        List<SourceFile> sourceFiles = context.getOutput().getSourceFiles();
        for (SourceFile file : sourceFiles) {
            String mainClassName = file.getPackageName() + "." + SourceFile.BOOTSTRAP_CLASS_NAME;
            String contents = file.getContents();
            
            SimpleCompiler compiler = new SimpleCompiler();
            compiler.cook(contents);
            Class<?> clazz = compiler.getClassLoader().loadClass(mainClassName);
            Method mainMethod = clazz.getDeclaredMethod("main", String[].class);
            try {
                mainMethod.invoke(null, new Object[]{new String[]{}});
            } catch (Exception e) {
                final Throwable cause = e.getCause();
                throw (Exception)cause;
            }
        }
    }

    public void setOutputFile(String outputPath) {
        if (outputPath == null) {
            throw new IllegalArgumentException("Parameter 'outputPath' cannot be null");
        }
        this.outputFile = new File(outputPath);
    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public File getOutputFile() {
        return outputFile;
    }

}
