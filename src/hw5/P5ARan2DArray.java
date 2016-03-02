package hw5;

public class P5ARan2DArray {
	
	public static void main(String[] args) {
		int[][] grid = new int[3][4];
		
		for (int row = 0; row<grid.length; row++) {
			for (int col = 0; col<grid[0].length; col++) {
				grid[row][col] = (int)((Math.random())*9);
			}
		}
		
		for (int row = 0; row<grid.length; row++) {
			for (int col = 0; col<grid[0].length; col++) {
				System.out.print(grid[row][col] + "  ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Coordinates Containing 5:");
		
		for (int rowInt = 0; rowInt<grid.length; rowInt++) {
			for (int colInt = 0; colInt<grid[0].length; colInt++) {
				if (grid[rowInt][colInt] == 5) {
					System.out.println("(" + (colInt+1) + ", " + (rowInt+1) + ")");
					
				}
			}
		}
	}
}