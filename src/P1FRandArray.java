
public class P1FRandArray {
	public static void main(String[] args) {
		
		double[] randomArray;
		randomArray = new double[50];
		
		for (int index = 0; index<randomArray.length; index++) {
			randomArray[index] = (100*Math.random());
		}
		
		for (int printCnt = 0; printCnt<50; printCnt++) {
			System.out.print((int) randomArray[printCnt] + " ");
		}
	}
}
