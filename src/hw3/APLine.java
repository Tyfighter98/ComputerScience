package hw3;

public class APLine {
	private double a;
	private double b;
	private int c;
	
	APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSlope() {
		double output;
		output = (a)/(b);
		return output;
	}
	
	public boolean isOnLine(int x, int y) {
		//Line should be on (x, y)
		if (a*x+b*y+c == 0) {
		}
		else {
			return false;
		}
		return true;
	}
}
