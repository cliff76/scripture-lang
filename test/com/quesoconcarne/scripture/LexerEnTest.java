package com.quesoconcarne.scripture;

import java.io.StringReader;

public class LexerEnTest extends LexerTest {

    @Override
    protected ScriptureLexer getLexer() {
        return new LexerEn(new StringReader(""));
    }

    @Override
    protected String getEst() {
        return "is";
    }

    @Override
    protected String getAlias() {
        return "alias";
    }

    @Override
    protected String getAmen() {
        return "amen";
    }

    @Override
    protected String getAnd() {
        return "and";
    }

    @Override
    protected String getArtifact() {
        return "artifact";
    }

    @Override
    protected String getBoolean() {
        return "boolean";
    }

    @Override
    protected String getCommandment() {
        return "commandment";
    }

    @Override
    protected String getCreate() {
        return "let there be";
    }

    @Override
    protected String getCreation() {
        return "creation";
    }

    @Override
    protected String getElse() {
        return "else";
    }

    @Override
    protected String getFalse() {
        return "false";
    }

    @Override
    protected String getGenesis() {
        return "genesis";
    }

    @Override
    protected String getIf() {
        return "if";
    }

    @Override
    protected String getInteger() {
        return "integer";
    }

    @Override
    protected String getNot() {
        return "not";
    }

    @Override
    protected String getOf() {
        return "of";
    }

    @Override
    protected String getOr() {
        return "or";
    }

    @Override
    protected String getOrder() {
        return "order";
    }

    @Override
    protected String getPray() {
        return "pray";
    }

    @Override
    protected String getPreach() {
        return "preach";
    }

    @Override
    protected String getProphecy() {
        return "prophecy";
    }

    @Override
    protected String getReal() {
        return "real";
    }

    @Override
    protected String getRegexp() {
        return "regexp";
    }

    @Override
    protected String getScripture() {
        return "scripture";
    }

    @Override
    protected String getString() {
        return "string";
    }

    @Override
    protected String getTrue() {
        return "true";
    }

    @Override
    protected String getXor() {
        return "xor";
    }

}
