package com.baloise.codecamp.quarkus;

import io.quarkus.runtime.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.lang.invoke.MethodHandles;

@Singleton
public class Startup {

    Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Transactional
    public void loadInitialData(@Observes StartupEvent evt) {
        LOGGER.info("STARTING APP");
    }
}
