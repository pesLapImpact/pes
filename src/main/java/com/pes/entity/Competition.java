package com.pes.entity;

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
	private int weight;
    private String name;
    private int participant_count;
    private int start;
    private int end;

    public Long getId() {
		return id;
	}
	
    public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public int getParticipantCount() {
		return participant_count;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}
    
	protected Competition() {};
    
    public Competition(int weight, String name, int participant_count, int from, int to) {
    	this.weight = weight;
    	this.name = name;
    	this.participant_count = participant_count;
    	this.start = from;
    	this.end = to;
    }
}