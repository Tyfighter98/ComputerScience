package hw3;

public class APLineDriver {

	public static void main(String[] args) {
		
		APLine line1 = new APLine(5, 4, -17);
		APLine line2 = new APLine(6, 5, 20);
		
		System.out.println("Slope: " + line1.getSlope());
		System.out.println("Is the point on the line? \n" + line1.isOnLine(5, -2));
		System.out.println("Slope: " + line2.getSlope());
		System.out.println("Is the point on the line? \n" + line2.isOnLine(5, -2));
		
	}
}
