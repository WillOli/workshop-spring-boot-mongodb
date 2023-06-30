package com.willoli.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private static final long serialVersionnUID = 1L;

    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {

    }

    public CommentDTO(String text, Date date, AuthorDTO author) {
        super();
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }
    public void setText() {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }
    public void setAuthor() {
        this.author = author;
    }




}
