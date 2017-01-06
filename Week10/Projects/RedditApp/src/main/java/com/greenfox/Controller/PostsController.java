package com.greenfox.Controller;

import com.greenfox.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.greenfox.services.PostServices.*;

/**
 * Created by Zoltán on 2017.01.05..
 */
@Controller
@RequestMapping(value = "/posts")
public class PostsController {


    @RequestMapping(method = RequestMethod.GET)
    String mainPage(Model model){
        listPosts(model);
        return "posts";
    }
    //    @RequestMapping(method = RequestMethod.GET, value = "/add")
//    String addPostToList(Model model){
//        addPost(model);
//        return "posts";
//    }
    @GetMapping("/add")
    String add(Model model) {
        addPost(model);
        return "add";
    }

    @PostMapping("/add")
    String postSubmit(@ModelAttribute @Valid Post post, BindingResult bindingResult) {
        submitPost(post, bindingResult);
        return "redirect:/posts";
    }

    @RequestMapping("/delete")
    String deletePost(@RequestParam(name = "id") long id){
        removePostByID(id);
        return "redirect:/posts";
    }




}
