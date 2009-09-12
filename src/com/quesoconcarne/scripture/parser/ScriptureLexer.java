package com.quesoconcarne.scripture.parser;

public interface ScriptureLexer {

    ScriptureToken yylex() throws java.io.IOException;

}
