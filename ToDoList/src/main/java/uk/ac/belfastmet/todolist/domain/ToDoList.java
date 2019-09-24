package uk.ac.belfastmet.todolist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "task")

public class ToDoList {
// Variables 
	private long id;
	private String description;
	private String date;
	private String name;
	private String priority;
	//private Boolean completion;

// Constructors
	public ToDoList() {
		super();
	}

	public ToDoList(String description, String date, String name, String priority, Boolean completion) {
		super();
		this.description = description;
		this.date = date;
		this.name = name;
		this.priority = priority;
		//this.completion = completion;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getID() {
		return id;
	}
	
	//  Getters and setters

	
	@Column(name = "name")
	public String getDescription() {
		return description;
	}
	
	public void setid(long id) {
		this.id = id;
	}
	
	@Column(name = "description")
	public String getDate() { 
		return date;
	}
	public void setid1(long id) {
		this.id = id;
	}
	
	@Column(name = "user")
	public String getName() {
		return name;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}
	public void setID(long id) {
		this.id = id;
	}
	
//	public Boolean getCompletion() {
//		return completion;
//	}
//	public void setCompletion(Boolean completion) {
//		this.completion = completion;
//	} 



}
