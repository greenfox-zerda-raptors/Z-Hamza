package com.greenfox.model;

import javax.persistence.*;

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

    public Post(){

    }

    public Post(long id, String content, int rating) {
        this.id = id;
        this.content = content;
        this.rating = rating;
    }

    public Post(int id, String content) {
        this.content = content;
        this.id = id;
    }

    public void incrementRating(){
        rating ++;
    }
    public void decrementRating(){
        rating--;
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
}
