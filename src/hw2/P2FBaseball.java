package hw2;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P2FBaseball {

	public static void main(String[] args) {
		double value = 0;
		double[] batAvg;
		batAvg = new double[9];
		DecimalFormat df = new DecimalFormat("##.###");
		df.setRoundingMode(RoundingMode.DOWN);
		
		for (int index = 0; index<batAvg.length; index++) {
			batAvg[index] = (Math.random()*0.500);
		}
		
		for (int index = 0; index<batAvg.length; index++) {
			System.out.print(df.format(batAvg[index]) + " ");
		}
		
		for (int index = 0; index<batAvg.length; index++) {
			if (value < batAvg[index]) {
				value = batAvg[index];
			}
		}
		System.out.print("\n Highest batting average: " + (df.format(value)));
	}
}
