package hw4;

import java.util.ArrayList;

public class P4EUniversities {
	
	public static void main(String[] args) {
		ArrayList<String> universities = new ArrayList<String>();
		
		universities.add("USD");
		universities.add("UCSD");
		universities.add("UCI");
		universities.add("UCSB");
		universities.add("MIT");
		
		System.out.println("I am applying to " + universities.size() + " universities");
		
		for (String university : universities) {
			System.out.println(university);
		}
		
		for (int i = 0; i<(universities.size()); i++) {
			if ((universities.get(i).length()) > 3) {
				universities.remove(i);
			}
		}
		
		System.out.println("\nRemaining universities: " + universities.size());
		
		for (String university : universities) {
			System.out.println(university);
		}
	}

}
