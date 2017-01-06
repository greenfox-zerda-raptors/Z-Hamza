package com.greenfox.model;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by Zoltán on 2017.01.05..
 */



@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String content;
    private int rating = 0;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar date = Calendar.getInstance();

    public Post() {
//        this.date = Calendar.getInstance();
    }

    public Post(int id, String content) {
        this.content = content;
        this.id = id;
//        this.date = Calendar.getInstance();
    }

    public void changeRating(int diff) {
        rating += diff;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
