package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/images")
public class ImageResource {

    @GET
    public int getInt() {
        return 42;
    }
}
