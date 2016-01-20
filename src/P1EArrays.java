
public class P1EArrays {
	public static void main (String[] args) {

		int sonCnt = 0;
		
		// Create & fill movie array
		String[] movArray = {
			"Inception", "Intersellar", "Ant Man"
		};
		
		// Create & fill song array
		String[] songArray = {
				"Titans", "4U", "Concrete Jungle" 
		};
		
		// Print Movie array
		for (int movCnt = 0; movCnt < 3; movCnt++) {
			System.out.println(movArray[movCnt]);
		}
		
		System.out.println();
		
		// Print Song array
		while (sonCnt < 3) {
			System.out.print(songArray[sonCnt] + ", ");
			sonCnt++;
		}

	}
}
