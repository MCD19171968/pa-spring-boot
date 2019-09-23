package uk.ac.belfastmet.todolist.domain;

public class ToDoList {

	private String description;
	private String date;
	private String name;
	private String priority;
	private Boolean completion;

	public String getDescription() {
		return description;
	}

	public ToDoList() {
		super();
	}

	public ToDoList(String description, String date, String name, String priority, Boolean completion) {
		super();
		this.description = description;
		this.date = date;
		this.name = name;
		this.priority = priority;
		this.completion = completion;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() { 
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Boolean getCompletion() {
		return completion;
	}
	public void setCompletion(Boolean completion) {
		this.completion = completion;
	} 



}
