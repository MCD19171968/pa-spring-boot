package uk.ac.belfastmet.todolist.service;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todolist.domain.ToDoList;


import java.util.ArrayList;

@Service
public class ToDoListService {
	private ArrayList<ToDoList> currentToDoList;

	public ArrayList<ToDoList> getCurrentToDoList(){

		this.currentToDoList = new ArrayList<ToDoList>();

		this.currentToDoList.add(new ToDoList("House Work", "30-09-19", "Painting", "Low", false));
		this.currentToDoList.add(new ToDoList("Gardening", "25-09-19", "Cut grass", "High", false));
		this.currentToDoList.add(new ToDoList("House Work", "29-09-19", "Clean windows", "Low", false));
		this.currentToDoList.add(new ToDoList("Gardening", "24-09-19", "Clear drains", "High", false));


		return this.currentToDoList;


	}
}
