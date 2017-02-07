package homework3;

public class Playlist {
	private String title, artist, duration;
	
	//constructor
	public Playlist(String title,String artist,String duration){
		this.title=title;
		this.artist=artist;
		this.duration=duration;
	}
	
	//value to string
	public String tostring(){
		return "Title: " + title + ", artist: " + artist + ". duration:" + duration;		
	}
	//setter and getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	

	
	
	
}
