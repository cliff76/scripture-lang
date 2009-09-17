package com.quesoconcarne.scripture;

public class ScriptureLexerException extends RuntimeException {

    private String text;
    private int line;
    private int column;

    public ScriptureLexerException(String text, int line, int column) {
        super(messageForTextLineAndColumn(text, line, column));
        this.text = text;
        this.line = line;
        this.column = column;
    }

    private static String messageForTextLineAndColumn(String text, int line, int column) {
        return "Invalid character at line " + line + " column " + column + ": " + text;
    }

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }

    public String getText() {
        return text;
    }

}
