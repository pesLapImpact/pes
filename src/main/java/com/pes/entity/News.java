package com.pes.entity;

import javax.persistence.Column;
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
	
    public Long getId() {
		return id;
	}
	
	public String getNews_title() {
		return news_title;
	}

	protected News() {};
    
    public News(String news_title) {
        this.news_title = news_title;
    }
}