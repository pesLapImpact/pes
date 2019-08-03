package com.pes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class TeamResults extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String home_name;
    private String home_team;
    private int home_score;
    private String away_name;
    private String away_team;
    private int away_score;
    private String match_info;

	public Long getId() {
		return id;
	}
	public String getHome_name() {
		return home_name;
	}
	public String getAway_name() {
		return away_name;
	}
	public String getHome_team() {
		return home_team;
	}
	public String getAway_team() {
		return away_team;
	}
	public String getMatch_info() {
		return match_info;
	}
	public int getHome_score() {
		return home_score;
	}
	public int getAway_score() {
		return away_score;
	}
	
	public TeamResults(String home_name, String home_team, int home_score, String away_name, String away_team, int away_score, String match_info) {
        this.home_name  = home_name; 
        this.home_team  = home_team;
        this.home_score = home_score;
        this.away_name  = away_name;
        this.away_team  = away_team;
        this.away_score = away_score;
        this.match_info = match_info;
    }

	protected TeamResults() {};
    
}