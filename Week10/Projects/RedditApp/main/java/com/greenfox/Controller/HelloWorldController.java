package com.greenfox.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zoltán on 2017.01.05..
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String helloWorld(){
        return "hello";
    }
}
