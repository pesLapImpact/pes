package com.pes.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.pes.entity.News;

public class NewsResponseDto {
	
    private Long id;
    private String news_title;
    private String news_content;
    private String author;
    private String date;

	public Long getId() {return id;}
	public String getNews_title() {return news_title;}
    public String getNews_content() {return news_content;}
	public String getAuthor() {return author;}
	public String getDate() {return date;}

	public NewsResponseDto(News entity) {
        id = entity.getId();
        news_title = entity.getNews_title();
        news_content = entity.getNews_content();
        author = entity.getAuthor();
        date = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}