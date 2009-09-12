package com.quesoconcarne.scripture.parser;

public class ScriptureToken {
    private ScriptureTokenType type;
    private String text;
    private int line;
    private int character;

    public ScriptureToken(ScriptureTokenType type) {
        this(type, null, 0, 0);
    }

    public ScriptureToken(ScriptureTokenType type, int line, int character) {
        this(type, null, line, character);
    }

    public ScriptureToken(ScriptureTokenType type, String text, int line, int character) {
        this.type = type;
        this.text = text;
        this.line = line;
        this.character = character;
    }

    public int getCharacter() {
        return character;
    }

    public int getLine() {
        return line;
    }

    public String getText() {
        return text;
    }

    public ScriptureTokenType getType() {
        return type;
    }

}
