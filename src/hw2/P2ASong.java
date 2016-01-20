package hw2;

public class P2ASong {
	
	private int songNumber;
	private String songName;
	
	public P2ASong() {
		songNumber = 1;
		songName = "4U";
	}
	
	public P2ASong(int songNumber, String songName) {
		this.songNumber = songNumber;
		this.songName = songName;
	}
	
	public String toString() {
		String output = new String();
		output = "Song Number: " + songNumber + "\n" +
				"Song Name: " + songName;
		return output;
	}

}

