package com.pes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class News extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String news_title;
    private String news_content;
    private String author;

	public Long getId() {return id;}
	public String getNews_title() {return news_title;}
    public String getNews_content() {return news_content;}
	public String getAuthor() {return author;}
	
	protected News() {};
    
    public News(String news_title, String news_content, String author) {
        this.news_title = news_title;
        this.news_content = news_content;
        this.author = author;
    }
}