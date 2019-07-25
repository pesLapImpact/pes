package com.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class Tech extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String img_src;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String img_desc;
	
    protected Tech() {};
    
    public Tech(String imgSrc, String imgDesc) {
    	this.img_src  = imgSrc;
    	this.img_desc = imgDesc;
    }
    
    public Long getId() {
		return id;
	}
	public String getImgSrc() {
		return img_src;
	}
	public String getImgDesc() {
		return img_desc;
	}
	
}