package hw2;

public class P2CStudent {

	private String firstName;
	private String lastName;
	private int age;
	private String favSport;
	
	P2CStudent() {
		this.firstName = "Tyler";
		this.lastName = "Warren";
		this.age = 17;
		this.favSport = "Tennis";	
	}
	
	P2CStudent(String firstName, String lastName, int age, String favSport) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.favSport = favSport;
	}
	
	public String toString() {
		String output = new String();
		output = "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" +
				"Age: " + age + "\n" + "Favorite Sport: " + favSport + "\n";
		return output;
	}
}
