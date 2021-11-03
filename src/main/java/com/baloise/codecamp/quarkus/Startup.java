package com.baloise.codecamp.quarkus;

import com.baloise.codecamp.quarkus.panacheentity.Book;
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
    public void loadBooks(@Observes StartupEvent evt) {
        LOGGER.info("STARTUP !!!");

        // reset and load all books:
        Book.deleteAll();
        Book.add("Java for Beginners", "Java Guru");
        Book.add("Angular for Beginners", "Angular Guru");
        Book.add("title", "author");
    }
}
