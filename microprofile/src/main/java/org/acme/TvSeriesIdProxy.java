package org.acme;

import jakarta.json.JsonArray;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")
public interface TvSeriesIdProxy {

  //https://api.tvmaze.com/shows/120
  // base url    + shows + id

  @GET
  @Path("shows/{id}")
  TvSeries getTvSeriesById(@PathParam("id") int id);


  //https://api.tvmaze.com/search/people?q=lauren
  @GET
  @Path("search/people/")
  JsonArray getTvSeriesByPersonName(@QueryParam("q") String personName);

}
