package at.smartcare;


import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;


/**
 * Created by Jakob on 12.10.2015.
 */
// The Java class will be hosted at the URI path "/smartcare/apiv1/"
@Path("/apiv1/")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

}
