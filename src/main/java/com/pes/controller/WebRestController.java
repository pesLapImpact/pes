package com.pes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pes.dto.posts.PostsSaveRequestDto;
import com.pes.repository.posts.PostsRepository;

@RestController
public class WebRestController {

	private PostsRepository postsRepository;
	
    public WebRestController(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }
	
    @GetMapping("/lap")
    public String hello() {
        return "Hello LapImpact 2022";
    }
    
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
    
}