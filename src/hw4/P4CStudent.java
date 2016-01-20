package hw4;

public class P4CStudent {

	private String name;
	private double english;
	private double math;
	private double science;
	private double fineArts;
	private double socialScience;
	double[] grades = new double[5];
	
	P4CStudent (String name, double english, double math, double science, double fineArts, double socialScience) {
		this.name = name;
		this.grades[0] = english;
		this.grades[1] = math;
		this.grades[2] = science;
		this.grades[3] = fineArts;
		this.grades[4] = socialScience;
	}
	
	public double calcGPA() {
		double output = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4])/5;
		return output;
	}
	// String.format("%.2f", calcGPA())
}
