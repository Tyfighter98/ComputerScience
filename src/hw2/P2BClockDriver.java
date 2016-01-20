package hw2;

import javax.swing.JOptionPane;

public class P2BClockDriver {
	public static void main(String[] args) {
		P2BClock kitchenClock = new P2BClock();
		
		String bedHours = JOptionPane.showInputDialog("Hours");
		String bedMinutes = JOptionPane.showInputDialog("Minutes");
		String bedSeconds = JOptionPane.showInputDialog("Seconds");
		
		P2BClock bedroomClock = new P2BClock(bedHours, bedMinutes, bedSeconds);
	
		System.out.println(kitchenClock);
		System.out.println(bedroomClock);
	}
	
}
