package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Zoltán on 2016.12.19..
 */

@RestController
public class HelloRESTcontroller {
    private final AtomicLong counter= new AtomicLong();

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam() String name) {
        long idcounter = counter.incrementAndGet();
        return new Greeting(idcounter, "Hello, "+ name +"!");
    }
}

