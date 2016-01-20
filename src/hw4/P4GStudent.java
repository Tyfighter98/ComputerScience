package hw4;

public class P4GStudent {

	private String firstName;
	String lastName;
	private String grade;
	private int age;
	double[] grades = new double[5];
	
	P4GStudent (String firstName, String lastName, String grade, int age, double english, double math, double science, double fineArts, double socialScience) {
		this.firstName = new String(firstName);
		this.lastName = new String(lastName);
		this.grade = new String(grade);
		this.age = age;
		setGPA(english, math, science, fineArts, socialScience);
	}
	
	public void setGPA(double english, double math, double science, double fineArts, double socialScience) {
		this.grades = new double[5];
		this.grades[0] = english;
		this.grades[1] = math;
		this.grades[2] = science;
		this.grades[3] = fineArts;
		this.grades[4] = socialScience;
	}
	
	public double calcGPA() {
		double total = 0;
		total += this.grades[0];
		total += this.grades[1];
		total += this.grades[2];
		total += this.grades[3];
		total += this.grades[4];
		double avgGPA = total/5;
		return avgGPA;
	}
	
	public String toString() {
		String output = new String();
		output = "Name: " + firstName + " " + lastName + "\nGrade: " + grade + "\nAge: " + age + "\nAverage GPA: " + calcGPA() + "\n";
		return output;
	}
	// String.format("%.2f", calcGPA())
}
