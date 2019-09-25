package uk.ac.belfastmet.todolist.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import java.util.Iterator;

import uk.ac.belfastmet.todolist.domain.ToDoList;
import uk.ac.belfastmet.todolist.repository.TaskRepository;

import java.util.ArrayList;

@Service
public class ToDoListService {

	@Autowired
	private TaskRepository taskRepository;

	Logger logger = LoggerFactory.getLogger(ToDoListService.class);

	private ArrayList<ToDoList> currentToDoList;
	//private ArrayList<ToDoList> completedToDoList;

	public ArrayList<ToDoList> getCurrentToDoList(){
		//public void getCurrentToDoList(){
		logger.info("# of tasks: {}", taskRepository.count());

		this.currentToDoList = new ArrayList<ToDoList>();

		Iterable <ToDoList> toDoListTasks = taskRepository.findAll();
		Iterator<ToDoList> iterator = toDoListTasks.iterator();
		//ArrayList<ToDoList> todoList = new ArrayList<ToDoList>();

		while(iterator.hasNext()) {
			//logger.info("{}", iterator.next().toString());


			this.currentToDoList.add(iterator.next());
		}
		logger.info(" current to do list" + this.currentToDoList);
		return this.currentToDoList;


		//		this.currentToDoList.add(new ToDoList("House Work", "30-09-19", "Painting", "Low")); 
		//		this.currentToDoList.add(new ToDoList("Gardening", "25-09-19", "Cut grass", "High"));
		//		this.currentToDoList.add(new ToDoList("House Work", "29-09-19", "Clean windows", "Low"));
		//		this.currentToDoList.add(new ToDoList("Gardening", "24-09-19", "Clear drains", "High"));
		//
		//		logger.info("string" + this.currentToDoList);
		//		return this.currentToDoList;


		/**
		 * 
		 * @return completed toDoList 
		 */

		//	public ArrayList<ToDoList> getCompletedToDoList(){
		//
		//		this.completedToDoList = new ArrayList<ToDoList>();
		//
		//
		//		getCurrentToDoList();
		//		for (int i = 0; i < currentToDoList.size(); i++) {
		//			logger.info(" inside for loop");
		//			ToDoList newList = currentToDoList.get(i);
		//
		//
		//			if(newList.getCompletion() == true) {
		//				logger.info("inside if");
		//				this.completedToDoList.add(newList);
		//			}
		//
		//		}
		//		return this.completedToDoList;
		//	}

	}
}