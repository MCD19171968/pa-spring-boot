package uk.ac.belfastmet.topten.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.topten.service.TopTenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
@RequestMapping()
public class TopTenController {
	
	Logger logger = 
			LoggerFactory.getLogger(TopTenController.class);

	@RequestMapping(value= "/", method = RequestMethod.GET)
	public String homePage() {
		logger.info("An INFO Message");
		return "index";
		
	}
	
	@RequestMapping(value = "/singles", method = RequestMethod.GET)
	public String singlesPage(Model model) {
		
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten!");
		model.addAttribute("topTen",topTenService.getSinglesTopTen());
		

		
		return "singles";
		
	}
	
	@RequestMapping(value = "/albums", method = RequestMethod.GET)
	public String albumsPage(Model model) {
		
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten!");
		model.addAttribute("topTen",topTenService.getAlbumsTopTen());
		
		return "albums";
		
	}
}


