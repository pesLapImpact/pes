package com.pes.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.pes.entity.Cup;

public class CupResponseDto {
	
    private Long   id;
    private String img;
    private String name;
    private int    participants;
    private String grade;
    private String date_from;
    private String date_to;
    private String introduce;
    private int    comment_count;
    
	public CupResponseDto(
			Cup cup
			, int comment_count
			) {
		this.id            = cup.getId();
        this.img           = cup.getImg(); 
        this.name          = cup.getName();
        this.participants  = cup.getParticipants();
        this.grade         = cup.getGrade();
        this.introduce     = cup.getIntroduce();
        this.date_from     = toStringDateTime(cup.getDate_from());
        this.date_to       = toStringDateTime(cup.getDate_to());
        this.comment_count = comment_count;
    }
	
    public Long getId() {
		return id;
	}
	public String getImg() {
		return img;
	}
	public String getName() {
		return name;
	}
	public int getParticipants() {
		return participants;
	}
	public String getGrade() {
		return grade;
	}
	public String getDate_from() {
		return date_from;
	}
	public String getDate_to() {
		return date_to;
	}
	public String getIntroduce() {
		return introduce;
	}
	public int getComment_count() {
		return comment_count;
	}

	private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
