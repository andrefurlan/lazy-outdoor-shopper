package com.lazyoutdoorshopper.andrefurlan.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lazyoutdoorshopper.andrefurlan.models.Name;

@Path("/name")
@Produces(MediaType.APPLICATION_JSON)
public class NameService {

	@GET
	public Name get() {
		return new Name();
	}

	@GET
	@Path("/{lastName}")
	public Name get(@PathParam("lastName") String lastName) {
		return new Name(lastName);
	}

}
