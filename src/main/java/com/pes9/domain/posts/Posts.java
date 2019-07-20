package com.pes9.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.pes9.entity.posts.BaseTimeEntity;

@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

	@Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String author;

    protected Posts() {};
    
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    
    public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getAuthor() {
		return author;
	}
}