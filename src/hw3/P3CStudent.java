package hw3;


public class P3CStudent {

	private String firstName;
	private String lastName;
	
	double[] grades = new double[5];
	
	P3CStudent() {
		this.firstName = "Tyler";
		this.lastName = "Warren";
		this.grades[0] = 0.0;
		this.grades[1] = 0.0;
		this.grades[2] = 0.0;
		this.grades[3] = 0.0;
		this.grades[4] = 0.0;
	}
	
	P3CStudent(String firstName, String lastName, double english, double math, double science, double fineArts, double socialScience) {
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
		double output = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4])/5;
		return output;
	}
	
	public String toString() {
		String output = new String();
		output = "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" +
				"English: " + grades[0] + "\n" + "Math: " + grades[1] + "\n" +
				"Science: " + grades[2] + "\n" + "Fine Arts: " + grades[3] + "\n" +
				"Social Science: " + grades[4] + "\n" + "GPA: " + String.format("%.2f", calcGPA());
		return output;
	}
}
