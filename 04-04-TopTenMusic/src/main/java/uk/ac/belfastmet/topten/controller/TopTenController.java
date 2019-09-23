package uk.ac.belfastmet.topten.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.topten.domain.TopTen;
import uk.ac.belfastmet.topten.service.TopTenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
@RequestMapping()
public class TopTenController {

	Logger logger = 
			LoggerFactory.getLogger(TopTenController.class);
	/**
	 * 
	 * @return - index html 
	 */
	@RequestMapping(value= "/", method = RequestMethod.GET)
	public String homePage() {
		logger.info("An INFO Message");
		TopTen topten = new TopTen();
		logger.info(topten.toString());
		return "index";

	}

	/**
	 * 
	 * @param model singles page 
	 * @return singles html 
	 */
	@RequestMapping(value = "/singles", method = RequestMethod.GET)
	public String singlesPage(Model model) {

		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten!");
		model.addAttribute("topTen",topTenService.getSinglesTopTen());



		return "singles";

	}
	/**
	 * 
	 * @param model albums page 
	 * @return albums html 
	 */
	@RequestMapping(value = "/albums", method = RequestMethod.GET)
	public String albumsPage(Model model) {

		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten!");
		model.addAttribute("topTen",topTenService.getAlbumsTopTen());

		return "albums";

	}
	/**
	 * 
	 * @param model genre job 
	 * @return genre html 
	 */
	@RequestMapping(value = "/genre", method = RequestMethod.GET)
	public String genrePage(Model model) {

		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten!");
		model.addAttribute("topTen",topTenService.getAlbumsTopTen());

		return "genre";

	}
}


