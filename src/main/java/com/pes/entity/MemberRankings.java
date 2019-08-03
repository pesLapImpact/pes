package com.pes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class MemberRankings extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long member_id;
    private String name;
    private int ranking;
    private int rating;
    private int win;
    private int draw;
    private int lose;

	public Long getId() {
		return id;
	}
	public Long getMemberId() {
		return member_id;
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

	public MemberRankings(Long member_id, String name, int ranking, int rating, int win, int draw, int lose) {
		this.member_id = member_id;
		this.name      = name;
        this.ranking   = ranking;
        this.rating    = rating;
        this.win       = win;
        this.draw      = draw;
        this.lose      = lose;
    }

	protected MemberRankings() {};
    
}