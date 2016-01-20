package hw4;

import java.util.ArrayList;

public class P4DFamily {
	
	public static void main(String[] args) {
		ArrayList<String> myFamily = new ArrayList<String>();
	
		myFamily.add("Tyler");
		myFamily.add("Josh");
		myFamily.add("Jeff");
		myFamily.add("Kelli");
		myFamily.add("Lynx");
		
		System.out.println("My Family has " + myFamily.size() + " members");
		System.out.println("Their names are:");
		
		for (int i = 0; i<(myFamily.size()); i++) {
			System.out.println(myFamily.get(i));
		}
		
		System.out.println("\nFor each loop:");
		
		for (String name : myFamily) {
			System.out.println(name);
		}
	}
}
