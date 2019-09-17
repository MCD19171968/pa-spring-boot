package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		dwarfs.add(new Dwarf("Sleepy", "Disney"));
		dwarfs.add(new Dwarf("Happy", "Disney"));
		dwarfs.add(new Dwarf("Grumpy", "Disney"));
		dwarfs.add(new Dwarf("Dopey", "Disney"));
		dwarfs.add(new Dwarf("Bashful", "Disney"));
		dwarfs.add(new Dwarf("Doc", "Disney"));
		dwarfs.add(new Dwarf("Sneezy", "Disney"));
		
		dwarfs.add(new Dwarf("Thorin", "Tolkien"));
		dwarfs.add(new Dwarf("Balin", "Tolkien"));
		dwarfs.add(new Dwarf("Dwalin", "Tolkien"));
		
		System.out.println("These are Disney: ");

		for(Dwarf dwarf: dwarfs) {
			//System.out.println(dwarf.getAuthor() + "    " + dwarf.getName());
			if (dwarf.getAuthor() == "Disney") {
				System.out.println(dwarf.getName());
			}
		}
		
		System.out.println("These are Tolkien: ");

		for(Dwarf dwarf: dwarfs) {
			//System.out.println(dwarf.getAuthor() + "    " + dwarf.getName());
			if (dwarf.getAuthor() == "Tolkien") {
				System.out.println(dwarf.getName());
			}
		}
	}




}

