package com.pes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pes.service.NewsService;
import com.pes.service.TechService;

@Controller
public class MainController {

	@Autowired
    private TechService techService;
	@Autowired
    private NewsService newsService;

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("tech_list", techService.findAll());
        return "main";
    }
    
    @GetMapping("/news")
    public String news(Model model) {
        model.addAttribute("news_list", newsService.findAll());
        return "news";
    }
}