package com.pes.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.pes.entity.MemberResults;

public class MemberResultResponseDto {
	
    private Long   id;
    private String home_name;
    private String home_team;
    private int    home_score;
    private String away_name;
    private String away_team;
    private int    away_score;
    private String date;
    private int    home_rating;
    private int    away_rating;
    private Long   match_info_id;
    private String match_info;
    private String match_type;
    private int    comment_count;
    
	public MemberResultResponseDto(
			MemberResults memberResult
			, int homeRating
			, int awayRating
			, int comment_count
			) {
		this.id            = memberResult.getId();
        this.home_name     = memberResult.getHome_name(); 
        this.home_team     = memberResult.getHome_team();
        this.home_score    = memberResult.getHome_score();
        this.away_name     = memberResult.getAway_name();
        this.away_team     = memberResult.getAway_team();
        this.away_score    = memberResult.getAway_score();
        this.match_info_id = memberResult.getMatch_info_id();
        this.match_info    = memberResult.getMatch_info();
        this.match_type    = memberResult.getMatch_type();
        this.date          = toStringDateTime(memberResult.getModifiedDate());
        this.home_rating   = homeRating;
        this.away_rating   = awayRating;
        this.comment_count = comment_count;
    }
	
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
	public int getHome_score() {
		return home_score;
	}
	public int getAway_score() {
		return away_score;
	}
	public Long getMatch_info_id() {
		return match_info_id;
	}
	public String getMatch_info() {
		return match_info;
	}
	public String getMatch_type() {
		return match_type;
	}
	public String getDate() {
		return date;
	}
	public int getHome_rating() {
		return home_rating;
	}
	public int getAway_rating() {
		return away_rating;
	}
	public int getComment_count() {
		return comment_count;
	}

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
