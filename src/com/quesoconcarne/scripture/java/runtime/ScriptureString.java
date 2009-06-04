package com.quesoconcarne.scripture.java.runtime;

public final class ScriptureString extends ScriptureObject {

    private String value;

    public ScriptureString(String value) {
        if (value == null) {
            value = "";
        }
        this.value = value;
    }

    @Override
    public ScriptureObject add(ScriptureObject rhs) {
        return new ScriptureString(value + rhs);
    }

    @Override
    public ScriptureObject multiply(ScriptureObject rhs) {
        return super.multiply(rhs);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScriptureString) {
            ScriptureString other = (ScriptureString) obj;
            return value.equals(other.value);
        }
        return value.equals(obj.toString());
    }

    @Override
    public boolean booleanValue() {
        return value.trim().length() > 0;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
