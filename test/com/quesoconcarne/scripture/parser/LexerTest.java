package com.quesoconcarne.scripture.parser;

import java.io.StringReader;
import junit.framework.TestCase;

public abstract class LexerTest extends TestCase {

    protected abstract String getEst();
    protected abstract String getAlias();
    protected abstract String getAmen();
    protected abstract String getAnd();
    protected abstract String getArtifact();
    protected abstract String getBoolean();
    protected abstract String getCommandment();
    protected abstract String getCreate();
    protected abstract String getCreation();
    protected abstract String getElse();
    protected abstract String getFalse();
    protected abstract String getGenesis();
    protected abstract String getIf();
    protected abstract String getInteger();
    protected abstract String getNot();
    protected abstract String getOf();
    protected abstract String getOr();
    protected abstract String getOrder();
    protected abstract String getPray();
    protected abstract String getPreach();
    protected abstract String getProphecy();
    protected abstract String getReal();
    protected abstract String getRegexp();
    protected abstract String getScripture();
    protected abstract String getString();
    protected abstract String getTrue();
    protected abstract String getXor();
    
    public void testKeywords() throws Exception {
        testSingleRule(getFalse(), ScriptureTokenType.FALSE);
        testSingleRule(getTrue(), ScriptureTokenType.TRUE);
        testSingleRule(getAmen(), ScriptureTokenType.AMEN);
        testSingleRule(getScripture(), ScriptureTokenType.SCRIPTURE);
        testSingleRule(getOrder(), ScriptureTokenType.ORDER);
        testSingleRule(getOf(), ScriptureTokenType.OF);
        testSingleRule(getProphecy(), ScriptureTokenType.PROPHECY);
        testSingleRule(getGenesis(), ScriptureTokenType.GENESIS);
        testSingleRule(getPray(), ScriptureTokenType.PRAY);
        testSingleRule(getPreach(), ScriptureTokenType.PREACH);
        testSingleRule(getAlias(), ScriptureTokenType.ALIAS);
        testSingleRule(getCommandment(), ScriptureTokenType.COMMANDMENT);
        testSingleRule(getCreate(), ScriptureTokenType.CREATE);
        testSingleRule(getCreation(), ScriptureTokenType.CREATION);
        testSingleRule(getArtifact(), ScriptureTokenType.ARTIFACT);
        testSingleRule(getIf(), ScriptureTokenType.IF);
        testSingleRule(getElse(), ScriptureTokenType.ELSE);
        testSingleRule(getAnd(), ScriptureTokenType.AND);
        testSingleRule(getOr(), ScriptureTokenType.OR);
        testSingleRule(getXor(), ScriptureTokenType.XOR);
        testSingleRule(getNot(), ScriptureTokenType.NOT);
        testSingleRule(getBoolean(), ScriptureTokenType.BOOLEAN);
        testSingleRule(getInteger(), ScriptureTokenType.INTEGER);
        testSingleRule(getReal(), ScriptureTokenType.REAL);
        testSingleRule(getString(), ScriptureTokenType.STRING);
        testSingleRule(getRegexp(), ScriptureTokenType.REGEXP);
    }

    public void testSimpleLiterals() throws Exception {
        testSingleRule("1234567890", ScriptureTokenType.INTEGER_LITERAL);
        testSingleRule("0xabcdef1234567890", ScriptureTokenType.INTEGER_LITERAL);
        testSingleRule("1.2", ScriptureTokenType.REAL_LITERAL);
    }

    public void testOperators() throws Exception {
        testSingleRule(getEst(), getEst(), ScriptureTokenType.COMPARATIVE_OPERATOR);
        testSingleRule("==", "==", ScriptureTokenType.COMPARATIVE_OPERATOR);
        testSingleRule("!=", "!=", ScriptureTokenType.COMPARATIVE_OPERATOR);
        testSingleRule("<", "<", ScriptureTokenType.COMPARATIVE_OPERATOR);
        testSingleRule("<=", "<=", ScriptureTokenType.COMPARATIVE_OPERATOR);
        testSingleRule(">", ">", ScriptureTokenType.COMPARATIVE_OPERATOR);
        testSingleRule(">=", ">=", ScriptureTokenType.COMPARATIVE_OPERATOR);

        testSingleRule("+", null, ScriptureTokenType.ADDITION_OPERATOR);
        testSingleRule("-", null, ScriptureTokenType.SUBTRACTION_OPERATOR);
        testSingleRule("*", null, ScriptureTokenType.MULTIPLICATION_OPERATOR);
        testSingleRule("/", "/", ScriptureTokenType.DIVISION_OPERATOR);
        testSingleRule("%", "%", ScriptureTokenType.DIVISION_OPERATOR);
    }

    public void testRegexpLiteral() throws Exception {
        testSingleRule("/abc/", ScriptureTokenType.REGEXP_LITERAL);
        testSingleRule("/a\\/bc/", ScriptureTokenType.REGEXP_LITERAL);
        testSingleRule("/abc/i", ScriptureTokenType.REGEXP_LITERAL);
        testSingleRule("/abc/m", ScriptureTokenType.REGEXP_LITERAL);
        testSingleRule("/abc/im", ScriptureTokenType.REGEXP_LITERAL);
    }

    public void testStringLiteral() throws Exception {
        testSingleRule("\"This is a simple string.\"", ScriptureTokenType.STRING_LITERAL);
        testSingleRule("\"This is string\\nwith a newline.\"", ScriptureTokenType.STRING_LITERAL);
        testSingleRule("\"This is string\\\\with an excaped backslash.\"", ScriptureTokenType.STRING_LITERAL);
        testSingleRule("\"This is string with an escaped \\\".\"", ScriptureTokenType.STRING_LITERAL);
    }

    public void testIgnoreRules() throws Exception {
        testSingleRule("# this is a single-line comment.\n", null, ScriptureTokenType.EOF);
        testSingleRule("#*\nthis is a\nmulti-line comment.\n*#", null, ScriptureTokenType.EOF);
        testSingleRule(" \t  ", null, ScriptureTokenType.EOF);
    }

    protected void testSingleRule(String input, ScriptureTokenType type) throws Exception {
        testSingleRule(input, input, type);
    }

    protected void testSingleRule(String input, String lexeme, ScriptureTokenType type) throws Exception {
        final StringReader reader = new StringReader(input);
        final ScriptureLexer lexer = new LexerEn(reader);
        ScriptureToken token = lexer.yylex();
        assertNotNull(token);
        assertEquals(type, token.getType());
        assertEquals(lexeme, token.getText());
        assertEquals(0, token.getLine());
        assertEquals(0, token.getCharacter());
    }

}
