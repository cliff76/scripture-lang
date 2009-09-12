package com.quesoconcarne.scripture.parser;

import java.io.StringReader;
import junit.framework.TestCase;

public class LexerEnTest extends TestCase {

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
        testSingleRule("est", "est", ScriptureTokenType.COMPARATIVE_OPERATOR);
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

    private void testSingleRule(String input, ScriptureTokenType type) throws Exception {
        testSingleRule(input, input, type);
    }
    
    private void testSingleRule(String input, String lexeme, ScriptureTokenType type) throws Exception {
        final StringReader reader = new StringReader(input);
        final ScriptureLexer lexer = new LexerEn(reader);
        ScriptureToken token = lexer.yylex();
        assertNotNull(token);
        assertEquals(type, token.getType());
        assertEquals(lexeme, token.getText());
        assertEquals(0, token.getLine());
        assertEquals(0, token.getCharacter());
    }

    protected String getAlias() {
        return "alias";
    }

    protected String getAmen() {
        return "amen";
    }

    protected String getAnd() {
        return "and";
    }

    protected String getArtifact() {
        return "artifact";
    }

    protected String getBoolean() {
        return "boolean";
    }

    protected String getCommandment() {
        return "commandment";
    }

    protected String getCreate() {
        return "let there be";
    }

    protected String getCreation() {
        return "creation";
    }

    protected String getElse() {
        return "else";
    }

    protected String getFalse() {
        return "false";
    }

    protected String getGenesis() {
        return "genesis";
    }

    protected String getIf() {
        return "if";
    }

    protected String getInteger() {
        return "integer";
    }

    protected String getNot() {
        return "not";
    }

    protected String getOf() {
        return "of";
    }

    protected String getOr() {
        return "or";
    }

    protected String getOrder() {
        return "order";
    }

    protected String getPray() {
        return "pray";
    }

    protected String getPreach() {
        return "preach";
    }

    protected String getProphecy() {
        return "prophecy";
    }

    protected String getReal() {
        return "real";
    }

    protected String getRegexp() {
        return "regexp";
    }

    protected String getScripture() {
        return "scripture";
    }

    protected String getString() {
        return "string";
    }

    protected String getTrue() {
        return "true";
    }

    protected String getXor() {
        return "xor";
    }

}
