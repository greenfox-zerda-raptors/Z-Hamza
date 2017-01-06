package com.greenfox.services;

import com.greenfox.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;

/**
 * Created by Zoltán on 2017.01.05..
 */

@Component
public class PostServices {

    private static PostRepositiry postRepositiry;
    public ArrayList<Post> tempStorage;

    @Autowired
    public PostServices(PostRepositiry postRepositiry){
        this.postRepositiry = postRepositiry;
    }

    public static void listPosts(Model model){
        model.addAttribute("posts", postRepositiry.findAllByOrderByRatingDesc());
    }

    public static void listNextPosts(Model model, int pagenumber) {
        model.addAttribute("posts", postRepositiry.findAllByOrderByRatingDesc());

        model.addAttribute("nextPage", pagenumber+1);

        int firstPost = pagenumber*10;
        model.addAttribute("firstPostNumber", firstPost-1);
        model.addAttribute("lastPostNumber", firstPost+10);
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

    public static void changeRating(long id, int difference){
        Post ratedPost = postRepositiry.findOne(id);
        ratedPost.changeRating(difference);
        postRepositiry.save(ratedPost);
    }

}
