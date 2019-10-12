package api;

import models.CommentEntity;
import models.ImageEntity;
import services.CommentsBean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/comments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentsResources {
    @Inject
    private CommentsBean commentsBean;

    @GET
    public Response getCommentsLIst() {
        final List<CommentEntity> imageList = commentsBean.getCommentList();
        return Response.ok(imageList).build();
    }
}
