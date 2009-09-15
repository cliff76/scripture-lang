package com.quesoconcarne.scripture.parser;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {

    private List<String> errors = new ArrayList<String>();
    private List<String> warnings = new ArrayList<String>();

    public void appendError(String error) {
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
