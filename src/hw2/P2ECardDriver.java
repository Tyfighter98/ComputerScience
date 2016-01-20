package hw2;

public class P2ECardDriver {
	
	public static void main(String[] args) {
		String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};
		String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
		
		// Card 1
		P2ECard card1 = new P2ECard();
		
		// Card 2
		P2ECard card2 = new P2ECard(values[(int) (Math.random()*9)],
				suits[(int) (Math.random()*4)]);
		
		// Card 3
		P2ECard card3 = new P2ECard(values[(int) ((Math.random()*4) + 9)], 
				suits[(int) (Math.random()*4)]);
		
		P2ECard[] hand = {card1, card2, card3};
		
		// Output
		System.out.println("Your hand: \n");
		for (int index = 0; index<3; index++) {
			System.out.println(hand[index]);
		}
			
	}
}
