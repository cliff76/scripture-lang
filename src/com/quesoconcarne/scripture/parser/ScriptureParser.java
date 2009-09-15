package com.quesoconcarne.scripture.parser;

import com.quesoconcarne.scripture.ast.ArithmeticExpression;
import com.quesoconcarne.scripture.ast.AssignmentExpression;
import com.quesoconcarne.scripture.ast.AtomicExpression;
import com.quesoconcarne.scripture.ast.Block;
import com.quesoconcarne.scripture.ast.BooleanExpression;
import com.quesoconcarne.scripture.ast.ComparativeExpression;
import com.quesoconcarne.scripture.ast.CreateExpression;
import com.quesoconcarne.scripture.ast.Domain;
import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.ExpressionStatement;
import com.quesoconcarne.scripture.ast.IfStatement;
import com.quesoconcarne.scripture.ast.KeypathExpression;
import com.quesoconcarne.scripture.ast.Node;
import com.quesoconcarne.scripture.ast.PrayStatement;
import com.quesoconcarne.scripture.ast.PreachStatement;
import com.quesoconcarne.scripture.ast.Program;
import com.quesoconcarne.scripture.ast.Statement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScriptureParser {

    private ScriptureLexer lexer;
    private List<ScriptureToken> tokenBuffer;
    private ValidationResult validationResult;

    public ScriptureParser(ScriptureLexer lexer) {
        this.lexer = lexer;
        this.tokenBuffer = new ArrayList<ScriptureToken>();
        this.validationResult = new ValidationResult();
    }

    /**
     * Performs a lookahead of the number of tokens specified by count.
     * @param count integer indicating the number to tokens to look ahead.
     * @return ScriptureToken
     */
    protected ScriptureToken lookAhead(int count) throws IOException {
        while (tokenBuffer.size() < count) {
            final ScriptureToken token = lexer.yylex();
            tokenBuffer.add(token);
        }
        return tokenBuffer.get(count - 1);
    }

    protected ScriptureToken consumeToken() throws IOException {
        if (tokenBuffer.isEmpty()) {
            final ScriptureToken token = lexer.yylex();
            tokenBuffer.add(token);
        }
        return tokenBuffer.remove(0);
    }

    public Program getProgram() throws IOException {
        final Domain domain = getDomain();
        if (domain != null) {
            return new Program(domain);
        }
        
        final List<Node> contents = new ArrayList<Node>();
        Node domainContent = getDomainContent();
        while (domainContent != null) {
            contents.add(domainContent);
            domainContent = getDomainContent();
        }
        
        return new Program(contents);
    }

    public Domain getDomain() throws IOException {
        final ScriptureToken domainNameToken = lookAhead(1);
        switch (domainNameToken.getType()) {
            case SCRIPTURE:
                consumeToken();
                break;
            default:
                return null;
        }

        final List<ScriptureToken> nameSegments = new ArrayList<ScriptureToken>();
        final ScriptureToken nameToken = lookAhead(1);
        switch (nameToken.getType()) {
            case IDENTIFIER:
                consumeToken();
                nameSegments.add(nameToken);
                break;
            default:
                validationResult.appendError("Expecting identifier but got: " + nameToken.getLexeme());
                return null;
        }

        // TODO: Call getBlock()
        final List blockContents = new ArrayList();

        final ScriptureToken delimiterToken = lookAhead(1);
        switch (delimiterToken.getType()) {
            case DELIMITER:
                consumeToken();
                break;
            default:
                validationResult.appendError("Expecting ':' but got: " + nameToken.getLexeme());
                return null;
        }

        final ScriptureToken amenToken = lookAhead(1);
        switch (amenToken.getType()) {
            case AMEN:
                consumeToken();
                break;
            default:
                validationResult.appendError("Expecting closer but got: " + nameToken.getLexeme());
                return null;
        }

        final Domain result = new Domain(nameSegments, blockContents);
        return result;
    }

    public Node getDomainContent() {
        return null;
    }

    public Statement getStatement() throws Exception {
        final Statement expr = getExpressionStatement();
        if (expr != null) {
            return expr;
        }

        // TODO: Do if statment

        final Statement preach = getPreachStatement();
        if (preach != null) {
            return preach;
        }

        final Statement pray = getPrayStatement();
        if (pray != null) {
            return pray;
        }

        return null;
    }

    public Block getBlock() throws Exception {
        List<Node> nodes = new ArrayList();
        Node currentNode = getStatement();
        while (currentNode != null) {
            nodes.add(currentNode);
            currentNode = getStatement();
        }
        return new Block(nodes);
    }

    public Statement getIfStatement() throws Exception {
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case IF:
                consumeToken();
                final Expression expr = getExpression();
                if (expr == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                    return null;
                }
                final ScriptureToken delim = lookAhead(1);
                switch (delim.getType()) {
                    case DELIMITER:
                        consumeToken();
                        final Block ifBlock = getBlock();
                        Block elseBlock = null;
                        final ScriptureToken elseToken = lookAhead(1);
                        switch (elseToken.getType()) {
                            case ELSE:
                                consumeToken();
                                elseBlock = getBlock();
                                break;
                            default:
                                break;
                        }
                        final ScriptureToken amen = lookAhead(1);
                        switch (amen.getType()) {
                            case AMEN:
                                consumeToken();
                                return new IfStatement(expr, ifBlock, elseBlock);
                            default:
                                validationResult.appendError("Expecting amen but got: " + amen.getLexeme());
                                return null;
                        }
                    default:
                        validationResult.appendError("Expecting : but got: " + delim.getLexeme());
                        return null;
                }
            default:
                return null;
        }
    }

    public Statement getExpressionStatement() throws Exception {
        final Expression expr = getExpression();
        if (expr == null) {
            return null;
        }
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case SEMICOLON:
                consumeToken();
                return new ExpressionStatement(expr);
            default:
                validationResult.appendError("Expecting ; but got: " + token.getLexeme());
                return null;
        }
    }

    public Statement getPreachStatement() throws Exception {
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case PREACH:
                consumeToken();
                final ScriptureToken identifier = lookAhead(1);
                boolean hasIdentifier = false;
                switch (identifier.getType()) {
                    case IDENTIFIER:
                        final ScriptureToken comma = lookAhead(2);
                        switch (comma.getType()) {
                            case COMMA:
                                consumeToken(); // identifier
                                consumeToken(); // comma
                                hasIdentifier = true;
                            default:
                                // do nothing for optional rule
                                break;
                        }
                    default:
                        // do nothing for optional rule
                        break;
                }
                final Expression expr = getExpression();
                if (expr == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                    return null;
                }
                final ScriptureToken semi = lookAhead(1);
                switch (semi.getType()) {
                    case SEMICOLON:
                        consumeToken();
                        if (hasIdentifier) {
                            return new PreachStatement(identifier, expr);
                        }
                        else {
                            return new PreachStatement(null, expr);
                        }
                    default:
                        validationResult.appendError("Expecting ; but got: " + token.getLexeme());
                        return null;
                }
            default:
                return null;
                
        }
    }

    public Statement getPrayStatement() throws Exception {
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case PRAY:
                consumeToken();
                final Expression expr = getExpression();
                if (expr == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                    return null;
                }
                final ScriptureToken semi = lookAhead(1);
                switch (semi.getType()) {
                    case SEMICOLON:
                        consumeToken();
                        return new PrayStatement(expr);
                    default:
                        validationResult.appendError("Expecting ; but got: " + semi.getLexeme());
                }
            default:
                return null;
        }
    }

    public Expression getExpression() throws Exception {
        return getAssignmentExpression();
    }

    public Expression getAssignmentExpression() throws Exception {
        final Expression left = getSubtractiveExpression();
        if (left == null) {
            return null;
        }
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case EQUAL:
                consumeToken();
                final Expression right = getSubtractiveExpression();
                if (right == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                }
                return new AssignmentExpression(left, token, right);
            default:
                return left;
        }
    }

    public Expression getSubtractiveExpression() throws Exception {
        final Expression left = getAdditiveExpression();
        if (left == null) {
            return null;
        }
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case SUBTRACTION_OPERATOR:
                consumeToken();
                final Expression right = getAdditiveExpression();
                if (right == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                }
                return new ArithmeticExpression(left, token, right);
            default:
                return left;
        }
    }

    public Expression getAdditiveExpression() throws Exception {
        final Expression left = getDivisiveExpression();
        if (left == null) {
            return null;
        }
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case ADDITION_OPERATOR:
                consumeToken();
                final Expression right = getDivisiveExpression();
                if (right == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                }
                return new ArithmeticExpression(left, token, right);
            default:
                return left;
        }
    }

    public Expression getDivisiveExpression() throws Exception {
        final Expression left = getMultiplicativeExpression();
        if (left == null) {
            return null;
        }
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case DIVISION_OPERATOR:
                consumeToken();
                final Expression right = getMultiplicativeExpression();
                if (right == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                }
                return new ArithmeticExpression(left, token, right);
            default:
                return left;
        }
    }

    public Expression getMultiplicativeExpression() throws Exception {
        final Expression left = getBooleanExpression();
        if (left == null) {
            return null;
        }
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case MULTIPLICATION_OPERATOR:
                consumeToken();
                final Expression right = getBooleanExpression();
                if (right == null) {
                    validationResult.appendError("Expecting expression after: " + token.getLexeme());
                }
                return new ArithmeticExpression(left, token, right);
            default:
                return left;
        }
    }

    public Expression getBooleanExpression() throws Exception {
        final ScriptureToken booleanOpeartorToken = lookAhead(1);
        switch (booleanOpeartorToken.getType()) {
            case NOT:
                consumeToken();
                final Expression negatedExpression = getComparativeExpression();
                if (negatedExpression == null) {
                    validationResult.appendError("Expecting expression after: " + booleanOpeartorToken.getLexeme());
                    return null;
                }
                return new BooleanExpression(booleanOpeartorToken, negatedExpression);
            default:
                final Expression left = getComparativeExpression();
                if (left == null) {
                    return null;
                }
                final ScriptureToken token = lookAhead(1);
                switch (token.getType()) {
                    case AND:
                    case OR:
                    case XOR:
                        consumeToken();
                        final Expression right = getComparativeExpression();
                        if (right == null) {
                            validationResult.appendError("Expecting expression after: " + token.getLexeme());
                            return null;
                        }
                        return new BooleanExpression(left, token, right);
                    default:
                        return left;
                }
        }
    }

    public Expression getComparativeExpression() throws Exception {
        final Expression expression = getKeypathExpression();
        if (expression == null) {
            return null;
        }
        final ScriptureToken operatorToken = lookAhead(1);
        switch (operatorToken.getType()) {
            case COMPARATIVE_OPERATOR:
                consumeToken();
                final Expression keypathExpression = getKeypathExpression();
                if (keypathExpression == null) {
                    validationResult.appendError("Expecting expression after: " + operatorToken.getLexeme());
                    return null;
                }
                return new ComparativeExpression(expression, operatorToken, keypathExpression);
            default:
                return expression;
        }
    }

    public Expression getKeypathExpression() throws Exception {
        final Expression expression = getAtomicExpression();
        if (expression == null) {
            return null;
        }
        final ScriptureToken dotToken = lookAhead(1);
        switch (dotToken.getType()) {
            case DOT:
                final ScriptureToken identifierToken = lookAhead(2);
                switch (identifierToken.getType()) {
                    case IDENTIFIER:
                        consumeToken();
                        consumeToken();
                        return new KeypathExpression(expression, dotToken, identifierToken);
                    default:
                        validationResult.appendError("Expecting identifier but got: " + identifierToken.getLexeme());
                        return null;
                }
            default:
                return expression;
        }
    }

    public Expression getAtomicExpression() throws Exception {
        final ScriptureToken token = lookAhead(1);
        switch (token.getType()) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
            case STRING_LITERAL:
            case REGEXP_LITERAL:
            case IDENTIFIER:
                consumeToken();
                return new AtomicExpression(token);
            case TRUE:
                consumeToken();
                return new BooleanExpression(Boolean.TRUE);
            case FALSE:
                consumeToken();
                return new BooleanExpression(Boolean.FALSE);
            case CREATE:
                final ScriptureToken identifierToken = lookAhead(2);
                switch (identifierToken.getType()) {
                    case IDENTIFIER:
                        consumeToken();
                        consumeToken();
                        return new CreateExpression(identifierToken);
                    default:
                        validationResult.appendError("Expecting identifier but got: " + token.getLexeme());
                        return null;
                }
            case LEFT_PARENTHESIS:
                consumeToken();
                final Expression expression = getExpression();
                if (expression == null) {
                    validationResult.appendError("Expecting expression after " + token.getLexeme());
                    return null;
                }
                final ScriptureToken rightParenthesis = lookAhead(1);
                switch (rightParenthesis.getType()) {
                    case RIGHT_PARENTHESIS:
                        consumeToken();
                        return expression;
                    default:
                        validationResult.appendError("Expecting right parenthesis but got: " + token.getLexeme());
                        return null;
                }
                
            default:
                validationResult.appendError("Expecting boolean literal but got: " + token.getLexeme());
                return null;
        }
    }

}
