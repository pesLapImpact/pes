package com.pes.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.pes.entity.News;

public class NewsResponseDto {
	
    private Long id;
    private String news_title;
    private String date;

    public Long getId() {
		return id;
	}

	public String getNewsTitle() {
		return news_title;
	}

	public String getDate() {
		return date;
	}

	public NewsResponseDto(News entity) {
        id = entity.getId();
        news_title = entity.getNewsTitle();
        date = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}