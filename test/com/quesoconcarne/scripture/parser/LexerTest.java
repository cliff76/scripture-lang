package com.quesoconcarne.scripture.parser;

import java.io.StringReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import junit.framework.TestCase;

public abstract class LexerTest extends TestCase {

    protected abstract ScriptureLexer getLexer();
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
        testSingleRule("@re(abc)re@", ScriptureTokenType.REGEXP_LITERAL);
        testSingleRule("@re(abc)re@i", ScriptureTokenType.REGEXP_LITERAL);
        testSingleRule("@re(abc)re@m", ScriptureTokenType.REGEXP_LITERAL);
        testSingleRule("@re(abc)re@im", ScriptureTokenType.REGEXP_LITERAL);
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

    public void testAllTokens() throws Exception {
        Map<String, ScriptureTokenType> map = new TreeMap<String, ScriptureTokenType>();
        map.put("\"Some string\"", ScriptureTokenType.STRING_LITERAL);
        map.put("@re(myregexp)re@mi", ScriptureTokenType.REGEXP_LITERAL);
        map.put("==", ScriptureTokenType.COMPARATIVE_OPERATOR);
        map.put("!=", ScriptureTokenType.COMPARATIVE_OPERATOR);
        map.put("<", ScriptureTokenType.COMPARATIVE_OPERATOR);
        map.put("<=", ScriptureTokenType.COMPARATIVE_OPERATOR);
        map.put(">", ScriptureTokenType.COMPARATIVE_OPERATOR);
        map.put(">=", ScriptureTokenType.COMPARATIVE_OPERATOR);
        map.put(getEst(), ScriptureTokenType.COMPARATIVE_OPERATOR);

        map.put("+", ScriptureTokenType.ADDITION_OPERATOR);
        map.put("-", ScriptureTokenType.SUBTRACTION_OPERATOR);
        map.put("*", ScriptureTokenType.MULTIPLICATION_OPERATOR);
        map.put("/", ScriptureTokenType.DIVISION_OPERATOR);
        map.put("%", ScriptureTokenType.DIVISION_OPERATOR);
        
        map.put("1234567890", ScriptureTokenType.INTEGER_LITERAL);
        map.put("0xabcdef1234567890", ScriptureTokenType.INTEGER_LITERAL);
        map.put("1.2", ScriptureTokenType.REAL_LITERAL);

        map.put(getFalse(), ScriptureTokenType.FALSE);
        map.put(getTrue(), ScriptureTokenType.TRUE);
        map.put(getAmen(), ScriptureTokenType.AMEN);
        map.put(getScripture(), ScriptureTokenType.SCRIPTURE);
        map.put(getOrder(), ScriptureTokenType.ORDER);
        map.put(getOf(), ScriptureTokenType.OF);
        map.put(getProphecy(), ScriptureTokenType.PROPHECY);
        map.put(getGenesis(), ScriptureTokenType.GENESIS);
        map.put(getPray(), ScriptureTokenType.PRAY);
        map.put(getPreach(), ScriptureTokenType.PREACH);
        map.put(getAlias(), ScriptureTokenType.ALIAS);
        map.put(getCommandment(), ScriptureTokenType.COMMANDMENT);
        map.put(getCreate(), ScriptureTokenType.CREATE);
        map.put(getCreation(), ScriptureTokenType.CREATION);
        map.put(getArtifact(), ScriptureTokenType.ARTIFACT);
        map.put(getIf(), ScriptureTokenType.IF);
        map.put(getElse(), ScriptureTokenType.ELSE);
        map.put(getAnd(), ScriptureTokenType.AND);
        map.put(getOr(), ScriptureTokenType.OR);
        map.put(getXor(), ScriptureTokenType.XOR);
        map.put(getNot(), ScriptureTokenType.NOT);
        map.put(getBoolean(), ScriptureTokenType.BOOLEAN);
        map.put(getInteger(), ScriptureTokenType.INTEGER);
        map.put(getReal(), ScriptureTokenType.REAL);
        map.put(getString(), ScriptureTokenType.STRING);
        map.put(getRegexp(), ScriptureTokenType.REGEXP);
        
        final Set<String> keys = map.keySet();
        final StringBuilder sourceCode = new StringBuilder();
        final Iterator<String> sourceKeysIterator = keys.iterator();
        if (sourceKeysIterator.hasNext()) {
            sourceCode.append(sourceKeysIterator.next());
        }
        
        while (sourceKeysIterator.hasNext()) {
            sourceCode.append("\n");
            sourceCode.append(sourceKeysIterator.next());
        }

        final ScriptureLexer lexer = getLexer();
        final StringReader reader = new StringReader(sourceCode.toString());
        lexer.yyreset(reader);
        final Iterator<String> tokenKeysIterator = keys.iterator();
        while (tokenKeysIterator.hasNext()) {
            final String currentKey = tokenKeysIterator.next();
            final ScriptureToken currentToken = lexer.yylex();
            final String currentLexeme = currentToken.getText();
            if (currentLexeme != null) {
                assertEquals(currentKey,currentLexeme);
            }
            assertEquals(map.get(currentKey), currentToken.getType());
        }
    }

    protected void testSingleRule(String input, ScriptureTokenType type) throws Exception {
        testSingleRule(input, input, type);
    }

    protected void testSingleRule(String input, String lexeme, ScriptureTokenType type) throws Exception {
        final ScriptureLexer lexer = getLexer();
        final StringReader reader = new StringReader(input);
        lexer.yyreset(reader);
        
        ScriptureToken token = lexer.yylex();
        assertNotNull(token);
        assertEquals(type, token.getType());
        assertEquals(lexeme, token.getText());
        assertEquals(0, token.getLine());
        assertEquals(0, token.getCharacter());
    }

}
