package models;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "comments")
@NamedQueries(value =
        {
                @NamedQuery(name = "Comment.getAll", query = "SELECT cm FROM CommentEntity cm")
        })

public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
    @JoinColumn(name = "image_id")
    private ImageEntity image;

    @Column(name = "authorId")
    private String authorId;

    @Column(name = "text")
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ImageEntity getImageId() {
        return image;
    }

    public void setImageId(ImageEntity id) {
        this.image = image;
    }

    public String getAuthorID() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}


