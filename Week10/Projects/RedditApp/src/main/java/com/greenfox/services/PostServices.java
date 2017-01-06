package com.greenfox.services;

import com.greenfox.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

/**
 * Created by Zoltán on 2017.01.05..
 */

@Component
public class PostServices {

    private static PostRepositiry postRepositiry;

    @Autowired
    public PostServices(PostRepositiry postRepositiry){
        this.postRepositiry = postRepositiry;
    }

    public static void listPosts(Model model){
        model.addAttribute("posts", postRepositiry.findAll());
    }
    public static void addPost(Model model){
        model.addAttribute("post", new Post());
    }
    public static void submitPost(Post post, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            System.out.println("Error!!!!!!!!");
        }else{
            postRepositiry.save(post);
        }
    }
    public static void removePostByID(long id){
        postRepositiry.delete(id);
    }
}
