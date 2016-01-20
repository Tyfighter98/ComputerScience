package hw2;

public class P2DChoice {

	private String firstName;
	private boolean isMale;
	
	P2DChoice() {
		this.firstName = "Tyler";
		this.isMale = true;
	}
	
	P2DChoice(String firstName, boolean isMale) {
		this.firstName = firstName;
		this.isMale = isMale;
	}
	
	public String toString() {
		String output = new String();
		output = "First name: " + firstName + "\n" + "Male?: " + isMale + "\n";
		return output;
	}
}
