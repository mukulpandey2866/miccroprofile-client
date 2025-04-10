package org.acme;

import jakarta.json.JsonArray;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/tvseries")
public class TvSeriesResource {


  @RestClient
  TvSeriesIdProxy proxy;

  @RestClient
  TvSeriesPersonProxy personProxy;

  //localhost:8080/tvseries/120
  @GET
  @Path("/{id}")
  public TvSeries getTvSeriesById(@PathParam("id") int id) {
    return proxy.getTvSeriesById(id);
  }

  //https://api.tvmaze.com/search/people?q=lauren
    @GET
    @Path("/person/{personname}")
    private JsonArray getTvSeriesByPerson(@PathParam("personname") String personName) {
      return proxy.getTvSeriesByPersonName(personName);

    }
      //https://api.tvmaze.com/search/people?q=lauren
      @GET
      @Path("/person/{persname}")
      public JsonArray getTvSeriesByPname(@PathParam("persname") String personName){
        return personProxy.getTvSeriesByPersonName(personName);

  }


}
