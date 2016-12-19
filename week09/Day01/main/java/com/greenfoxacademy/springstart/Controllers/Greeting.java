package com.greenfoxacademy.springstart.Controllers;

import lombok.Getter;

/**
 * Created by Zoltán on 2016.12.19..
 */

@Getter
public class Greeting {
    public long id;

    public String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}

