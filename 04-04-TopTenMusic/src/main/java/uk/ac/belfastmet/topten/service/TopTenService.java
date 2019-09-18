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

		this.singlesTopTen.add(new TopTen("Take Me Back to London (feat. Stormzy) ", "Singles", "number1.jpg"));
		this.singlesTopTen.add(new TopTen("Happy", "Singles", "Happy.png"));
		this.singlesTopTen.add(new TopTen("Bashful", "Singles", "Bashful.png"));
		this.singlesTopTen.add(new TopTen("Dopey", "Singles", "Dopey.png"));
		this.singlesTopTen.add(new TopTen("Doc", "Singles", "Doc.png"));
		this.singlesTopTen.add(new TopTen("Grumpy", "Singles", "Grumpy.png"));
		this.singlesTopTen.add(new TopTen("Sneezy", "Singles", "Sneezy.png"));
		this.singlesTopTen.add(new TopTen("Sneezy", "Singles", "Sneezy.png"));
		this.singlesTopTen.add(new TopTen("Sneezy", "Singles", "Sneezy.png"));
		this.singlesTopTen.add(new TopTen("Sneezy", "Singles", "Sneezy.png"));


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


