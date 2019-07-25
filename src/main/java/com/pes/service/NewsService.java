package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.NewsResponseDto;
import com.pes.entity.News;
import com.pes.repository.NewsRepository;

@Service
public class NewsService {
	
	@Autowired
    private NewsRepository newsRepository;

	@Transactional(readOnly = true)
    public List<NewsResponseDto> findAll(){
		
		List<News> NewsList = newsRepository.findAll();
		List<NewsResponseDto> dtoList = new ArrayList<NewsResponseDto>();
		
		for (News News : NewsList) {
			NewsResponseDto dto = new NewsResponseDto(News);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}