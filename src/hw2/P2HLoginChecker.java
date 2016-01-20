package hw2;

import javax.swing.JOptionPane;

public class P2HLoginChecker {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Please enter your username:");
        int counter = 0;
        
        if(username.equals("Tyler")) {
            String password = JOptionPane.showInputDialog("Please enter your password: ");
            if(password.equals("1234")) {
                JOptionPane.showMessageDialog(null, "Successful Login", "Login Input", JOptionPane.INFORMATION_MESSAGE);
            }
            
            else{
                while(counter<2) {
                    String passwordRetry = JOptionPane.showInputDialog("Please re-enter your password");
                    if (counter<2 && passwordRetry.equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Successful Login", "Login Input", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    else {
                        counter++;
                        if(counter==2) {
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
                if(counter<3 && usernameTry.equals("Tyler")) {
                    String passwordTry = JOptionPane.showInputDialog("Please enter your password");
                    if (counter < 2 && passwordTry.equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Successful Login", "Login Input", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    else {
                        counter++;
                        if(counter==2) {
                            JOptionPane.showMessageDialog(null, "You have exceeded the maximum amount of tries", "Login Input", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    }
                }
                else {
                     counter++;
                     if(counter==2) {
                         JOptionPane.showMessageDialog(null, "You have exceeded the maximum amount of tries", "Login Input", JOptionPane.ERROR_MESSAGE);
                         System.exit(0);
                     }
                }
            }
        }
    }
}
