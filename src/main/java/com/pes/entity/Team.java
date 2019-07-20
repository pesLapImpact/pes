package com.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class Team extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(length = 500, nullable = false)
    private int won;
	
	@Column(length = 500, nullable = false)
    private int draw;
	
	@Column(length = 500, nullable = false)
    private int lost;
	
	@Column(length = 500, nullable = false)
    private int rating;
	
	@Column(length = 500, nullable = false)
    private int winning_point;
	
	@Column(length = 500, nullable = false)
    private int winning_rate;

    public Long getId() {
		return id;
	}
	
	public int getWon() {
		return won;
	}

	public int getDraw() {
		return draw;
	}

	public int getLost() {
		return lost;
	}

	public int getRating() {
		return rating;
	}

	public int getWinning_point() {
		return winning_point;
	}

	public int getWinning_rate() {
		return winning_rate;
	}

	protected Team() {};
    
    public Team(int won, int draw, int lost, int rating, int winning_point, int winning_rate) {
        this.won           = won;
        this.draw          = draw;
        this.lost          = lost;
        this.rating        = rating;
        this.winning_point = winning_point;
        this.winning_rate  = winning_rate;
    }
}