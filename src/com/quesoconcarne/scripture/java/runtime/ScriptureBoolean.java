package com.quesoconcarne.scripture.java.runtime;

public class ScriptureBoolean extends ScriptureObject {

    public static final ScriptureBoolean TRUE = new ScriptureBoolean(true);
    public static final ScriptureBoolean FALSE = new ScriptureBoolean(false);
    
    private boolean value;

    public ScriptureBoolean(boolean value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object rhs) {
        if (rhs instanceof ScriptureBoolean) {
            ScriptureBoolean otherNumber = (ScriptureBoolean) rhs;
            Boolean boolValue = value;
            return boolValue.compareTo(otherNumber.value);
        }
        return this.hashCode() - rhs.hashCode();
    }

    @Override
    public ScriptureObject add(ScriptureObject rhs) {
        return super.add(rhs);
    }

    @Override
    public boolean booleanValue() {
        return value;
    }

    @Override
    public ScriptureObject multiply(ScriptureObject rhs) {
        return super.multiply(rhs);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ScriptureBoolean other = (ScriptureBoolean) obj;
        if (this.value != other.value) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Boolean.valueOf(value).hashCode();
    }

    @Override
    public String toString() {
        return Boolean.valueOf(value).toString();
    }

    public static ScriptureBoolean valueOf(boolean value) {
        return value ? TRUE : FALSE;
    }

}
