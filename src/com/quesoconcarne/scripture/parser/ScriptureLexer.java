package com.quesoconcarne.scripture.parser;

public interface ScriptureLexer {

    ScriptureToken yylex() throws java.io.IOException;
    void yyreset(java.io.Reader reader);

}
