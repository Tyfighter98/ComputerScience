package hw3;

public class P3GFind {
	
	public static void main(String[] args) {
		
		int location = -1;
		
		int[] anArray = {
				1, 5, 6, 7, 24, -6, -52, 98, -2, 5
		};
		
		for (int i = 0; i<anArray.length; i++) {
			System.out.print(anArray[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 0; i<anArray.length; i++) {
			if (anArray[i] == -6) {
				location++;
				location = location + i;
			}
		}
		System.out.print("-6 is located at: " + location);
	}
}
