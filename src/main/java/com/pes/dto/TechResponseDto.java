package com.pes.dto;

import com.pes.entity.Tech;

public class TechResponseDto {

    private String img_src;
    private String img_desc;

	public String getImgSrc() {
		return img_src;
	}
	public String getImgDesc() {
		return img_desc;
	}

	public TechResponseDto(Tech entity) {
        img_src = entity.getImgSrc();
        img_desc = entity.getImgDesc();
    }
	
}