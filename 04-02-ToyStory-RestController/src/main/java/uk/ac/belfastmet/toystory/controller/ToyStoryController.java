package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/toystory") 
@RestController

public class ToyStoryController {
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("/andy")
	public String andy() {
		return "Andy was played by ...";
	}
	
	@GetMapping("/rex")
	public String rex() {
		return "Rex was played by ...";
	}

}
