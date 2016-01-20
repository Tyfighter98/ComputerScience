package hw2;

public class P2BClock {

	private int hours;
	private int minutes;
	private int seconds;
	
	P2BClock() {
		hours = 11;
		minutes = 31;
		seconds = 28;
	}
	
	P2BClock(String hours1, String minutes1, String seconds1) {
		hours = Integer.parseInt(hours1);
		minutes = Integer.parseInt(minutes1);
		seconds = Integer.parseInt(seconds1);
	}
	
	public String toString() {
		String output = new String();
		output = "The time is " + hours + ":" + minutes + ":" + seconds;		
		return output;
	}
	
	/*
	public void input() {
		bedHours = JOptionPane.showInputDialog("Hours");
		bedMinutes = JOptionPane.showInputDialog("Minutes");
		bedSeconds = JOptionPane.showInputDialog("Seconds");
		
	} 
	*/
}
