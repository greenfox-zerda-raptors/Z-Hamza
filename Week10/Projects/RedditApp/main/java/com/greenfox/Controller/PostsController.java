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


//    @RequestMapping(method = RequestMethod.GET)
//    private String mainPage(Model model){
//        return "redirect:/posts/0";
//    }

    @RequestMapping(value = "/{pagenumber}" )
    private String switchPage(@PathVariable int pagenumber, Model model){
        listNextPosts(model, pagenumber);
        return "posts";
    }

    @GetMapping("/add")
    private String addNewPost(Model model) {
        addPost(model);
        return "add";
    }

    @PostMapping("/add")
    private String submitNewPost(@ModelAttribute @Valid Post post, BindingResult bindingResult) {
        submitPost(post, bindingResult);
        return "redirect:/posts/0";
    }

    @RequestMapping(value = "/delete")
    private String deletePost(@RequestParam(name = "id") long id){
        removePostByID(id);
        return "redirect:/posts/0";
    }

    @RequestMapping(value = "/updownvote/{id}/{difference}")
    private String ratePost(@PathVariable Long id, @PathVariable Integer difference){
        changeRating(id, difference);
        return "redirect:/posts/0";
    }


}
