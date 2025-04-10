package org.acme;
import jakarta.json.JsonArray;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/search")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")

public interface TvSeriesPersonProxy {

  //https://api.tvmaze.com/search/people?q=lauren

  @GET
  @Path("/people")
  JsonArray getTvSeriesByPersonName(@QueryParam("q") String personName);


}
