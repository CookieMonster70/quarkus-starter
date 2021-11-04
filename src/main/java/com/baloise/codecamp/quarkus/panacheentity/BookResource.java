package com.baloise.codecamp.quarkus.panacheentity;

import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {
	@Inject
	BookService bookService;

	@GET
	public Uni<List<Book>> list() {
		return bookService.list();
	}

	@GET
	@Path("{id}")
	public Uni<Book> findById(@PathParam("id") Long id) {
		return bookService.findById(id);
	}

}
