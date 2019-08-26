package com.pes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import com.pes.entity.BaseTimeEntity;

@Entity
public class Comments extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nullable
    private Long result_id;
    @Nullable
    private Long cup_id;
    @Nullable
    private String support_name;
    private String comment;
    private int password;
	
	public Comments(Long result_id, Long cup_id, String comment, String support_name, int password) {
		this.result_id    = result_id;
		this.cup_id       = cup_id;
		this.support_name = support_name;
		this.comment      = comment;
		this.password     = password;
    }

	protected Comments() {};

	public Long getId() {
		return id;
	}

	public Long getResult_id() {
		return result_id;
	}
	
	public Long getCup_id() {
		return cup_id;
	}

	public String getSupport_name() {
		return support_name;
	}

	public String getComment() {
		return comment;
	}

	public int getPassword() {
		return password;
	}
}