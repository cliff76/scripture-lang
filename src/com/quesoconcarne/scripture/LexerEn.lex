package com.quesoconcarne.scripture;

/**
 * This is the lexer class for all English locales.
 */
%%
%class LexerEn
%implements ScriptureLexer
%final
%unicode
%line
%column

%type ScriptureToken
%state STRING
%state REGEXP

%{
  StringBuffer stringLiteralBuffer = new StringBuffer();
%}

%eofval{
  return new ScriptureToken(ScriptureTokenType.EOF);
%eofval}

%%


/********** DO NOT LOCALIZE ABOVE THIS LINE *********/
/********** Begin localizable tokens **********/

<YYINITIAL> "false"        { return new ScriptureToken(ScriptureTokenType.FALSE, yytext(), yyline, yychar); }
<YYINITIAL> "true"         { return new ScriptureToken(ScriptureTokenType.TRUE, yytext(), yyline, yychar); }
<YYINITIAL> "amen"         { return new ScriptureToken(ScriptureTokenType.AMEN, yytext(), yyline, yychar); }
<YYINITIAL> "scripture"    { return new ScriptureToken(ScriptureTokenType.SCRIPTURE, yytext(), yyline, yychar); }
<YYINITIAL> "order"        { return new ScriptureToken(ScriptureTokenType.ORDER, yytext(), yyline, yychar); }
<YYINITIAL> "of"           { return new ScriptureToken(ScriptureTokenType.OF, yytext(), yyline, yychar); }
<YYINITIAL> "prophecy"     { return new ScriptureToken(ScriptureTokenType.PROPHECY, yytext(), yyline, yychar); }
<YYINITIAL> "genesis"      { return new ScriptureToken(ScriptureTokenType.GENESIS, yytext(), yyline, yychar); }
<YYINITIAL> "pray"         { return new ScriptureToken(ScriptureTokenType.PRAY, yytext(), yyline, yychar); }
<YYINITIAL> "preach"       { return new ScriptureToken(ScriptureTokenType.PREACH, yytext(), yyline, yychar); }
<YYINITIAL> "alias"        { return new ScriptureToken(ScriptureTokenType.ALIAS, yytext(), yyline, yychar); }
<YYINITIAL> "commandment"  { return new ScriptureToken(ScriptureTokenType.COMMANDMENT, yytext(), yyline, yychar); }
<YYINITIAL> "let there be" { return new ScriptureToken(ScriptureTokenType.CREATE, yytext(), yyline, yychar); }
<YYINITIAL> "creation"     { return new ScriptureToken(ScriptureTokenType.CREATION, yytext(), yyline, yychar); }
<YYINITIAL> "artifact"     { return new ScriptureToken(ScriptureTokenType.ARTIFACT, yytext(), yyline, yychar); }
<YYINITIAL> "if"           { return new ScriptureToken(ScriptureTokenType.IF, yytext(), yyline, yychar); }
<YYINITIAL> "else"         { return new ScriptureToken(ScriptureTokenType.ELSE, yytext(), yyline, yychar); }
<YYINITIAL> "and"          { return new ScriptureToken(ScriptureTokenType.AND, yytext(), yyline, yychar); }
<YYINITIAL> "or"           { return new ScriptureToken(ScriptureTokenType.OR, yytext(), yyline, yychar); }
<YYINITIAL> "xor"          { return new ScriptureToken(ScriptureTokenType.XOR, yytext(), yyline, yychar); }
<YYINITIAL> "not"          { return new ScriptureToken(ScriptureTokenType.NOT, yytext(), yyline, yychar); }
<YYINITIAL> "boolean"      { return new ScriptureToken(ScriptureTokenType.BOOLEAN, yytext(), yyline, yychar); }
<YYINITIAL> "integer"      { return new ScriptureToken(ScriptureTokenType.INTEGER, yytext(), yyline, yychar); }
<YYINITIAL> "real"         { return new ScriptureToken(ScriptureTokenType.REAL, yytext(), yyline, yychar); }
<YYINITIAL> "string"       { return new ScriptureToken(ScriptureTokenType.STRING, yytext(), yyline, yychar); }
<YYINITIAL> "regexp"       { return new ScriptureToken(ScriptureTokenType.REGEXP, yytext(), yyline, yychar); }

/* See the rest of non-localizable comparative operators below */
<YYINITIAL> "is"          { return new ScriptureToken(ScriptureTokenType.COMPARATIVE_OPERATOR, yytext(), yyline, yychar); }


/********** End localizable tokens **********/
/********** DO NOT LOCALIZE BELOW THIS LINE *********/

<YYINITIAL> [:digit:]+ | "0x"[0-9a-fA-F]+ { return new ScriptureToken(ScriptureTokenType.INTEGER_LITERAL, yytext(), yyline, yychar); }
<YYINITIAL> [:digit:]+"."[:digit:]+ { return new ScriptureToken(ScriptureTokenType.REAL_LITERAL, yytext(), yyline, yychar); }
<YYINITIAL> "@re(" [^\n\r]* ")re@" [im]{0,2} { return new ScriptureToken(ScriptureTokenType.REGEXP_LITERAL, yytext(), yyline, yychar); }
<YYINITIAL> [:jletter:] [:jletterdigit:]* { return new ScriptureToken(ScriptureTokenType.IDENTIFIER, yytext(), yyline, yychar); }

<YYINITIAL> \" { stringLiteralBuffer.setLength(0); stringLiteralBuffer.append(yytext()); yybegin(STRING); }
<STRING> {
  \"                             { stringLiteralBuffer.append(yytext()); yybegin(YYINITIAL); return new ScriptureToken(ScriptureTokenType.STRING_LITERAL, stringLiteralBuffer.toString(), yyline, yychar); }
  [^\n\r\"\\]+                   { stringLiteralBuffer.append(yytext()); }
  \\\"                           { stringLiteralBuffer.append(yytext()); }
  \\                             { stringLiteralBuffer.append('\\'); }
}

<YYINITIAL> [:] { return new ScriptureToken(ScriptureTokenType.DELIMITER, null, yyline, yychar); }
<YYINITIAL> [;] { return new ScriptureToken(ScriptureTokenType.SEMICOLON, null, yyline, yychar); }
<YYINITIAL> [=] { return new ScriptureToken(ScriptureTokenType.EQUAL, null, yyline, yychar); }
<YYINITIAL> \.  { return new ScriptureToken(ScriptureTokenType.DOT, null, yyline, yychar); }
<YYINITIAL> \,  { return new ScriptureToken(ScriptureTokenType.COMMA, null, yyline, yychar); }
<YYINITIAL> \(  { return new ScriptureToken(ScriptureTokenType.LEFT_PARENTHESIS, null, yyline, yychar); }
<YYINITIAL> \)  { return new ScriptureToken(ScriptureTokenType.RIGHT_PARENTHESIS, null, yyline, yychar); }
<YYINITIAL> \[  { return new ScriptureToken(ScriptureTokenType.LEFT_BRACKET, null, yyline, yychar); }
<YYINITIAL> \]  { return new ScriptureToken(ScriptureTokenType.RIGHT_BRACKET, null, yyline, yychar); }

<YYINITIAL> [+]                                   { return new ScriptureToken(ScriptureTokenType.ADDITION_OPERATOR, null, yyline, yychar); }
<YYINITIAL> [-]                                   { return new ScriptureToken(ScriptureTokenType.SUBTRACTION_OPERATOR, null, yyline, yychar); }
<YYINITIAL> [*]                                   { return new ScriptureToken(ScriptureTokenType.MULTIPLICATION_OPERATOR, null, yyline, yychar); }
<YYINITIAL> [/%]                                  { return new ScriptureToken(ScriptureTokenType.DIVISION_OPERATOR, yytext(), yyline, yychar); }
<YYINITIAL> "==" | "!=" | "<" | "<=" | ">" | ">=" { return new ScriptureToken(ScriptureTokenType.COMPARATIVE_OPERATOR, yytext(), yyline, yychar); }


<YYINITIAL> "#*" [^*] ~"*#" | "#*" "*"+ "#" { /* ignore */ }
<YYINITIAL> [#] [^\r\n]* (\r|\n|\r\n) { /* ignore */ }
<YYINITIAL> ([\ \n\r\t\f])+ { /* ignore */ }

.|\n { throw new ScriptureLexerException(yytext(), yyline, yychar); }
