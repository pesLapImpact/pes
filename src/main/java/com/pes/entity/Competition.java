package com.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class Competition extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(length = 500, nullable = false)
    private int weight;
	
	@Column(length = 500, nullable = false)
    private String name;
	
	@Column(length = 500, nullable = true)
    private int participant_count;
	
	@Column(length = 500, nullable = true)
    private int from;
	
	@Column(length = 500, nullable = true)
    private int to;

    public Long getId() {
		return id;
	}
	
	protected Competition() {};
    
    public Competition(int won, int draw, int lost, int rating, int winning_point, int winning_rate) {
    }


    
    
}