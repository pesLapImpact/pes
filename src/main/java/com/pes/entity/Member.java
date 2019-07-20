package com.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(length = 500, nullable = false)
    private int team_id;
	
	@Column(length = 500, nullable = false)
    private String name;
	
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
	
	@Column(length = 500, nullable = false)
    private int goal;
	
	@Column(length = 500, nullable = false)
    private int goal_average;

	@Column(length = 500, nullable = false)
    private int lost_goal;
	
	@Column(length = 500, nullable = false)
    private int lost_goal_average;

	public Long getId() {
		return id;
	}

    public int getTeam_id() {
		return team_id;
	}
    
    public String getName() {
		return name;
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
	
    public int getGoal() {
		return goal;
	}

	public int getGoal_average() {
		return goal_average;
	}

	public int getLost_goal() {
		return lost_goal;
	}

	public int getLost_goal_average() {
		return lost_goal_average;
	}
	
	protected Member() {};
    
    public Member(
    		  int team_id
    		, String name
    		, int won
    		, int draw
    		, int lost
    		, int rating
    		, int winning_point
    		, int winning_rate
    		, int goal
    		, int goal_average
    		, int lost_goal
    		, int lost_goal_average
    		) {
        this.team_id           = team_id;
        this.name              = name;
        this.won               = won;
        this.draw              = draw;
        this.lost              = lost;
        this.rating            = rating;
        this.winning_point     = winning_point;
        this.winning_rate  	   = winning_rate;
		this.goal              = goal;
		this.goal_average      = goal_average; 
		this.lost_goal         = lost_goal;
		this.lost_goal_average = lost_goal_average; 
    }
}