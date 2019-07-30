package com.pes.dto;

import com.pes.entity.MainMenu;

public class MainMenuResponseDto {
	
    private Long id;
    private String link;
    private String img;
    private String main_caption;
    private String sub_caption;

	public Long getId() {return id;}
	public String getLink() {return link;}
    public String getImg() {return img;}
	public String getMain_caption() {return main_caption;}
	public String getSub_caption() {return sub_caption;}

	public MainMenuResponseDto(MainMenu entity) {
        id = entity.getId();
        link = entity.getLink();
        img = entity.getImg();
        main_caption = entity.getMain_caption();
        sub_caption = entity.getSub_caption();
    }
}