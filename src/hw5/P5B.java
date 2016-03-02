package hw5;

public class P5B {
	
	
	public static void main(String[] args) {
		int totalSum = 0;
		
		int row1Sum = 0;
		int row2Sum = 0;
		int row3Sum = 0;
		
		int col1Sum = 0;
		int col2Sum = 0;
		int col3Sum = 0;
		int col4Sum = 0;
		int col5Sum = 0;
		
		int[][] grid = new int[3][5];
		
		// Fill 2D Array
		for (int row = 0; row<grid.length; row++) {
			for (int col = 0; col<grid[0].length; col++) {
				grid[row][col] = (int)((Math.random())*15);
			}
		}
		
		// Print 2D Array
		for (int row = 0; row<grid.length; row++) {
			for (int col = 0; col<grid[0].length; col++) {
				System.out.print(grid[row][col] + "  ");
			}
			System.out.println("\n");
		}
		
		// Row 1
		for (int col = 0; col<grid[0].length; col++) {
			row1Sum += grid[0][col];
		}
		
		// Row 2
		for (int col = 0; col<grid[0].length; col++) {
			row2Sum += grid[1][col];
		}
		
		// Row 3
		for (int col = 0; col<grid[0].length; col++) {
			row3Sum += grid[2][col];
		}
		
		// Col 1
		for (int row = 0; row<grid.length; row++) {
			col1Sum += grid[row][0];
		}
		
		// Col 2
		for (int row = 0; row<grid.length; row++) {
			col2Sum += grid[row][1];
		}
		
		// Col 3
		for (int row = 0; row<grid.length; row++) {
			col3Sum += grid[row][2];
		}
		
		// Col 4
		for (int row = 0; row<grid.length; row++) {
			col4Sum += grid[row][3];
		}
		
		// Col 5
		for (int row = 0; row<grid.length; row++) {
			col5Sum += grid[row][4];
		}
		
		System.out.println("Row Sums: " + row1Sum + ", " + row2Sum + ", " + row3Sum);
		System.out.println("Col Sums: " + col1Sum + ", " + col2Sum + ", "
		+ col3Sum + ", " + col4Sum+ ", " + col5Sum);
		
		totalSum = row1Sum + row2Sum + row3Sum;
		System.out.println("Grid Sum: " + totalSum);
	}

}
