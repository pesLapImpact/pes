package com.pes9.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes9.domain.posts.PostsRepository;
import com.pes9.dto.posts.PostsSaveRequestDto;

@Service
public class PostsService {
    private PostsRepository postsRepository;

    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }
    
    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }
}