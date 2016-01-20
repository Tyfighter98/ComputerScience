package hw3;

public class P3BClock {

	private int hours;
	private int minutes;
	private int seconds;
	
	P3BClock() {
		hours = 11;
		minutes = 31;
		seconds = 28;
	}
	
	public void setTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public int totalSeconds(int hours, int minutes, int seconds) {
		int total = hours*3600 + minutes*60 + seconds;
		
		return total;
	}
	
	P3BClock(String hours1, String minutes1, String seconds1) {
		hours = Integer.parseInt(hours1);
		minutes = Integer.parseInt(minutes1);
		seconds = Integer.parseInt(seconds1);
	}
	
	public String toString() {
		String output = new String();
		output = "The time is " + hours + ":" + minutes + ":" + seconds +
				" Total seconds: " + totalSeconds(hours, minutes, seconds);	
		return output;
	}
	
	public void convertDaylightSavings(int hours) {
		this.hours += hours;
	}
}
