package my.project.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/topic")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SomeApi {

   @PUT
   @Operation(summary = "Put a value", description = "some description for the operation")
   @APIResponse(responseCode = "204", description = "Description for APIResponse")
   void putValue(String someValue);

}
