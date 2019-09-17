package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	
//	@GetMapping("/Woody")
//	public String woody() {
//		return "Woody was played by Tom Hanks";
//	}
//	
//	@GetMapping("/Buzz")
//	public String buzz() {
//		return "Buzz was played by Tim Allen";
//	}
//	
//	@GetMapping("/Andy")
//	public String andy() {
//		return "Andy was played by ...";
//	}
//	
//	@GetMapping("/Rex")
//	public String rex() {
//		return "Rex was played by ...";
//	}
	
	

}
