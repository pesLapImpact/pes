package com.pes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pes.entity.BaseTimeEntity;

@Entity
public class MainMenu extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public MainMenu(String link, String img, String main_caption, String sub_caption) {
        this.link = link;
        this.img = img;
        this.main_caption = main_caption;
        this.sub_caption = sub_caption;
    }

	protected MainMenu() {};
    
}