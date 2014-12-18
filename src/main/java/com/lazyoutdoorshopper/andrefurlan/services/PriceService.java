package com.lazyoutdoorshopper.andrefurlan.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lazyoutdoorshopper.andrefurlan.Controller;
import com.lazyoutdoorshopper.andrefurlan.models.Price;

@Path("/price")
@Produces(MediaType.APPLICATION_JSON)
public class PriceService {

	@GET
	public Price get() {
		return new Price();
	}

	@GET
	@Path("/{product}")
	public Price get(@PathParam("product") String product) {
		Controller ctlr = new Controller();
		
		return new Price(product);
	}

}
