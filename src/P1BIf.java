
public class P1BIf {
	public static void main(String[] args) {
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		
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
