package com.pes.dto;

import com.pes.entity.TeamRankings;

public class TeamRankingResponseDto {
	
    private Long id;
    private String name;
    private int ranking;
    private int rating;
    private int win;
    private int draw;
    private int lose;

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getRanking() {
		return ranking;
	}
	public int getRating() {
		return rating;
	}
	public int getWin() {
		return win;
	}
	public int getDraw() {
		return draw;
	}
	public int getLose() {
		return lose;
	}

	public TeamRankingResponseDto(TeamRankings entity) {
        id      = entity.getId();
        name    = entity.getName();
        ranking = entity.getRanking();
        rating  = entity.getRating();
        win     = entity.getWin();
        draw    = entity.getDraw();
        lose    = entity.getLose();
    }
}