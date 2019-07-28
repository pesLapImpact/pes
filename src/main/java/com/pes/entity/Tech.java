package com.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tech extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String img_src;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String tech_desc;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String level;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String skill;    
	
	protected Tech() {};
    
    public Tech(String img_src, String tech_desc, String level, String skill) {
    	this.img_src   = img_src;
    	this.tech_desc = tech_desc;
    	this.level     = level;
    	this.skill     = skill;
    }

    public Long getId() {
		return id;
	}

	public String getImg_src() {
		return img_src;
	}

	public String getTech_desc() {
		return tech_desc;
	}

	public String getLevel() {
		return level;
	}

	public String getSkill() {
		return skill;
	}
	
}