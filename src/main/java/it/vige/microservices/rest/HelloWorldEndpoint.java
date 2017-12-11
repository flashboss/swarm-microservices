package it.vige.microservices.rest;

import static javax.ws.rs.core.Response.ok;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import it.vige.microservices.ejb.Consulta;
import it.vige.microservices.jpa.Conto;

@Path("/")
public class HelloWorldEndpoint {

	@Inject
	private Consulta consulta;

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return ok("Hello from WildFly Swarm!").build();
	}

	@GET
	@Produces("text/plain")
	@Path("visualizzaConto/{id}")
	public Response visualizzaConto(@PathParam("id") int id) {
		Conto conto = consulta.visualizzaConto(id);
		return ok("siamo nel conto di: " + conto.getName()).build();
	}

	@GET
	@Produces("text/plain")
	@Path("creaConto/{id}/{name}")
	public Response creaConto(@PathParam("id") int id, @PathParam("name") String name) {
		consulta.creaConto(id, name);
		return ok("Conto creato!").build();
	}
}