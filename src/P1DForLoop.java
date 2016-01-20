
public class P1DForLoop {
	public static void main(String[] args) {
		
		for (int cnt = 1; cnt <11; cnt++) {
			System.out.println(cnt + "\t" + cnt*cnt + "\t" + 
		(Math.round(cnt + (cnt*cnt - cnt)*Math.random())));
		}
	}
}
