package com.baloise.codecamp.quarkus.panacheentity;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class BookService {

	public Uni<List<Book>> list() {
		return Book.listAll();
	}

	public Uni<Book> findById(Long id) {
		return Book.findById(id);
	}

}
