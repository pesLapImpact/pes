package com.pes9.dto.posts;

import com.pes9.domain.posts.Posts;

public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity(){
    	Posts posts = new Posts(
    			  "테스트 게시글"
    			, "테스트 본문"
    			, "jojoldu@gmail.com"
    			);
        return posts;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}