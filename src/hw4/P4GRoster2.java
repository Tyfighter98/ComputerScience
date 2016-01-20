package hw4;

import java.util.ArrayList;

public class P4GRoster2 {
	
	private ArrayList<P4GStudent> myStudents = new ArrayList<P4GStudent>();
	
	public void addStudent(P4GStudent newStudent) {
		myStudents.add(newStudent);
	}
	
	public void dropStudent(String lastName) {
		for (int index = 0; index < myStudents.size(); index++) {
			if (myStudents.get(index).lastName.equals(lastName)) {
				myStudents.remove(index);
				index--;
			}
		}
	}
	
	public int findStudnetWithMaxGPA() {
		int count = 0;
		double max = 0;
		
		for (int index=0; index<(myStudents.size()); index++) {
			if ((myStudents.get(index).calcGPA()) > max) {
				max = myStudents.get(index).calcGPA();
				count = index+1;
			}
		}
		return count;
	}
	
	public String toString() {
		String output = new String();
		
		output = "Student with hihgest GPA: " + findStudnetWithMaxGPA() + "\n";
		for (P4GStudent index : myStudents) {
			output += "\n" + index;
		}
		return output;
	}
}
