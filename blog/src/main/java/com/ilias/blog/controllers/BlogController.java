package com.ilias.blog.controllers;

import com.ilias.blog.models.Post;
import com.ilias.blog.models.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {

    @Autowired
    private PostRepo postRepo;
    @GetMapping("/")
    public String home(Model model) {
        Iterable<Post> posts = postRepo.findAll();
        model.addAttribute("posts", posts);
        model.addAttribute("title", "Home page");
        return "home";
    }

}
