package com.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class MatchResult extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(length = 500, nullable = false)
    private int home_id;
	
	@Column(length = 500, nullable = false)
    private int home_goal;
	
	@Column(length = 500, nullable = true)
    private int home_possesion;
	
	@Column(length = 500, nullable = true)
    private int home_added_rating;
	
	@Column(length = 500, nullable = false)
    private int away_id;
	
	@Column(length = 500, nullable = false)
    private int away_goal;
	
	@Column(length = 500, nullable = true)
    private int away_possesion;
	
	@Column(length = 500, nullable = true)
	private int away_added_rating;

	public Long getId() {
		return id;
	}
	
	public int getHome_id() {
		return home_id;
	}

	public int getHome_goal() {
		return home_goal;
	}

	public int getHome_possesion() {
		return home_possesion;
	}

	public int getHome_added_rating() {
		return home_added_rating;
	}

	public int getAway_id() {
		return away_id;
	}

	public int getAway_goal() {
		return away_goal;
	}

	public int getAway_possesion() {
		return away_possesion;
	}

	public int getAway_added_rating() {
		return away_added_rating;
	}


	protected MatchResult() {};
	
	protected MatchResult(
			int home_id
			, int home_goal
			, int home_possesion
			, int home_added_rating
			, int away_goal
			, int away_possesion
			, int away_added_rating
			) {
		this.home_id           = home_id;
		this.home_goal         = home_goal;
		this.home_possesion    = home_possesion;
		this.home_added_rating = home_added_rating;
		this.away_goal         = away_goal;
		this.away_possesion    = away_possesion;
		this.away_added_rating = away_added_rating;
	};
}