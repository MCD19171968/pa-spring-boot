package uk.ac.belfastmet.todolist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "task")
/**
 * 
 * @author MCD19171968
 *
 */
public class ToDoList {
	// Variables 
	private long id;
	private String name;
	private String description;
	private String user;
	private String priority;
	//private Boolean completion;

	// Constructors

	public ToDoList() {
		super();
	}
	/**
	 * 
	 * @param name
	 * @param description
	 * @param user
	 * @param priority
	 */
	public ToDoList(String name, String description, String user, String priority) {
		super();
		this.name = name; //getters & setters appropriate to this
		this.description = description; // getters & setters error on date: not found
		this.user = user; //work on getters and setters
		this.priority = priority;
	
	}
	public String toString() {
		return name + description + user + priority;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setid(long id) { 
		this.id = id;
	}

	//  Getters and setters
	@Column(name = "name")
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() { 
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "user")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}


	//	public Boolean getCompletion() {
	//		return completion;
	//	}
	//	public void setCompletion(Boolean completion) {
	//		this.completion = completion;
	//	} 



}
