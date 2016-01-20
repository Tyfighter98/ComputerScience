package hw3;

public class P3DEnhancedStudentDriver {

	public static void main(String[] args) {
		
		P3DEnhancedStudent senior = new P3DEnhancedStudent("Joe", "Senior",
				4.0, 4.0, 3.5, 4.0, 4.0);
		System.out.println(senior);
		senior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
		System.out.println("\n" + senior);
	}
}
