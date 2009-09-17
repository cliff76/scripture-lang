package com.quesoconcarne.scripture;

public interface ScriptureLexer {

    ScriptureToken yylex() throws java.io.IOException;
    void yyreset(java.io.Reader reader);

}
