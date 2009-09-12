package com.quesoconcarne.scripture.parser;

import java.io.StringReader;

public class LexerLaTest extends LexerTest {

    @Override
    protected ScriptureLexer getLexer() {
        return new LexerLa(new StringReader(""));
    }

    @Override
    protected String getEst() {
        return "est";
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
        return "et";
    }

    @Override
    protected String getArtifact() {
        return "artefactum";
    }

    @Override
    protected String getBoolean() {
        return "bool";
    }

    @Override
    protected String getCommandment() {
        return "decalogus";
    }

    @Override
    protected String getCreate() {
        return "creare";
    }

    @Override
    protected String getCreation() {
        return "nihilo";
    }

    @Override
    protected String getElse() {
        return "sinon";
    }

    @Override
    protected String getFalse() {
        return "falsus";
    }

    @Override
    protected String getGenesis() {
        return "genesis";
    }

    @Override
    protected String getIf() {
        return "si";
    }

    @Override
    protected String getInteger() {
        return "integrum";
    }

    @Override
    protected String getNot() {
        return "non";
    }

    @Override
    protected String getOf() {
        return "ex";
    }

    @Override
    protected String getOr() {
        return "aut";
    }

    @Override
    protected String getOrder() {
        return "ordo";
    }

    @Override
    protected String getPray() {
        return "resare";
    }

    @Override
    protected String getPreach() {
        return "predicare";
    }

    @Override
    protected String getProphecy() {
        return "professare";
    }

    @Override
    protected String getReal() {
        return "rei";
    }

    @Override
    protected String getRegexp() {
        return "regexp";
    }

    @Override
    protected String getScripture() {
        return "scriptura";
    }

    @Override
    protected String getString() {
        return "catena";
    }

    @Override
    protected String getTrue() {
        return "verus";
    }

    @Override
    protected String getXor() {
        return "xaut";
    }

}
