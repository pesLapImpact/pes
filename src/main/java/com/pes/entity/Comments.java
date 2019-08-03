package com.pes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class Comments extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long result_id;
    private String comment;
    private String support_name;
    private int password;
	
	public Comments(Long result_id, String comment, String support_name, int password) {
		this.result_id    = result_id;
		this.comment      = comment;
		this.support_name = support_name;
		this.password     = password;
    }

	protected Comments() {};

	public Long getId() {
		return id;
	}

	public Long getㄲesult_id() {
		return result_id;
	}

	public String getComment() {
		return comment;
	}

	public String getSupport_name() {
		return support_name;
	}

	public int getPassword() {
		return password;
	}
}