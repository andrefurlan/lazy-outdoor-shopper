package com.example.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public class NameServie {

	@GET
	public String get() {
		return "andre";
	}

	@GET
	@Path("/{lastName}")
	public String get(@PathParam("lastName") String lastName) {
		return "andre "+ lastName;
	}

}
