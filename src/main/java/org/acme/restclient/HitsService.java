package org.acme.restclient;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;
import java.util.concurrent.CompletionStage;

@Path("/create")
@RegisterRestClient
public interface HitsService {

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    String getByName(@PathParam String name);

}
