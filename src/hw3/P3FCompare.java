package hw3;

public class P3FCompare {

	public static void main(String[] args) {
		String school1 = new String("Standford");
		String school2 = new String("Oregon");
		String school3 = new String("UCLA");
		
		System.out.println(school1.compareTo(school2));
		/* 
		 * a) compareTo is cross checking the first letter of one string (school1)
		 * with another (school2) and printing out number of characters away from each other
		 * they are.
		 * 
		 * b) When compartTo is used and the starting letter of the two strings are the same,
		 * the first character is ignored and it prints out the number of characters away from
		 * each other the two characters are.
		*/
	}

}
