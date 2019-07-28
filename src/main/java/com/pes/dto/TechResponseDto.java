package com.pes.dto;

import com.pes.entity.Tech;

public class TechResponseDto {

	private Long   id;
    private String img_src;
    private String tech_desc;
    private String level;
    private String skill;

	public Long getId() {
		return id;
	}
	public String getImg_src() {
		return img_src;
	}
	public String getTech_desc() {
		return tech_desc;
	}
	public String getLevel() {
		return level;
	}
	public String getSkill() {
		return skill;
	}

	public TechResponseDto(Tech entity) {
		id        = entity.getId();
        img_src   = entity.getImg_src();
        tech_desc = entity.getTech_desc();
        level     = entity.getLevel();
        skill     = entity.getSkill();
    }
	
}