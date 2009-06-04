package com.quesoconcarne.scripture.java.runtime;

import java.util.ArrayList;
import java.util.List;

public class ProphecyNotificationCenter {

    private static final ProphecyNotificationCenter SHARED_INSTANCE = new ProphecyNotificationCenter();
    public static final String ADD_GENESIS_SUBSCRIBER_METHOD_NAME = "addGenesisSubscriber";

    public static final ProphecyNotificationCenter getSharedInstance() {
        return SHARED_INSTANCE;
    }

    private List<GenesisListener> genesisSubscribers = new ArrayList<GenesisListener>();

    public void addGenesisSubscriber(GenesisListener subscriber) {
        genesisSubscribers.add(subscriber);
    }

    public void startGenesis() {
        for (GenesisListener genesisListener : genesisSubscribers) {
            genesisListener.genesisStart();
        }
    }

}
