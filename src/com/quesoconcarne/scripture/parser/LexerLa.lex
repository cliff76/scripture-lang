package com.quesoconcarne.scripture.parser;

/**
 * This is the lexer class for Latin.
 */
%%
%class LexerLa
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

<YYINITIAL> "falsus"          { return new ScriptureToken(ScriptureTokenType.FALSE, yytext(), yyline, yychar); }
<YYINITIAL> "verus"           { return new ScriptureToken(ScriptureTokenType.TRUE, yytext(), yyline, yychar); }
<YYINITIAL> "amen"            { return new ScriptureToken(ScriptureTokenType.AMEN, yytext(), yyline, yychar); }
<YYINITIAL> "scriptura"       { return new ScriptureToken(ScriptureTokenType.SCRIPTURE, yytext(), yyline, yychar); }
<YYINITIAL> "ordo"            { return new ScriptureToken(ScriptureTokenType.ORDER, yytext(), yyline, yychar); }
<YYINITIAL> "ex"              { return new ScriptureToken(ScriptureTokenType.OF, yytext(), yyline, yychar); }
<YYINITIAL> "professare"      { return new ScriptureToken(ScriptureTokenType.PROPHECY, yytext(), yyline, yychar); }
<YYINITIAL> "genesis"         { return new ScriptureToken(ScriptureTokenType.GENESIS, yytext(), yyline, yychar); }
<YYINITIAL> "resare"          { return new ScriptureToken(ScriptureTokenType.PRAY, yytext(), yyline, yychar); }
<YYINITIAL> "predicare"       { return new ScriptureToken(ScriptureTokenType.PREACH, yytext(), yyline, yychar); }
<YYINITIAL> "alias"           { return new ScriptureToken(ScriptureTokenType.ALIAS, yytext(), yyline, yychar); }
<YYINITIAL> "decalogus"       { return new ScriptureToken(ScriptureTokenType.COMMANDMENT, yytext(), yyline, yychar); }
<YYINITIAL> "creare"          { return new ScriptureToken(ScriptureTokenType.CREATE, yytext(), yyline, yychar); }
<YYINITIAL> "nihilo"          { return new ScriptureToken(ScriptureTokenType.CREATION, yytext(), yyline, yychar); }
<YYINITIAL> "artefactum"      { return new ScriptureToken(ScriptureTokenType.ARTIFACT, yytext(), yyline, yychar); }
<YYINITIAL> "si"              { return new ScriptureToken(ScriptureTokenType.IF, yytext(), yyline, yychar); }
<YYINITIAL> "sinon"           { return new ScriptureToken(ScriptureTokenType.ELSE, yytext(), yyline, yychar); }
<YYINITIAL> "et"              { return new ScriptureToken(ScriptureTokenType.AND, yytext(), yyline, yychar); }
<YYINITIAL> "aut"             { return new ScriptureToken(ScriptureTokenType.OR, yytext(), yyline, yychar); }
<YYINITIAL> "xaut"            { return new ScriptureToken(ScriptureTokenType.XOR, yytext(), yyline, yychar); }
<YYINITIAL> "non"             { return new ScriptureToken(ScriptureTokenType.NOT, yytext(), yyline, yychar); }
<YYINITIAL> "bool"            { return new ScriptureToken(ScriptureTokenType.BOOLEAN, yytext(), yyline, yychar); }
<YYINITIAL> "integrum"        { return new ScriptureToken(ScriptureTokenType.INTEGER, yytext(), yyline, yychar); }
<YYINITIAL> "rei"             { return new ScriptureToken(ScriptureTokenType.REAL, yytext(), yyline, yychar); }
<YYINITIAL> "catena"          { return new ScriptureToken(ScriptureTokenType.STRING, yytext(), yyline, yychar); }
<YYINITIAL> "regexp"          { return new ScriptureToken(ScriptureTokenType.REGEXP, yytext(), yyline, yychar); }

/* See the rest of non-localizable comparative operators below */
<YYINITIAL> "est"             { return new ScriptureToken(ScriptureTokenType.COMPARATIVE_OPERATOR, yytext(), yyline, yychar); }


/********** End localizable tokens **********/
/********** DO NOT LOCALIZE BELOW THIS LINE *********/

<YYINITIAL> [:digit:]+ | "0x"[0-9a-fA-F]+ { return new ScriptureToken(ScriptureTokenType.INTEGER_LITERAL, yytext(), yyline, yychar); }
<YYINITIAL> [:digit:]+"."[:digit:]+ { return new ScriptureToken(ScriptureTokenType.REAL_LITERAL, yytext(), yyline, yychar); }
<YYINITIAL> "/" ([^/]|"\\/")* "/" [im]{0,2} { return new ScriptureToken(ScriptureTokenType.REGEXP_LITERAL, yytext(), yyline, yychar); }
<YYINITIAL> [:jletter:] [:jletterdigit:]* { return new ScriptureToken(ScriptureTokenType.IDENTIFIER, yytext(), yyline, yychar); }

<YYINITIAL> \" { stringLiteralBuffer.setLength(0); stringLiteralBuffer.append(yytext()); yybegin(STRING); }
<STRING> {
  \"                             { stringLiteralBuffer.append(yytext()); yybegin(YYINITIAL); return new ScriptureToken(ScriptureTokenType.STRING_LITERAL, stringLiteralBuffer.toString(), yyline, yychar); }
  [^\n\r\"\\]+                   { stringLiteralBuffer.append(yytext()); }
  \\\"                           { stringLiteralBuffer.append(yytext()); }
  \\                             { stringLiteralBuffer.append('\\'); }
}

<YYINITIAL> [+]                                   { return new ScriptureToken(ScriptureTokenType.ADDITION_OPERATOR, null, yyline, yychar); }
<YYINITIAL> [-]                                   { return new ScriptureToken(ScriptureTokenType.SUBTRACTION_OPERATOR, null, yyline, yychar); }
<YYINITIAL> [*]                                   { return new ScriptureToken(ScriptureTokenType.MULTIPLICATION_OPERATOR, null, yyline, yychar); }
<YYINITIAL> [/%]                                  { return new ScriptureToken(ScriptureTokenType.DIVISION_OPERATOR, yytext(), yyline, yychar); }
<YYINITIAL> "==" | "!=" | "<" | "<=" | ">" | ">=" { return new ScriptureToken(ScriptureTokenType.COMPARATIVE_OPERATOR, yytext(), yyline, yychar); }


<YYINITIAL> "#*" [^*] ~"*#" | "#*" "*"+ "#" { /* ignore */ }
<YYINITIAL> [#] [^\r\n]* (\r|\n|\r\n) { /* ignore */ }
<YYINITIAL> ([\ \n\r\t\f])+ { /* ignore */ }

.|\n { throw new ScriptureLexerException(yytext(), yyline, yychar); }
