package com.pes.service.posts;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.posts.PostsResponseDto;
import com.pes.dto.posts.PostsSaveRequestDto;
import com.pes.repository.posts.PostsRepository;

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
    
    @Transactional(readOnly = true)
    public List<PostsResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsResponseDto::new)
                .collect(Collectors.toList());
    }
    
}