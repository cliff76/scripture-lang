package com.quesoconcarne.scripture.parser;

import com.quesoconcarne.scripture.ast.Node;
import java.util.ArrayList;
import java.util.List;

public class ValidationResult {

    private List<String> errors = new ArrayList<String>();
    private List<String> warnings = new ArrayList<String>();

    public void appendUnexpectedTokenError(ScriptureTokenType expected, ScriptureToken encountered) {
        appendError("Expected " + expected + " but got " + encountered);
    }

    public void appendUnexpectedTokenError(ScriptureTokenType[] expectedTypes, ScriptureToken encountered) {
        if (expectedTypes.length == 1) {
            appendUnexpectedTokenError(expectedTypes[0], encountered);
        }
        else {
            appendError("Expected " + expectedTypes + " but got " + encountered);
        }
    }

    public void appendExpectingRule(Class<? extends Node> ruleClass, ScriptureToken encountered) {
        
    }

    private void appendError(String error) {
        errors.add(error);
    }

    public void appendWarning(String warning) {
        warnings.add(warning);
    }

    public List<String> getErrors() {
        return new ArrayList<String>(errors);
    }

    public List<String> getWarnings() {
        return new ArrayList<String>(warnings);
    }

}
