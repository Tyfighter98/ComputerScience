package hw3;

import javax.swing.JOptionPane;

public class P3BClockDriver {
	public static void main(String[] args) {
		// run kitchen clok's constructor
		P3BClock kitchenClock = new P3BClock();
		
		// request values for bedroom clock
		String bedHours = JOptionPane.showInputDialog("Hours");
		String bedMinutes = JOptionPane.showInputDialog("Minutes");
		String bedSeconds = JOptionPane.showInputDialog("Seconds");
		
		// set values in bedroom clock
		P3BClock bedroomClock = new P3BClock(bedHours, bedMinutes, bedSeconds);
	
		System.out.println("Kitchen Clock: " + kitchenClock);
		System.out.println("Bedroom Clock: " + bedroomClock);
		
		// Manual Setting
		kitchenClock.setTime(2, 16, 52);
		System.out.println("\nSetting to manual time...");
		System.out.println("Kitchen Clock: " + kitchenClock);
		
		kitchenClock.convertDaylightSavings(1);
		System.out.println("\nSetting to Spring forward...");
		System.out.println("Kitchen Clock: " + kitchenClock);
	}
}
