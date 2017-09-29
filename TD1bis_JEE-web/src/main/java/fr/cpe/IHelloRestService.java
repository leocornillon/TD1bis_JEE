package fr.cpe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public interface IHelloRestService{
	@GET
	@Produces("text/plain")
	String Hello(String name);
}