package com.persional.spring.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BobManager {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private AnnaManager annaManager;

    public void requestAnna() {
        annaManager.responseBob();
    }

    public void responseAnna() {
        logger.info("anna call , reply response");
    }

    public void setAnnaManager(AnnaManager annaManager) {
        this.annaManager = annaManager;
    }

}
