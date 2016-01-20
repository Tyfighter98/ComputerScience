package hw2;

public class P2ECard {
	private String suit;
	private String value;
	
	// Card 1
	P2ECard() {
		this.value = "Blank";
		this.suit = "Blank";
	}
	
	// Card 2 & 3
	P2ECard(String value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public String toString() {
		String output = new String();
		output = "Your card is the " + value + " of " + suit;
		return output;
	}
}
