
public class If {
	public static void main(String[] args) {
		double a = Math.random();
		double b = Math.random();
		
		if (a == b) {
			System.out.println(a + " = " + b);
		}
		
		if (a < b) {
			System.out.println(a + " < " + b);
		}
		
		if (a > b) {
			System.out.println(a + " > " + b);
		}
	}
}
