package hw4;

public class P4ASong {
	
	private String name;
	
	public P4ASong(String name) {
		this.name = name;
	}
	
	public String toString() {
		String output = new String();
		output = "Song Name: " + name + "\n";
		return output;
	}
}
