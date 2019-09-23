package uk.ac.belfastmet.topten.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


import uk.ac.belfastmet.topten.domain.TopTen;

@Service
public class TopTenService {
	private ArrayList<TopTen> singlesTopTen;
	private ArrayList<TopTen> albumsTopTen;

	public ArrayList<TopTen> getSinglesTopTen(){

		this.singlesTopTen = new ArrayList<TopTen>();

		this.singlesTopTen.add(new TopTen("Take Me Back to London (feat. Stormzy) ", "Ed Sheeran", "Number1.jpg"));
		this.singlesTopTen.add(new TopTen("Taste (Make It Shake)", "Aitch", "Number2.jpg"));
		this.singlesTopTen.add(new TopTen("Higher Love", "Kygo & Whitney Houston", "Number3.jpg"));
		this.singlesTopTen.add(new TopTen("Ladbroke Grove", "AJ Tracey", "Number4.jpg"));
		this.singlesTopTen.add(new TopTen("Circles", "Post Malone", "Number5.jpg"));
		this.singlesTopTen.add(new TopTen("Joel Sorry", "Joel Corry", "Number6.jpg"));
		this.singlesTopTen.add(new TopTen("3 Nights", "Dominic Fike", "Number7.jpg"));
		this.singlesTopTen.add(new TopTen("Ransom", "Lil Tecca", "Number8.jpg"));
		this.singlesTopTen.add(new TopTen("Strike A Pose (feat. Aitch)", "Young T & Bugsey", "Number9.jpg"));
		this.singlesTopTen.add(new TopTen("Goodbyes (feat. Young Thug) ", "Post Malone", "Number10.jpg"));


		return this.singlesTopTen;

	}

	public ArrayList<TopTen> getAlbumsTopTen(){

		this.albumsTopTen = new ArrayList<TopTen>();
		this.albumsTopTen.add(new TopTen("Hollywood's Bleeding", "Post Malone", "Album1.jpg"));
		this.albumsTopTen.add(new TopTen("No. 6 Collaborations Project", "Ed Sheeran", "Album2.jpg"));
		this.albumsTopTen.add(new TopTen("AitcH2O", "Aitch", "Album3.jpg"));
		this.albumsTopTen.add(new TopTen("Lover", "Taylor Swift", "Album4.jpg"));
		this.albumsTopTen.add(new TopTen("Divinely Uninspired To A Hellish Extent", "Lewis Capaldi", "Album5.jpg"));
		this.albumsTopTen.add(new TopTen("Backbone", "Status Quo", "Album6.jpg"));
		this.albumsTopTen.add(new TopTen("Norman F**king Rockwell", "Lana Del Ray", "Album7.jpg"));
		this.albumsTopTen.add(new TopTen("K-12", "Melanie Martinez", "Album8.jpg"));
		this.albumsTopTen.add(new TopTen("Snacks", "Jax Jones", "Album9.jpg"));
		this.albumsTopTen.add(new TopTen("WHEN WE ALL FALL ASLEEP, WHERE DO WE GO?", "Billie Eilish", "Album10.jpg"));


		return this.albumsTopTen;
	}
}


