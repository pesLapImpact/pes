package com.pes.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reports extends BaseTimeEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    private Long   result_id;
    private String youtube_src;
    private String report_title;
    private String report_header;
    @Column(columnDefinition = "TEXT", length = 5000, nullable = false)
    private String report_content;
    private String reporter;
    private String home_name;
    private String away_name;
    private LocalDateTime date_from;
    private LocalDateTime date_to;
    
	public Reports(
			 Long   id
			,Long   result_id
			,String youtube_src
			,String report_title
			,String report_header
			,String report_content
			,String reporter
			,String home_name
			,String away_name
			,LocalDateTime date_from
			,LocalDateTime date_to
			) {
		this.id             = id;
		this.result_id      = result_id;
		this.youtube_src    = youtube_src;
		this.report_title   = report_title;
		this.report_header  = report_header;
		this.report_content = report_content;
		this.reporter       = reporter;
		this.home_name      = home_name;
		this.away_name      = away_name;
        this.date_from      = date_from;
        this.date_to        = date_to;
    }

	protected Reports() {}

	public Long getId() {
		return id;
	}

	public Long getResult_id() {
		return result_id;
	}

	public String getYoutube_src() {
		return youtube_src;
	}
	
	public String getReport_title() {
		return report_title;
	}

	public String getReport_header() {
		return report_header;
	}

	public String getReport_content() {
		return report_content;
	}

	public String getReporter() {
		return reporter;
	}
	
	public String getHome_name() {
		return home_name;
	}
	
	public String getAway_name() {
		return away_name;
	}

	public LocalDateTime getDate_from() {
		return date_from;
	}

	public LocalDateTime getDate_to() {
		return date_to;
	};
	
}
