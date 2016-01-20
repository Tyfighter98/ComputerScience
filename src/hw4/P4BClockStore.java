package hw4;

public class P4BClockStore {

	
	private int max = 0;
	private int maxTime;
	private P4BClock[] clocksInStock;
	
	P4BClockStore() {
		this.clocksInStock = new P4BClock[3];
		
		clocksInStock[0] = new P4BClock(12, 24, 36);
		clocksInStock[1] = new P4BClock(2, 36, 24);
		clocksInStock[2] = new P4BClock(4, 16, 18);
	}

	public int mostSeconds() {
		for (int i = 0; i<clocksInStock.length; i++) {
			if (clocksInStock[i].totalSeconds() > max) {
				max = clocksInStock[i].totalSeconds();
				i = maxTime;
			}
		}
		return maxTime;
	}
	
	public String toString() {
		String output = new String();
		
		for (P4BClock clock : clocksInStock) {
			output += clock;
		}
		
		output += "The clock with the most seconds is: Clock " + (mostSeconds() + 1);
		
		return output;
	}
}
