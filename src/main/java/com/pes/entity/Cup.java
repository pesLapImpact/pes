package com.pes.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cup extends BaseTimeEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    private String img;
    private String name;
    private int    participants;
    private String grade;
    private String introduce;
    private LocalDateTime date_from;
    private LocalDateTime date_to;
    
	public Cup(
			  Long id
			, String img
			, String name
			, int participants
			, String grade
			, String introduce
			, LocalDateTime date_from
			, LocalDateTime date_to
			) {
		this.id            = id;
        this.img           = img; 
        this.name          = name;
        this.participants  = participants;
        this.grade         = grade;
        this.introduce     = introduce;
        this.date_from     = date_from;
        this.date_to       = date_to;
    }

	protected Cup() {};
	
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
	public String getIntroduce() {
		return introduce;
	}
	public LocalDateTime getDate_from() {
		return date_from;
	}
	public LocalDateTime getDate_to() {
		return date_to;
	}
}
