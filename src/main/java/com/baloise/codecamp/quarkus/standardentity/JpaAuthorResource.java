package com.baloise.codecamp.quarkus.standardentity;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/jpaauthors")
@Produces(MediaType.APPLICATION_JSON)
public class JpaAuthorResource {
	@Inject
	JpaAuthorService jpaAuthorService;

	@GET
	public List<JpaAuthor> list() {
		List<JpaAuthor> list = jpaAuthorService.list();
		return list;
	}

	@GET
	@Path("{name}")
	public JpaAuthor findById(@PathParam("name") String name) {
		return jpaAuthorService.findByName(name);
	}

}
