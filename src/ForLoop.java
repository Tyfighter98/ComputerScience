
public class ForLoop {
	public static void main(String[] args) {
		
		for (int cnt = 1; cnt <11; cnt++) {
			System.out.println(cnt + "\t" + cnt*cnt + "\t" + cnt*Math.round(Math.random()*2 + 1));
		}
	}
}
