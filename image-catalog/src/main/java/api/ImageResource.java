package api;

import models.ImageEntity;
import services.ImageBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;
import java.util.List;


@RequestScoped
@Path("/images")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ImageResource {

    @Inject
    private ImageBean imageBean;

    @Context
    protected UriInfo uriInfo;

    @GET
    public Response getImageList() {
        final List<ImageEntity> imageList = imageBean.getImageList();
        return Response.ok(imageList).build();
    }
}
