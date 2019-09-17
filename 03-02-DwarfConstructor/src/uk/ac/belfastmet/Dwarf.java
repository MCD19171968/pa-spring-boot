package uk.ac.belfastmet;

public class Dwarf {
	
	private String name;
	private String Author;
	
	//constructor
	public Dwarf(String name, String author) {
		super();
		this.name = name;
		Author = author;
	}
	
	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
	

}
