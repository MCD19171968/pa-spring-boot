package uk.ac.belfastmet.todolist.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

//import uk.ac.belfastmet.todolist.controller.ToDoListController;
import uk.ac.belfastmet.todolist.domain.ToDoList;


import java.util.ArrayList;

@Service
public class ToDoListService {
	Logger logger = LoggerFactory.getLogger(ToDoListService.class);

	private ArrayList<ToDoList> currentToDoList;
	private ArrayList<ToDoList> completedToDoList;

	
	
	public ArrayList<ToDoList> getCurrentToDoList(){

		this.currentToDoList = new ArrayList<ToDoList>();

		this.currentToDoList.add(new ToDoList("House Work", "30-09-19", "Painting", "Low", false));
		this.currentToDoList.add(new ToDoList("Gardening", "25-09-19", "Cut grass", "High", false));
		this.currentToDoList.add(new ToDoList("House Work", "29-09-19", "Clean windows", "Low", true));
		this.currentToDoList.add(new ToDoList("Gardening", "24-09-19", "Clear drains", "High", true));


		return this.currentToDoList;


	}

	public ArrayList<ToDoList> getCompletedToDoList(){

		this.completedToDoList = new ArrayList<ToDoList>();

		getCurrentToDoList();
		for (int i = 0; i < currentToDoList.size(); i++) {
			logger.info(" inside for loop");
			ToDoList newList = currentToDoList.get(i);

			if(newList.getCompletion() == true) {
				logger.info("inside if");
				this.completedToDoList.add(newList);

			}


		}

		return this.completedToDoList;
	}
}
