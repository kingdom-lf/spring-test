package com.persional.spring.manager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnnaManager {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private BobManager bobManager;

    public void requestBob() {
        bobManager.responseAnna();
    }

    public void responseBob() {
        logger.info("bob call , reply response");
    }

    public void setBobManager(BobManager bobManager) {
        this.bobManager = bobManager;
    }
}
