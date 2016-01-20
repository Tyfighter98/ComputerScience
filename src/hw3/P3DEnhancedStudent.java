package hw3;


public class P3DEnhancedStudent {

	private String firstName;
	private String lastName;
	
	double[] grades = new double[5];
	
	P3DEnhancedStudent() {
		this.firstName = "Tyler";
		this.lastName = "Warren";
		this.grades[0] = 0.0;
		this.grades[1] = 0.0;
		this.grades[2] = 0.0;
		this.grades[3] = 0.0;
		this.grades[4] = 0.0;
	}
	
	P3DEnhancedStudent(String firstName, String lastName, double english, double math, double science, double fineArts, double socialScience) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades[0] = english;
		this.grades[1] = math;
		this.grades[2] = science;
		this.grades[3] = fineArts;
		this.grades[4] = socialScience;
	}
	
	public void setGPA(double english, double math, double sceince, double fineArts, double socialScinece) {
		this.grades[0] = english;
		this.grades[1] = math;
		this.grades[2] = sceince;
		this.grades[3] = fineArts;
		this.grades[4] = socialScinece;
	}
	
	public double calcGPA() {
		double output = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4])/(grades.length);
		return output;
	}
	
	public String setGrade() {
		if (calcGPA() == 4.0) {
		}
		else if (calcGPA() >= 3.0 && calcGPA() < 4.0) {
			return "B";
		}
		else if (calcGPA() >= 2.0 && calcGPA() < 3.0) {
			return "C";
		}
		else if (calcGPA() >= 1.0 && calcGPA() < 2.0) {
			return "D";
		}
		else if (calcGPA() >= 0.0 && calcGPA() < 1.0) {
			return "F";
		}
		return "A";
	}
	
	public String toString() {
		String output = new String();
		output = "First name: " + firstName + "\n" +
				"Last name: " + lastName + "\n" +
				"GPA: " + String.format("%.2f", calcGPA()) +
				"\n" + lastName + "'s Grade: " + setGrade() + "\n" +
				grades[0] + ", " + grades[1] + ", " + grades[2] + ", " + grades[3] + ", " + grades[4];
		return output;
	}
}
