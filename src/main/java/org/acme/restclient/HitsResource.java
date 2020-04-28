package org.acme.restclient;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/callme")
public class HitsResource {

    @Inject
    @RestClient
    HitsService hitsService;


    @GET
    @Path("/name/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String name(@PathParam String name) {
        return hitsService.getByName(name);
    }

}
