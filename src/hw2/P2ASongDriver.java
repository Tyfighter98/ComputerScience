package hw2;

public class P2ASongDriver {
	
	public static void main (String[] args) {
		P2ASong song1 = new P2ASong();
		P2ASong song2 = new P2ASong(2, "Concrete Jungle");
	
		System.out.println(song1);
		System.out.println(song2);
	}
}
