package com.tschnob.simple.java.server.main.test;

import jersey.repackaged.com.google.common.collect.ImmutableMap;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.Map;

/**
 * Any request on url path 'api/test' will end up here.
 * The 'api/' is set in the web.xml Jersey servlet mapping
 */
@Path("test")
public class TestApi {

    @GET
    @Path("status")
    public Map<String, String> getTestStatus() {
        return ImmutableMap.of("status", "success");
    }

    @POST
    @Path("name")
    public Map<String, String> postWithBody(@QueryParam("name") String name) {
        return ImmutableMap.of("name", name);
    }

    @GET
    public void throwError() {
        System.out.println("Throwing exception");
        throw new TestException();
    }
}
