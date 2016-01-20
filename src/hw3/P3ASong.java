package hw3;

public class P3ASong {

	private int songNumber;
	private String songName;
	private int yearReleased;
	private int length;
	
	public P3ASong() {
		songNumber = 1;
		songName = "4U";
		yearReleased = 2015;
		length = 456;
	}
	
	public int getYearReleased() {
		return yearReleased;
	}
	
	public void setYearReleased(int year) {
		this.yearReleased = year;
	}
	
	public String convertToMinSec() {
		int min = length/60;
		int sec = length%60;
		
		return "The song is " + min + " minutes and " + sec + " seconds long.";
	}
	
	public P3ASong(int songNumber, String songName, int yearReleased, int length) {
		this.songNumber = songNumber;
		this.songName = songName;
		this.yearReleased = yearReleased;
		this.length = length;
	}
	
	public String toString() {
		String output = new String();
		output = "Song Number: " + songNumber + "\n" +
				"Song Name: " + songName +
				"\n" + "Year Released: " + getYearReleased() +
				"\n" + "The song is " + length + " seconds long";
		return output;
	}
}
