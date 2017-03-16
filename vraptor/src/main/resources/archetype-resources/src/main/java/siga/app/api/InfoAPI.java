package br.jus.trf2.siga.app.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Api
@Path("/info")
@Produces("application/json")
public class InfoAPI {

	@ApiOperation(value="Retorna informações sobre o sistema")
	@GET
	@Path("/")
	public Response getInfo(){
		String info = "{\"info\": \"App API online!\"}";
		Response response = Response.ok(info).build();
		return response;
	}
	


}
