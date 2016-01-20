package hw4;

public class P4CRoster {

	private double maxGPA = 0.0;
	private int ctr;
	
	private P4CStudent[] students;
	
	P4CRoster () {
		this.students = new P4CStudent[3];
		
		students[0] = new P4CStudent("Tyler", 5.0, 5.0, 5.0, 4.0, 4.0);
		students[1] = new P4CStudent("Tom" , 5.0, 5.0, 4.0, 4.0, 3.0);
		students[2] = new P4CStudent("Matt", 5.0, 5.0, 5.0, 5.0, 4.0);
	}
	
	public int findStudentWithMaxGPA() {
		for (int i = 0; i<students.length; i++) {
			if (students[i].calcGPA() > maxGPA) {
				maxGPA = students[i].calcGPA();
				ctr = i;
			}
		}
		return ctr+1;
	}
	
	public String toString() {
		String output = new String();
		
		for (P4CStudent student : students) {
			output += student;
		}
		
		output = "The student with the max GPA is:\n" +
				findStudentWithMaxGPA() + " with a " + (students[ctr]).calcGPA();
		
		return output;
	}
}
