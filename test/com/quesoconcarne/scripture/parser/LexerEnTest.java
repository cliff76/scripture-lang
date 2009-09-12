package com.quesoconcarne.scripture.parser;

import java.io.StringReader;
import junit.framework.TestCase;

public class LexerEnTest extends TestCase {

    public void testKeywords() throws Exception {
        testSingleRule("false", ScriptureTokenType.FALSE);
        testSingleRule("true", ScriptureTokenType.TRUE);
        testSingleRule("amen", ScriptureTokenType.AMEN);
        testSingleRule("scripture", ScriptureTokenType.SCRIPTURE);
        testSingleRule("order", ScriptureTokenType.ORDER);
        testSingleRule("of", ScriptureTokenType.OF);
        testSingleRule("prophecy", ScriptureTokenType.PROPHECY);
        testSingleRule("genesis", ScriptureTokenType.GENESIS);
        testSingleRule("pray", ScriptureTokenType.PRAY);
        testSingleRule("preach", ScriptureTokenType.PREACH);
        testSingleRule("alias", ScriptureTokenType.ALIAS);
        testSingleRule("commandment", ScriptureTokenType.COMMANDMENT);
        testSingleRule("let there be", ScriptureTokenType.CREATE);
        testSingleRule("creation", ScriptureTokenType.CREATION);
        testSingleRule("artifact", ScriptureTokenType.ARTIFACT);
        testSingleRule("if", ScriptureTokenType.IF);
        testSingleRule("else", ScriptureTokenType.ELSE);
        testSingleRule("and", ScriptureTokenType.AND);
        testSingleRule("or", ScriptureTokenType.OR);
        testSingleRule("xor", ScriptureTokenType.XOR);
        testSingleRule("not", ScriptureTokenType.NOT);
        testSingleRule("boolean", ScriptureTokenType.BOOLEAN);
        testSingleRule("integer", ScriptureTokenType.INTEGER);
        testSingleRule("real", ScriptureTokenType.REAL);
        testSingleRule("string", ScriptureTokenType.STRING);
        testSingleRule("regexp", ScriptureTokenType.REGEXP);
    }

    public void testLiterals() throws Exception {
        testSingleRule("1234", ScriptureTokenType.INTEGER_LITERAL);
    }

    private void testSingleRule(String input, ScriptureTokenType type) throws Exception {
        final StringReader reader = new StringReader(input);
        LexerEn lexer = new LexerEn(reader);
        ScriptureToken token = lexer.yylex();
        assertNotNull(token);
        assertEquals(type, token.getType());
        assertEquals(input, token.getText());
        assertEquals(0, token.getLine());
        assertEquals(0, token.getCharacter());
    }

}
