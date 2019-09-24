package uk.ac.belfastmet.todolist.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todolist.controller.ToDoListController;
import uk.ac.belfastmet.todolist.domain.ToDoList;
import uk.ac.belfastmet.todolist.service.ToDoListService;
@RequestMapping()
@Controller
public class ToDoListController {

	Logger logger = LoggerFactory.getLogger(ToDoListController.class);
	
/**
 * 
 * @return index html
 */
	@RequestMapping(value= "/", method = RequestMethod.GET)
	

	public String homePage() {
	
		
		logger.info("An INFO Message");
		ToDoList todolist = new ToDoList();
		logger.info(todolist.toString());
		return "index";

	}
	
	
/**
 * 
 * @param model
 * @return current html
 */
	@RequestMapping(value= "/current", method = RequestMethod.GET)

	public String currentPage(Model model) {

		ToDoListService toDoListService = new ToDoListService();
		model.addAttribute("pageTitle", "To DO!");
		model.addAttribute("toDoList",toDoListService.getCurrentToDoList());
		
		
		return "current";
	}
	/**
	 * 
	 * @param model
	 * @return completed html
	 */

	@RequestMapping(value= "/completed", method = RequestMethod.GET)

	public String completedPage(Model model) {

		ToDoListService toDoListService = new ToDoListService();
		model.addAttribute("pageTitle", "Done!");
		model.addAttribute("toDoList",toDoListService.getCompletedToDoList());


		return "completed";
		
	}
	
	
}