package com.quesoconcarne.scripture.java.runtime;

public class ScriptureException extends RuntimeException {

    public ScriptureException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScriptureException(String message) {
        super(message);
    }

}
