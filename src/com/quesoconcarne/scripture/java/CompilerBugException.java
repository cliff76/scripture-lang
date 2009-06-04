package com.quesoconcarne.scripture.java;

public class CompilerBugException extends RuntimeException {

    public CompilerBugException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompilerBugException(String message) {
        super(message);
    }

}
