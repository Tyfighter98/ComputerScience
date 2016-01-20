package hw3;

import javax.swing.JOptionPane;

public class P3ASongDriver {

	public static void main (String[] args) {
		P3ASong song1 = new P3ASong();
		P3ASong song2 = new P3ASong(2, "Concrete Jungle", 1998, 225);
	
		System.out.println(song1);
		System.out.println("Which is " + song1.convertToMinSec());
		System.out.println();
		System.out.println(song2);
		System.out.println("Which is " + song2.convertToMinSec());
		
		String username = JOptionPane.showInputDialog("Please enter your username:");
        int counter = 0;
        
        // Username: Tyler
        // Password: 1234
        
        
        // First username try
        if(username.equals("Tyler")) {
            String password = JOptionPane.showInputDialog("Please enter your password: ");
            // First password try
            if(password.equals("1234")) {
            	// Successful
            	song2.setYearReleased(2015);
    			System.out.println();
    			System.out.println("Adjusted year: \n");
    			System.out.println(song2);
    			System.out.println("Which is " + song2.convertToMinSec());
            }
            
            else{
                while(counter<2) {
                    // Second password try
                	String passwordRetry = JOptionPane.showInputDialog("Please re-enter your password");
                    if (counter<2 && passwordRetry.equals("1234")) {
                    	// Successful
                    	song2.setYearReleased(2015);
            			System.out.println();
            			System.out.println("Adjusted year: \n");
            			System.out.println(song2);
            			System.out.println("Which is " + song2.convertToMinSec());
                    }
                    else {
                        counter++;
                        if(counter==2) {
                            // Failed
                        	JOptionPane.showMessageDialog(null, "You have exceeded the maximum amount of tries", "Login Input", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    }
                }
            }
        }
        else {
            while (counter<3) {
            	String usernameTry = JOptionPane.showInputDialog("Please re-enter your username: ");
                // Second & third username try
            	if(counter<3 && usernameTry.equals("Tyler")) {
                	// Second & third password try
            		String passwordTry = JOptionPane.showInputDialog("Please enter your password");
                    if (counter < 2 && passwordTry.equals("1234")) {
                    	// Successful
                    	song2.setYearReleased(2015);
            			System.out.println();
            			System.out.println("Adjusted year: \n");
            			System.out.println(song2);
            			System.out.println("Which is " + song2.convertToMinSec());
                    }
                    else {
                        counter++;
                        if(counter==2) {
                        	// Failed
                        	JOptionPane.showMessageDialog(null, "You have exceeded the maximum amount of tries", "Login Input", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    }
                }
                else {
                     counter++;
                     if(counter==2) {
                    	 // Failed
                    	 JOptionPane.showMessageDialog(null, "You have exceeded the maximum amount of tries", "Login Input", JOptionPane.ERROR_MESSAGE);
                         System.exit(0);
                     }
                }
            }
        }
	}
}
