package hw2;

public class P2GApplication {

		public static void main(String[] args) {
		
		String[] universites = {"George Mason", "Arizona State", "Baylor"};
		int value = universites[0].length();	
		
		for(int index = 0; index<universites.length; index++) {
			System.out.println(universites[index] + ": " + universites[index].length());
		}
		
		for (int index = 0; index<universites.length; index++) {
			if (value > (universites[index].length())) {
				value = (universites[index].length());
			}
		}
		
		System.out.println();
		System.out.println("The smallest name is: " + value);
		
		universites[(int) (Math.random()*3)] = null;
		System.out.println();
		
		for(int index = 0; index<universites.length; index++) {
			System.out.println(universites[index]);
		}
	}
}