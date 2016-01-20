package hw3;

import javax.swing.JOptionPane;

public class P3IPassword {

	public static void main(String[] args) {
		
		int x = 0;
		String password = JOptionPane.showInputDialog("Please create a passowrd that is at least 6 charcaters long"
				+ " and includes at least one non-alphanumerica character (+, -, *, /, or @)");
		
		// Strings require .equals to check
		if (password.length() >= 6) {
			for (int i = 0; i < password.length(); i++) {
				String check = (password.substring(i,i+1));
				if (check.equals("+") || check.equals("-") || check.equals("*") || check.equals("/") || check.equals("@")) {
					x++;
				}
			}
			if (x > 0) {
				System.out.println("Password Set to: " + password);
			}
		}
		else {
			System.out.println("Password is too short");
		}
	}

}
