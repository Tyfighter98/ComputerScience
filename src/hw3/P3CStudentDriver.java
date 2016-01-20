package hw3;

public class P3CStudentDriver {

	public static void main(String[] args) {
		
		P3CStudent senior = new P3CStudent("Joe", "Senior",
				4.0, 4.0, 3.5, 4.0, 4.0);
		System.out.println(senior);
		senior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
		System.out.println("\n" + senior);
	}
}
