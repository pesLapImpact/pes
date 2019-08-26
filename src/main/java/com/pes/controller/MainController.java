package com.pes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pes.master.SkillEnum;
import com.pes.service.CupService;
import com.pes.service.MainMenuService;
import com.pes.service.MemberRankingsService;
import com.pes.service.MemberResultsService;
import com.pes.service.NewsService;
import com.pes.service.ReportsService;
import com.pes.service.TeamRankingsService;
import com.pes.service.TeamResultsService;
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
    private MemberRankingsService memberRankingsService;
	@Autowired
    private TeamRankingsService teamRankingsService;
	@Autowired
    private MemberResultsService memberResultsService;
	@Autowired
    private TeamResultsService teamResultsService;
	@Autowired
    private CupService cupService;
	@Autowired
    private ReportsService reportsService;
	
	@RequestMapping("/report/{id}")
	public String report(Model model, @PathVariable Long id) {
        model.addAttribute("reports_list", reportsService.findReportById(id));
        
        return "/result/report";
    }
	
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
        return "/news/news";
    }
    
    @GetMapping("/member_ranking")
    public String memberRanking(Model model) {
        model.addAttribute("member_ranking_list", memberRankingsService.findAll());
        return "/ranking/member";
    }
    
    @GetMapping("/team_ranking")
    public String teamRanking(Model model) {
        model.addAttribute("team_ranking_list", teamRankingsService.findAll());
        return "/ranking/team";
    }
    
    @GetMapping("/member_result")
    public String memberResult(Model model) {
        model.addAttribute("member_result_list", memberResultsService.findAll());
        return "/result/member/member";
    }
    
    @GetMapping("/team_result")
    public String teamResult(Model model) {
        model.addAttribute("team_ranking_list", teamResultsService.findAll());
        return "/result/team/team";
    }    

    @GetMapping("/cup")
    public String cup(Model model) {
        model.addAttribute("cup_list", cupService.findAll());
        return "/peslapimpact/cup/cup";
    }        
    
    
    
    
    
    
    
    
    @GetMapping("/wedding")
    public String wedding(Model model) {
        model.addAttribute("team_ranking_list", teamResultsService.findAll());
        return "wedding";
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