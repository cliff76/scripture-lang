package com.quesoconcarne.scripture.parser;

import com.quesoconcarne.scripture.ast.AtomicExpression;
import com.quesoconcarne.scripture.ast.CreateExpression;
import com.quesoconcarne.scripture.ast.Domain;
import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.KeypathExpression;
import com.quesoconcarne.scripture.ast.Program;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import junit.framework.TestCase;

public class ScriptureParserTest extends TestCase {

    public void testEmptyProgram() throws Exception {
        final String code = "";
        final ScriptureParser parser = createParser(code);
        final Program program = parser.getProgram();
        assertNotNull(program);
    }

    public void testEmptyDomain() throws Exception {
        final String code = "scripture Foo: amen";
        final ScriptureParser parser = createParser(code);
        
        final Domain domain = parser.getDomain();
        assertNotNull(domain);
        assertEquals("Foo", domain.getSimpleName());
        
        final List blockContents = domain.getBlockContents();
        assertNotNull(blockContents);
        assertEquals(0, blockContents.size());
    }

    public void testKeypathExpression() throws Exception {
        final String receiverString = "foo";
        final String keyString = "bar";
        final ScriptureParser parser = createParser(receiverString + "." + keyString);
        final KeypathExpression expression = parser.getKeypathExpression();
        assertNotNull(expression);
        
        final Expression receiver = expression.getLeft();
        assertNotNull(receiver);
        assertTrue(receiver instanceof AtomicExpression);
        final AtomicExpression receiverAtomic = (AtomicExpression) receiver;
        final ScriptureToken receiverToken = receiverAtomic.getLiteral();
        assertNotNull(receiverToken);
        assertEquals(ScriptureTokenType.IDENTIFIER, receiverToken.getType());
        assertEquals(receiverString, receiverToken.getLexeme());
        
        final ScriptureToken key = expression.getKey();
        assertNotNull(key);
        assertEquals(ScriptureTokenType.IDENTIFIER, key.getType());
        assertEquals(keyString, key.getLexeme());
    }
    
    public void testAtomicExpression() throws Exception {
        testAtomicExpression("1024", ScriptureTokenType.INTEGER_LITERAL);
        testAtomicExpression("3.141516", ScriptureTokenType.REAL_LITERAL);
        testAtomicExpression("\"This is a string\"", ScriptureTokenType.STRING_LITERAL);
        testAtomicExpression("@re(abc1234)re@", ScriptureTokenType.REGEXP_LITERAL);
        testAtomicExpression("someRandomIdentifier", ScriptureTokenType.IDENTIFIER);
        testAtomicExpression("true", ScriptureTokenType.TRUE);
        testAtomicExpression("false", ScriptureTokenType.FALSE);

        final String createType = "Foo";
        final String createInput = "let there be " + createType;
        final ScriptureParser createExprParser = createParser(createInput);
        final Expression createExpression = createExprParser.getAtomicExpression();
        assertNotNull(createExpression);
        assertTrue(createExpression + " is not a " + CreateExpression.class, createExpression instanceof CreateExpression);

        final CreateExpression createExpr = (CreateExpression) createExpression;
        final ScriptureToken createIdentifier = createExpr.getIdentifier();
        assertNotNull(createIdentifier);
        assertEquals(ScriptureTokenType.IDENTIFIER, createIdentifier.getType());
        assertEquals(createType, createIdentifier.getLexeme());
    }

    public void testAtomicExpression(String input, ScriptureTokenType type) throws Exception {
        final ScriptureParser parser = createParser(input);
        final Expression expression = parser.getAtomicExpression();
        assertNotNull(expression);
        assertEquals(AtomicExpression.class, expression.getClass());

        final AtomicExpression atomicExpression = (AtomicExpression) expression;
        final ScriptureToken literal = atomicExpression.getLiteral();
        assertNotNull(literal);
        assertEquals(type, literal.getType());
        assertEquals(input, literal.getLexeme());
    }

    protected ScriptureParser createParser(final String code) throws IOException {
        final ScriptureLexer lexer = new LexerEn(new StringReader(code));
        final ScriptureParser parser = new ScriptureParser(lexer);
        return parser;
    }
    
}
