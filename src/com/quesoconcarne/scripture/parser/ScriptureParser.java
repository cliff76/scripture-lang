package com.quesoconcarne.scripture.parser;

import com.quesoconcarne.scripture.ast.AtomicExpression;
import com.quesoconcarne.scripture.ast.BooleanExpression;
import com.quesoconcarne.scripture.ast.ComparativeExpression;
import com.quesoconcarne.scripture.ast.CreateExpression;
import com.quesoconcarne.scripture.ast.Domain;
import com.quesoconcarne.scripture.ast.Expression;
import com.quesoconcarne.scripture.ast.KeypathExpression;
import com.quesoconcarne.scripture.ast.Node;
import com.quesoconcarne.scripture.ast.Program;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ScriptureParser {

    private ScriptureLexer lexer;
    private List<ScriptureToken> tokenBuffer;
    private ValidationResult validationResult;

    public ScriptureParser(ScriptureLexer lexer) {
        this.lexer = lexer;
        this.tokenBuffer = new LinkedList<ScriptureToken>();
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

    public Expression getExpression() throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public BooleanExpression getBooleanExpression() throws Exception {
        return null;
    }

    public ComparativeExpression getComparativeExpression() throws Exception {
        final KeypathExpression expression = getKeypathExpression();
        if (expression == null) {
            return null;
        }
        final ScriptureToken operatorToken = lookAhead(1);
        switch (operatorToken.getType()) {
            case COMPARATIVE_OPERATOR:
                consumeToken();
                final KeypathExpression keypathExpression = getKeypathExpression();
                if (keypathExpression == null) {
                    return null;
                }
                return new ComparativeExpression(expression, operatorToken, keypathExpression);
            default:
                return new ComparativeExpression(expression, null, null);
        }
    }

    public KeypathExpression getKeypathExpression() throws Exception {
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
                return new KeypathExpression(expression, null, null);
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
            case TRUE:
            case FALSE:
                consumeToken();
                return new AtomicExpression(token);
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
