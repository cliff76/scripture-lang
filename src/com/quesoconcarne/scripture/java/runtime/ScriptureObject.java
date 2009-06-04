package com.quesoconcarne.scripture.java.runtime;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ScriptureObject implements Comparable {

    public static final String BINARY_EXPRESSION_METHOD_NAME = "doBinaryExpression";

    public ScriptureObject add(ScriptureObject rhs) {
        throw new ScriptureException("Operation not supported.");
    }

    public ScriptureObject subtract(ScriptureObject rhs) {
        throw new ScriptureException("Operation not supported.");
    }

    public ScriptureObject multiply(ScriptureObject rhs) {
        throw new ScriptureException("Operation not supported.");
    }

    public ScriptureObject divide(ScriptureObject rhs) {
        throw new ScriptureException("Operation not supported.");
    }

    public ScriptureObject modulus(ScriptureObject rhs) {
        throw new ScriptureException("Operation not supported.");
    }

    public int compareTo(Object rhs) {
        throw new ScriptureException("Operation not supported.");
    }

    public boolean booleanValue() {
        return true;
    }

    protected Method getMethodForKey(String key) {
        try {
            return getClass().getDeclaredMethod(key);
        } catch (NoSuchMethodException ex) {
            return null;
        } catch (SecurityException ex) {
            return null;
        }
    }

}
