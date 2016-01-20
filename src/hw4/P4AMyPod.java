package hw4;

public class P4AMyPod {

	private String color;
	private int storage;
	private P4ASong[] songLibrary;
	
	public P4AMyPod() {
		color = "Green";
		storage = 32;
		
		this.songLibrary = new P4ASong[2];
		songLibrary[0] = new P4ASong("Concrete Jungle");
		songLibrary[1] = new P4ASong("Just Like That");
	}
	
	public P4AMyPod(String color, int storage, P4ASong songLibrary[]) {
		this.color = color;
		this.storage = storage;
		this.songLibrary = songLibrary;
	}
	
	public String toString() {
		String output = new String();
		output = "Color: " + color + "\nStorage: " + storage + "GB" + "\n";
		
		for (P4ASong song : songLibrary) {
			output += song;
		}
		return output;
	}
}
