package com.quesoconcarne.scripture.java.runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScriptureRegex extends ScriptureObject {
    
    public static final Pattern REGEX_PATTERN = Pattern.compile("@regex\\[(.+?)\\](\\w+)?");

    private Pattern pattern;
    private String originalFlags;

    public ScriptureRegex(String patternString) {
        final Matcher matcher = REGEX_PATTERN.matcher(patternString);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Illegal regex pattern: " + patternString);
        }
        final String javaPattern = matcher.group(1);
        this.originalFlags = matcher.group(2);
        if (this.originalFlags == null) {
            this.pattern = Pattern.compile(javaPattern);
        }
        else {
            int flags = 0;
            if (originalFlags.contains("i")) {
                flags |= Pattern.CASE_INSENSITIVE;
            }
            if (originalFlags.contains("m")) {
                flags |= Pattern.MULTILINE;
            }
            this.pattern = Pattern.compile(javaPattern, flags);
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("@regex[");
        out.append(pattern);
        out.append("]");
        if (originalFlags != null) {
            out.append(originalFlags);
        }
        return out.toString();
    }

}
