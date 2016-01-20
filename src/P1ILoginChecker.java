import javax.swing.JOptionPane;

public class P1ILoginChecker {
	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog ("Username");
		String password = JOptionPane.showInputDialog("Password");
		
		// Strings require .equals to check
		if (username.equals("Tyler") && password.equals("1234")) {
			System.out.println("Succesfully Logged in");
		}
		else {
			System.out.println("Incorrect Login");
		}
	}
}
