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
		this.albumsTopTen.add(new TopTen("Balin", "Albums", "Balin.png"));
		this.albumsTopTen.add(new TopTen("Birfur", "Albums", "Bifur.png"));
		this.albumsTopTen.add(new TopTen("Bofur", "Albums", "Bofur.png"));
		this.albumsTopTen.add(new TopTen("Bombur", "Albums", "Bombur.png"));
		this.albumsTopTen.add(new TopTen("Dori", "Albums", "Dori.png"));
		this.albumsTopTen.add(new TopTen("Dwalin", "Albums", "Dwalin.png"));
		this.albumsTopTen.add(new TopTen("Fili", "Albums", "Fili.png"));
		this.albumsTopTen.add(new TopTen("Gloin", "Albums", "Gloin.png"));
		this.albumsTopTen.add(new TopTen("Kili", "Albums", "Kili.png"));
		this.albumsTopTen.add(new TopTen("Nori", "Albums", "Nori.png"));
		

		return this.albumsTopTen;
	}
}


