package com.baloise.codecamp.quarkus.standardentity;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/jpabooks")
@Produces(MediaType.APPLICATION_JSON)
public class JpaBookResource {
	@Inject
	JpaBookService jpaBookService;

	@GET
	public List<JpaBook> list() {
		List<JpaBook> list = jpaBookService.list();
		return list;
	}

	@GET
	@Path("{id}")
	public JpaBook findById(@PathParam("id") Long id) {
		return jpaBookService.findById(id);
	}

}
