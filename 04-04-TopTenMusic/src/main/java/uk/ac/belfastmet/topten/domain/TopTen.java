package uk.ac.belfastmet.topten.domain;

public class TopTen {

	//instance variables 
	private String name;
	private String artist;
	private String image;

	//constructors
	public TopTen() {
		super();
	}
	public TopTen(String name, String artist, String image) {
		super();
		this.name = name;
		this.artist = artist;
		this.image = image;
	}
	public String toString() {
		return name + "" + artist;
	}

	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public String getArtist() {
	//return artist;
	//}
	//public void setArtist(String artist) {
	//this.artist = artist;
	//	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}


}




