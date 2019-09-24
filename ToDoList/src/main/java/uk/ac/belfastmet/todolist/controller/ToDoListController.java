package uk.ac.belfastmet.todolist.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private ToDoListService toDoListService;

	Logger logger = LoggerFactory.getLogger(ToDoListController.class);
	
/**
 * 
 * @return index html
 */
	@RequestMapping(value= "/", method = RequestMethod.GET)
	

	public String homePage() {
		toDoListService.getNumberOfTasks();
	
		
		logger.info("An INFO Message");
		ToDoList todolist = new ToDoList();
		logger.info(todolist.toString());
		return "index";

	}
	
	

	@RequestMapping(value= "/current", method = RequestMethod.GET)

	public String currentPage(Model model) {

		ToDoListService toDoListService = new ToDoListService();
		model.addAttribute("pageTitle", "To DO!");
		model.addAttribute("toDoList",toDoListService.getCurrentToDoList());
		
		
		return "current";
	}
	
	
}