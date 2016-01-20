
public class P1GComplexArray {
	public static void main(String[] args) {
		
		int cnt = 0;
		int positive = 0;
		
		double[] anArray;
		anArray = new double [10];
		
		for (int index = 0; index<anArray.length; index++) {
			anArray[index] = (100*Math.random());
			if (Math.random() > .5) {
				anArray[index] *= -1;
			}
		}
		
		while (cnt<10) {
			System.out.print((int) anArray[cnt] + " ");
			cnt++;
		}
		
		for (int checker = 0; checker<anArray.length; checker++) {
			if (anArray[checker] > 0) {
				positive++;
			}
		}
		System.out.println("Total positive numbers is: " + positive);
	}
}
