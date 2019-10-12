package services;

import models.CommentEntity;
import models.ImageEntity;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class CommentsBean {
    private Logger log = Logger.getLogger(CommentsBean.class.getName());

    @PersistenceContext(unitName = "comments-jpa")
    private EntityManager em;

    public List<CommentEntity> getCommentList(){
        Query query = em.createNamedQuery("Comment.getAll", CommentEntity.class);
        return query.getResultList();
    }
}
