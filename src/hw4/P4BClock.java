package hw4;

public class P4BClock {

	private int hours;
	private int minutes;
	private int seconds;
	
	
	P4BClock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public int totalSeconds() {
		int total = hours*3600 + minutes*60 + seconds;
		
		return total;
	}
	
	public String toString() {
		String output = new String();
		output = "The time is " + hours + ":" + minutes + ":" + seconds +
				"\n";	
		return output;
	}
	
	public void convertDaylightSavings(int hours) {
		this.hours += hours;
	}
}
