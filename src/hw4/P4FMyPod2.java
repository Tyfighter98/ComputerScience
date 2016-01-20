package hw4;

import java.util.ArrayList;

public class P4FMyPod2 {

	private String color;
	private int storage;
	private ArrayList<P4FSong2> songLibrary;
	
	public P4FMyPod2() {
		color = "Green";
		storage = 32;
		 
		this.songLibrary = new ArrayList<P4FSong2>();
		this.songLibrary.add(new P4FSong2("Concrete Jungle"));
		this.songLibrary.add(new P4FSong2("Just Like That"));
	}
	
	public String toString() {
		String output = new String();
		output = "Color: " + color + "\nStorage: " + storage + "GB" + "\n";
		
		for (P4FSong2 song : songLibrary) {
			output += song;
		}
		return output;
	}
}
