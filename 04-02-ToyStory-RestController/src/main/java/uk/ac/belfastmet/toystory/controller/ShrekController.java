package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/shrekmovie") 
@RestController

public class ShrekController {
	
	
	   @GetMapping("/")
		public String home() {
			return "Movie characters home page";
		}
		
		@GetMapping("/shrek")
		public String shrek() {
			return "Shrek was played by Mike Myers";
		}
		
		@GetMapping("/donkey")
		public String donkey() {
			return "Donkey was palyed by Eddie Murphy";
		}

}

