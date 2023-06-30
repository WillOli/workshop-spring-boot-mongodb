package com.willoli.workshopmongo.domain;

import com.willoli.workshopmongo.dto.AuthorDTO;
import com.willoli.workshopmongo.dto.CommentDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.stream.events.Comment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    private List<CommentDTO> comments = new ArrayList<>();
    public Post() {

    }
    /*Construtor com argumento*/

    public Post(String id, Date date, String title, String body, AuthorDTO autor) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = autor;
    }
    /*Getter e Setter*/
    public String getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }
    public String getBody() {
        return body;
    }

    public void setBody() {
        this.body = body;
    }

    public AuthorDTO getAuthor() {
        return author;
    }
    public void setAutor(AuthorDTO author) {
        this.author = author;
    }
    public List<CommentDTO> getComments(){
        return comments;
    }
    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Post other  = (Post) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }else if (!id.equals(other.id))
            return false;
        return true;
    }

}
