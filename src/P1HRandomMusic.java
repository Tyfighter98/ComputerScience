
public class P1HRandomMusic {
	public static void main(String[] args) {
		
		//create array
		String[] songArray = {
			"Monstercat", "Imagine Dragons", "Black Keys"	
		};
		
		//print array
		for (int printCnt = 0; printCnt<3; printCnt++) {
			System.out.print(songArray[printCnt] + ", ");
		}
		
		//select random index to overwrite
		songArray[(int) (Math.random()*3)] = "Michal Jackson";
		System.out.println("\n");
		
		//print array
		for (int printCnt = 0; printCnt<3; printCnt++) {
			System.out.print(songArray[printCnt] + ", ");
		}
		
		System.out.println("\n");
		
		//check and print library for Michal Jackson
		for (int printCnt = 0; printCnt<3; printCnt++) {
			if (songArray[printCnt] == "Michal Jackson") {
				System.out.println("We found Michal Jackson");
			}
			
			else {
				System.out.println("No Michal Jackson in Music");
			}
		}
	}
}
