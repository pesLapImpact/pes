package com.pes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pes.master.SkillEnum;
import com.pes.service.MainMenuService;
import com.pes.service.MemberRankingService;
import com.pes.service.NewsService;
import com.pes.service.TeamRankingService;
import com.pes.service.TechService;

@Controller
public class MainController {

	@Autowired
	private MainMenuService mainMenuService;
	@Autowired
    private TechService techService;
	@Autowired
    private NewsService newsService;
	@Autowired
    private MemberRankingService memberRankingService;
	@Autowired
    private TeamRankingService teamRankingService;

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("main_menu_list", mainMenuService.findAll());
        return "main";
    }
    
    @GetMapping("/peslapimpact")
    public String peslapimpact(Model model) {
        model.addAttribute("news_list", newsService.findAll());
        return "/peslapimpact/peslapimpact";
    }

    @GetMapping("/news")
    public String news(Model model) {
        model.addAttribute("news_list", newsService.findAll());
        return "/news/news_list";
    }
    
    @GetMapping("/member_ranking")
    public String memberRanking(Model model) {
        model.addAttribute("member_ranking_list", memberRankingService.findAll());
        return "/ranking/member";
    }
    
    @GetMapping("/team_ranking")
    public String teamRanking(Model model) {
        model.addAttribute("team_ranking_list", teamRankingService.findAll());
        return "/ranking/team";
    }
    
    @GetMapping("/portfolio")
    public String portfolio(Model model) {
    	
        for(SkillEnum skill : SkillEnum.values()){
        	String strSkill = skill.toString();
        	model.addAttribute(strSkill, techService.findBySkill(strSkill));
        }
        
        return "portfolio";
    }
    
}