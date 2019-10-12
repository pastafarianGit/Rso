package services;

import models.ImageEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Logger;


@ApplicationScoped
public class ImageBean {
    private Logger log = Logger.getLogger(ImageBean.class.getName());

    @PersistenceContext(unitName = "images-jpa")
    private EntityManager em;

    public List<ImageEntity> getImageList(){
        Query query = em.createNamedQuery("Image.getAll", ImageEntity.class);
        return query.getResultList();
    }
}
