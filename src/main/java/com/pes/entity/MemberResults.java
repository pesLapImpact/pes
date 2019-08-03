package com.pes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class MemberResults extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    private Long   home_member_id;
    private String home_name;
    private String home_team;
    private int    home_score;
    private Long   away_member_id;
    private String away_name;
    private String away_team;
    private int    away_score;
    private Long   match_info_id;
    private String match_info;
    private String match_type;

	public Long getId() {
		return id;
	}
	public Long getHome_member_id() {
		return home_member_id;
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
	public Long getAway_member_id() {
		return away_member_id;
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
	
	public MemberResults(
			  Long   home_member_id
			, String home_name
			, String home_team
			, int    home_score
			, Long   away_member_id
			, String away_name
			, String away_team
			, int    away_score
			, Long   match_info_id
			, String match_info
			, String match_type
			) {
		this.home_member_id = home_member_id;
        this.home_name      = home_name; 
        this.home_team      = home_team;
        this.home_score     = home_score;
        this.away_member_id = away_member_id;
        this.away_name      = away_name;
        this.away_team      = away_team;
        this.away_score     = away_score;
        this.match_info_id  = match_info_id;
        this.match_info     = match_info;
        this.match_type     = match_type;
    }

	protected MemberResults() {};
    
}