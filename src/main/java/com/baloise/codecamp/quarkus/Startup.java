package com.baloise.codecamp.quarkus;

import com.baloise.codecamp.quarkus.panacheentity.Book;
import com.baloise.codecamp.quarkus.standardentity.JpaAuthorService;
import io.quarkus.runtime.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.lang.invoke.MethodHandles;

@Singleton
public class Startup {

    Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Inject
    JpaAuthorService jpaAuthorService;

    @Transactional
    public void loadInitialData(@Observes StartupEvent evt) {
        LOGGER.info("Loading Initial Data (Books and Authors)");

        // reset and load all books:
        Book.add("Java for Beginners", "Java Guru");
        Book.add("Angular for Beginners", "Angular Guru");
        Book.add("title", "author");

        jpaAuthorService.deleteAll();
        jpaAuthorService.addAuthor("name1", "surname 1");
        jpaAuthorService.addAuthor("name2", "surname 2");
        jpaAuthorService.addAuthor("name3", "surname 3");
    }
}
