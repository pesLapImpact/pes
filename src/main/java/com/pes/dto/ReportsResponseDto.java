package com.pes.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import com.pes.entity.Comments;
import com.pes.entity.Reports;

public class ReportsResponseDto {
	
    private Long   id;
    private Long   match_id;
    private String youtube_src;
    private String report_title;
    private String report_header;
    private String report_content;
    private String reporter;
    private String home_name;
    private String away_name;
    private String date_from;
    private String date_to;
    private List<Comments> comments_list;
    
	public ReportsResponseDto(
			Reports reports 
			, List<Comments> comments_list
			) {
		this.id             = reports.getId();
		this.match_id       = reports.getResult_id();
		this.youtube_src    = reports.getYoutube_src();
		this.report_title   = reports.getReport_title();
		this.report_header  = reports.getReport_header();
		this.report_content = reports.getReport_content();
		this.home_name      = reports.getHome_name();
		this.away_name      = reports.getAway_name();
        this.date_from      = toStringDateTime(reports.getDate_from());
        this.date_to        = toStringDateTime(reports.getDate_to());
        this.comments_list  = comments_list;
    }

	public Long getId() {
		return id;
	}

	public Long getMatch_id() {
		return match_id;
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
	
	public String getDate_from() {
		return date_from;
	}

	public String getDate_to() {
		return date_to;
	}

	public List<Comments> getComments_list() {
		return comments_list;
	}

	private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
