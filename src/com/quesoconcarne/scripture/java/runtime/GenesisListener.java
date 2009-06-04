package com.quesoconcarne.scripture.java.runtime;

public abstract class GenesisListener extends ProphecyListener implements Runnable {

    private Thread thread = new Thread(this);

    public void genesisStart() {
        thread.start();
    }

}
