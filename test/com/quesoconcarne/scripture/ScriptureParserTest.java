package com.quesoconcarne.scripture;

import com.quesoconcarne.scripture.ast.Artifact;
import com.quesoconcarne.scripture.ast.AssignmentExpression;
import com.quesoconcarne.scripture.ast.Block;
import com.quesoconcarne.scripture.ast.BooleanExpression;
import com.quesoconcarne.scripture.ast.AtomicExpression;
import com.quesoconcarne.scripture.ast.Commandment;
import com.quesoconcarne.scripture.ast.ComparativeExpression;
import com.quesoconcarne.scripture.ast.CreateExpression;
import com.quesoconcarne.scripture.ast.Domain;
import com.quesoconcarne.scripture.ast.DomainContent;
import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.ExpressionStatement;
import com.quesoconcarne.scripture.ast.IfStatement;
import com.quesoconcarne.scripture.ast.KeypathExpression;
import com.quesoconcarne.scripture.ast.Order;
import com.quesoconcarne.scripture.ast.OrderContent;
import com.quesoconcarne.scripture.ast.PrayStatement;
import com.quesoconcarne.scripture.ast.PreachStatement;
import com.quesoconcarne.scripture.ast.Program;
import com.quesoconcarne.scripture.ast.Prophecy;
import com.quesoconcarne.scripture.ast.Statement;
import java.io.IOException;
import java.io.StringReader;
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
        
        final DomainContent content = domain.getContent();
        assertNotNull(content);
        assertEquals(0, content.getChildren().size());
    }

    public void testOrder() throws Exception {
        final ScriptureParser parser = createParser("order Apple of Fruit: artifact worm; amen");
        final Order order = parser.getOrder();
        assertNotNull(order);
        
        final ScriptureToken name = order.getName();
        assertNotNull(name);
        assertEquals("Apple", name.getLexeme());

        final ScriptureToken parent = order.getParentname();
        assertNotNull(parent);
        assertEquals("Fruit", parent.getLexeme());

        final OrderContent content = order.getContent();
        assertNotNull(content);
        assertEquals(1, content.getChildren().size());
    }

    public void testProphecy() throws Exception {
        final ScriptureParser parser = createParser("prophecy genesis alias foo: preach \"Hello World\"; amen");
        final Prophecy prophecy = parser.getProphecy();
        assertNotNull(prophecy);
        final ScriptureToken genesis = prophecy.getGenesis();
        assertNotNull(genesis);
        assertEquals(ScriptureTokenType.GENESIS, genesis.getType());
        final ScriptureToken alias = prophecy.getAlias();
        assertNotNull(alias);
        assertEquals("foo", alias.getLexeme());
        final Block block = prophecy.getBlock();
        assertNotNull(block);
        assertEquals(1, block.getChildren().size());
    }

    public void testCommandment() throws Exception {
        final ScriptureParser parser = createParser("commandment foo : preach \"Hello World\"; amen");
        final Commandment commandment = parser.getCommandment();
        assertNotNull(commandment);
        final ScriptureToken name = commandment.getName();
        assertNotNull(name);
        assertEquals("foo", name.getLexeme());
        final Block block = commandment.getBlock();
        assertNotNull(block);
        assertEquals(1, block.getChildren().size());
    }

    public void testArtifact() throws Exception {
        testArtifact("foo", "1", "artifact foo = 1;");
        testArtifact("foo", null, "artifact foo;");
    }
    
    public void testArtifact(String nameString, String valueString, String code) throws Exception {
        final ScriptureParser parser = createParser(code);
        final Artifact artifact = parser.getArtifact();
        assertNotNull(artifact);
        final ScriptureToken name = artifact.getName();
        assertNotNull(name);
        assertEquals(ScriptureTokenType.IDENTIFIER, name.getType());
        assertEquals(nameString, name.getLexeme());
        
        final Expression value = artifact.getValue();
        if (valueString == null) {
            assertNull(value);
        }
        else {
            assertEquals(AtomicExpression.class, value.getClass());
            final AtomicExpression atomic = (AtomicExpression) value;
            final ScriptureToken literal = atomic.getLiteral();
            assertNotNull(literal);
            assertEquals(ScriptureTokenType.INTEGER_LITERAL, literal.getType());
            assertEquals(valueString, literal.getLexeme());
        }
        
    }

    public void testIfStatement() throws Exception {
        final String expressionString = "true";
        final String ifBlockString = "preach \"It is true!\";";
        final String elseBlockString = "pray 1;";
        final String code = "if " + expressionString + " : " + ifBlockString + " else " + elseBlockString + " amen";
        final ScriptureParser parser = createParser(code);
        final Statement statement = parser.getIfStatement();
        assertNotNull(statement);
        assertEquals(IfStatement.class, statement.getClass());
        final IfStatement ifStatement = (IfStatement) statement;
        
        final Expression expression = ifStatement.getExpression();
        assertNotNull(expression);
        assertEquals(BooleanExpression.class, expression.getClass());
        final BooleanExpression boolExpr = (BooleanExpression) expression;
        assertEquals(Boolean.TRUE, boolExpr.getValue());
        assertNull(boolExpr.getLeft());
        assertNull(boolExpr.getOperator());
        assertNull(boolExpr.getRight());
        
        final Block ifBlock = ifStatement.getIfBlock();
        assertNotNull(ifBlock);

        final Block elseBlock = ifStatement.getElseBlock();
        assertNotNull(elseBlock);
    }

    public void testExpressionStatement() throws Exception {
        final String code = "a = b;";
        final ScriptureParser parser = createParser(code);
        final Statement statement = parser.getExpressionStatement();
        assertNotNull(statement);
        assertEquals(ExpressionStatement.class, statement.getClass());
        final ExpressionStatement exprStatement = (ExpressionStatement) statement;
        final Expression expr = exprStatement.getExpression();
        assertNotNull(expr);
        assertEquals(AssignmentExpression.class, expr.getClass());
        final AssignmentExpression assign = (AssignmentExpression) expr;
        
        final Expression left = assign.getLeft();
        assertNotNull(left);
        assertEquals(AtomicExpression.class, left.getClass());
        final AtomicExpression atomicLeft = (AtomicExpression) left;
        final ScriptureToken literalLeft = atomicLeft.getLiteral();
        assertNotNull(literalLeft);
        assertEquals(ScriptureTokenType.IDENTIFIER, literalLeft.getType());
        assertEquals("a", literalLeft.getLexeme());

        final Expression right = assign.getRight();
        assertNotNull(right);
        assertEquals(AtomicExpression.class, right.getClass());
        final AtomicExpression atomicRight = (AtomicExpression) right;
        final ScriptureToken literalRight = atomicRight.getLiteral();
        assertNotNull(literalRight);
        assertEquals(ScriptureTokenType.IDENTIFIER, literalRight.getType());
        assertEquals("b", literalRight.getLexeme());
    }

    public void testPreachStatement() throws Exception {
        testPreachStatement("preach \"Hello World\";", null, "\"Hello World\"");
        testPreachStatement("preach stderr, \"Hello World\";", "stderr", "\"Hello World\"");
    }
    
    public void testPreachStatement(String code, String expecteStreamLexeme, String expectedLiteralLexeme) throws Exception {
        final ScriptureParser parser = createParser(code);
        final Statement statement = parser.getPreachStatement();
        assertNotNull(statement);
        assertEquals(PreachStatement.class, statement.getClass());

        final PreachStatement preach = (PreachStatement) statement;
        if (expecteStreamLexeme != null) {
            final ScriptureToken stream = preach.getStream();
            assertNotNull(stream);
            assertEquals(ScriptureTokenType.IDENTIFIER, stream.getType());
            assertEquals(expecteStreamLexeme, stream.getLexeme());
        }
        final Expression expr = preach.getExpression();
        assertNotNull(expr);
        assertEquals(AtomicExpression.class, expr.getClass());
        final AtomicExpression atomic = (AtomicExpression) expr;
        final ScriptureToken literal = atomic.getLiteral();
        assertNotNull(literal);
        assertEquals(ScriptureTokenType.STRING_LITERAL, literal.getType());
        assertEquals(expectedLiteralLexeme, literal.getLexeme());
    }

    public void testPrayStatement() throws Exception {
        final String code = "pray 1;";
        final ScriptureParser parser = createParser(code);
        final Statement statement = parser.getPrayStatement();
        assertNotNull(statement);
        assertEquals(PrayStatement.class, statement.getClass());

        final PrayStatement pray = (PrayStatement) statement;
        final Expression expression = pray.getExpression();
        assertNotNull(expression);
        assertEquals(AtomicExpression.class, expression.getClass());
        AtomicExpression atomic = (AtomicExpression) expression;
        final ScriptureToken literal = atomic.getLiteral();
        assertNotNull(literal);
        assertEquals(ScriptureTokenType.INTEGER_LITERAL, literal.getType());
        assertEquals("1", literal.getLexeme());
    }

    public void testMultiplicativeExpression() throws Exception {
        final String leftString = "foo";
        final String rightString = "bar";
        final String input = leftString + "*" + rightString;
        final ScriptureParser parser = createParser(input);
        final Expression expression = parser.getMultiplicativeExpression();
        assertNotNull(expression);
        assertEquals(com.quesoconcarne.scripture.ast.ArithmeticExpression.class, expression.getClass());
        final com.quesoconcarne.scripture.ast.ArithmeticExpression arithmeticExpr = (com.quesoconcarne.scripture.ast.ArithmeticExpression) expression;
        
        final Expression left = arithmeticExpr.getLeft();
        assertNotNull(left);
        assertEquals(AtomicExpression.class, left.getClass());
        final AtomicExpression atomicLeft = (AtomicExpression) left;
        final ScriptureToken literalLeft = atomicLeft.getLiteral();
        assertNotNull(literalLeft);
        assertEquals(ScriptureTokenType.IDENTIFIER, literalLeft.getType());
        assertEquals(leftString, literalLeft.getLexeme());
        
        final ScriptureToken operator = arithmeticExpr.getOperator();
        assertNotNull(operator);
        assertEquals(ScriptureTokenType.MULTIPLICATION_OPERATOR, operator.getType());

        final Expression right = arithmeticExpr.getRight();
        assertNotNull(right);
        assertEquals(AtomicExpression.class, right.getClass());
        final AtomicExpression atomicRight = (AtomicExpression) right;
        final ScriptureToken literalRight = atomicRight.getLiteral();
        assertNotNull(literalRight);
        assertEquals(ScriptureTokenType.IDENTIFIER, literalRight.getType());
        assertEquals(rightString, literalRight.getLexeme());
    }

    public void testBooleanExpressionNot() throws Exception {
        
    }

    public void testBooleanExpression() throws Exception {
        testBooleanExpression("foo", "and", "bar", ScriptureTokenType.IDENTIFIER, ScriptureTokenType.AND, ScriptureTokenType.IDENTIFIER);
        testBooleanExpression("foo", "or", "bar", ScriptureTokenType.IDENTIFIER, ScriptureTokenType.OR, ScriptureTokenType.IDENTIFIER);
        testBooleanExpression("foo", "xor", "bar", ScriptureTokenType.IDENTIFIER, ScriptureTokenType.XOR, ScriptureTokenType.IDENTIFIER);

        testBooleanExpression("foo", "and", "1", ScriptureTokenType.IDENTIFIER, ScriptureTokenType.AND, ScriptureTokenType.INTEGER_LITERAL);
        testBooleanExpression("2", "or", "bar", ScriptureTokenType.INTEGER_LITERAL, ScriptureTokenType.OR, ScriptureTokenType.IDENTIFIER);
        testBooleanExpression("1.2", "xor", "bar", ScriptureTokenType.REAL_LITERAL, ScriptureTokenType.XOR, ScriptureTokenType.IDENTIFIER);
    }
    
    public void testBooleanExpression(
            String leftString,
            String operatorString,
            String rightString,
            ScriptureTokenType leftTokenType,
            ScriptureTokenType operatorTokenType,
            ScriptureTokenType rightTokenType) throws Exception {
        final String input = leftString + " " + operatorString + " " + rightString;
        final ScriptureParser parser = createParser(input);
        final Expression expression = parser.getBooleanExpression();
        assertNotNull(expression);
        assertEquals(BooleanExpression.class, expression.getClass());
        final BooleanExpression booleanExpression = (BooleanExpression) expression;
        
        final Expression left = booleanExpression.getLeft();
        assertNotNull(left);
        assertEquals(AtomicExpression.class, left.getClass());
        final AtomicExpression atomicLeft = (AtomicExpression) left;
        final ScriptureToken literalLeft = atomicLeft.getLiteral();
        assertNotNull(literalLeft);
        assertEquals(leftTokenType, literalLeft.getType());
        assertEquals(leftString, literalLeft.getLexeme());
        
        final ScriptureToken operator = booleanExpression.getOperator();
        assertNotNull(operator);
        assertEquals(operatorTokenType, operator.getType());
        
        final Expression right = booleanExpression.getRight();
        assertNotNull(right);
        assertEquals(AtomicExpression.class, right.getClass());
        final AtomicExpression atomicRight = (AtomicExpression) right;
        final ScriptureToken literalRight = atomicRight.getLiteral();
        assertNotNull(literalRight);
        assertEquals(rightTokenType, literalRight.getType());
        assertEquals(rightString, literalRight.getLexeme());
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
        
        final ScriptureParser trueParser = createParser("true");
        final Expression trueExpression = trueParser.getAtomicExpression();
        assertEquals(BooleanExpression.class, trueExpression.getClass());
        final BooleanExpression trueBoolean = (BooleanExpression) trueExpression;
        assertEquals(Boolean.TRUE, trueBoolean.getValue());
        assertNull(trueBoolean.getLeft());
        assertNull(trueBoolean.getOperator());
        assertNull(trueBoolean.getRight());
        
        final ScriptureParser falseParser = createParser("false");
        final Expression falseExpression = falseParser.getAtomicExpression();
        assertEquals(BooleanExpression.class, falseExpression.getClass());
        final BooleanExpression falseBoolean = (BooleanExpression) falseExpression;
        assertEquals(Boolean.FALSE, falseBoolean.getValue());
        assertNull(falseBoolean.getLeft());
        assertNull(falseBoolean.getOperator());
        assertNull(falseBoolean.getRight());

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
