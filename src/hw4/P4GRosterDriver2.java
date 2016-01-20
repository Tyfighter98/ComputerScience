package hw4;

public class P4GRosterDriver2 {

	public static void main (String[] args) {
		P4GRoster2 apComputerScience = new P4GRoster2();
		
		apComputerScience.addStudent(new P4GStudent("Tom", "Kamman", "Freshamn", 14, 3.0, 3.5, 4.0, 3.0, 3.5));
		apComputerScience.addStudent(new P4GStudent("Tyler", "Warren", "Senior", 17, 4.0, 3.5, 4.0, 4.0, 3.5));
		apComputerScience.addStudent(new P4GStudent("Trevor", "Headstrom", "Junior", 16, 3.0, 2.5, 3.0, 3.0, 3.5));
		
		System.out.println(apComputerScience);
		
		apComputerScience.dropStudent("Headstrom");
		System.out.println("Updated Rsoter without Headstrom:\n");
		System.out.println(apComputerScience);
	}
}
