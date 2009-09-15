package com.quesoconcarne.scripture.parser;

import com.quesoconcarne.scripture.ast.AtomicExpression;
import com.quesoconcarne.scripture.ast.ComparativeExpression;
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

    public void testComparativeExpressionLeftOnly() throws Exception {
        final String leftString = "foo";
        final ScriptureParser parser = createParser(leftString);
        final Expression expression = parser.getComparativeExpression();
        assertNotNull(expression);
        assertEquals(AtomicExpression.class, expression.getClass());
        final AtomicExpression leftAtomic = (AtomicExpression) expression;
        final ScriptureToken leftLiteral = leftAtomic.getLiteral();
        assertNotNull(leftLiteral);
        assertEquals(ScriptureTokenType.IDENTIFIER, leftLiteral.getType());
        assertEquals(leftString, leftLiteral.getLexeme());
    }

    public void testComparativeExpression() throws Exception {
        testComparativeExpression("foo", ScriptureTokenType.IDENTIFIER, "==", "bar", ScriptureTokenType.IDENTIFIER);
        testComparativeExpression("foo", ScriptureTokenType.IDENTIFIER, "!=", "y", ScriptureTokenType.IDENTIFIER);
        
        testComparativeExpression("1", ScriptureTokenType.INTEGER_LITERAL, "<", "2", ScriptureTokenType.INTEGER_LITERAL);
        testComparativeExpression("1", ScriptureTokenType.INTEGER_LITERAL, "<=", "2", ScriptureTokenType.INTEGER_LITERAL);
        
        testComparativeExpression("1.0", ScriptureTokenType.REAL_LITERAL, ">", "2.0", ScriptureTokenType.REAL_LITERAL);
        testComparativeExpression("1.0", ScriptureTokenType.REAL_LITERAL, ">=", "2.0", ScriptureTokenType.REAL_LITERAL);
    }
    
    public void testComparativeExpression(
            String leftString,
            ScriptureTokenType leftTokenType,
            String operatorString,
            String rightString,
            ScriptureTokenType rightTokenType
            ) throws Exception {
        final String input = leftString + " " + operatorString + " " + rightString;
        final ScriptureParser parser = createParser(input);
        final Expression expression = parser.getComparativeExpression();
        assertNotNull(expression);
        assertEquals(ComparativeExpression.class, expression.getClass());
        ComparativeExpression comparative = (ComparativeExpression) expression;
        
        final Expression left = comparative.getLeft();
        assertNotNull(left);
        assertEquals(AtomicExpression.class, left.getClass());
        final AtomicExpression atomicLeft = (AtomicExpression) left;
        final ScriptureToken literalLeft = atomicLeft.getLiteral();
        assertNotNull(literalLeft);
        assertEquals(leftTokenType, literalLeft.getType());
        assertEquals(leftString, literalLeft.getLexeme());
        
        final ScriptureToken operator = comparative.getOperator();
        assertNotNull(operator);
        assertEquals(ScriptureTokenType.COMPARATIVE_OPERATOR, operator.getType());
        assertEquals(operatorString, operator.getLexeme());
        
        final Expression right = comparative.getRight();
        assertNotNull(right);
        assertEquals(AtomicExpression.class, right.getClass());
        final AtomicExpression atomicRight = (AtomicExpression) right;
        final ScriptureToken literalRight = atomicRight.getLiteral();
        assertNotNull(literalRight);
        assertEquals(rightTokenType, literalRight.getType());
        assertEquals(rightString, literalRight.getLexeme());
    }

    public void testKeypathExpressionKeyless() throws Exception {
        final String input = "foo";
        final ScriptureParser parser = createParser(input);
        final Expression expression = parser.getKeypathExpression();
        assertNotNull(expression);
        assertEquals(AtomicExpression.class, expression.getClass());
        final AtomicExpression atomicLeft = (AtomicExpression) expression;
        final ScriptureToken leftLitarl = atomicLeft.getLiteral();
        assertNotNull(leftLitarl);
        assertEquals(ScriptureTokenType.IDENTIFIER, leftLitarl.getType());
        assertEquals(input, leftLitarl.getLexeme());
    }
    public void testKeypathExpression() throws Exception {
        final String receiverString = "foo";
        final String keyString = "bar";
        final ScriptureParser parser = createParser(receiverString + "." + keyString);
        final Expression expression = parser.getKeypathExpression();
        assertNotNull(expression);
        assertEquals(KeypathExpression.class, expression.getClass());

        final KeypathExpression keypath = (KeypathExpression) expression;
        final Expression receiver = keypath.getLeft();
        assertNotNull(receiver);
        assertTrue(receiver instanceof AtomicExpression);
        final AtomicExpression receiverAtomic = (AtomicExpression) receiver;
        final ScriptureToken receiverToken = receiverAtomic.getLiteral();
        assertNotNull(receiverToken);
        assertEquals(ScriptureTokenType.IDENTIFIER, receiverToken.getType());
        assertEquals(receiverString, receiverToken.getLexeme());
        
        final ScriptureToken key = keypath.getKey();
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
