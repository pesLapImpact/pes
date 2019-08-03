package com.pes.dto;

import com.pes.entity.TeamResults;

public class TeamResultResponseDto {
	
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

	public TeamResultResponseDto(TeamResults entity) {
        id         = entity.getId();
        home_name  = entity.getHome_name(); 
        home_team  = entity.getHome_team();
        home_score = entity.getHome_score();
        away_name  = entity.getAway_name();
        away_team  = entity.getAway_team();
        away_score = entity.getAway_score();
        match_info = entity.getHome_name();
    }
}