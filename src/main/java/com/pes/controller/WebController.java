package com.pes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pes.repository.posts.PostsRepository;
import com.pes.service.posts.PostsService;

@Controller
public class WebController {

    private PostsService postsService;

    public WebController(PostsService postsService) {
        this.postsService = postsService;
    }
    
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
}