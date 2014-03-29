package TuteLab2;

import java.util.ArrayList;

public class CD {
	private String title;
	private String artist;
	private ArrayList<Track> tracks;
	private int currentTrack = 0;
	
	public CD() {
		
		
	}
	
	public CD (String title, String artist) {
		this.title = title;
		this.artist = artist;
		ArrayList<Track> tracks = new ArrayList<Track>();
	}
	
	
	public void addTrack(Track newtrack) {
		tracks.add(newtrack);
	}
	
	public void playTrack(int selectedTrack) {
		tracks.get(selectedTrack).play();
		currentTrack = selectedTrack;

}
	
	public void stopTrack() {
		tracks.get(currentTrack).play();
	
	}
	
	public void restart() {
		currentTrack = 0;
		tracks.get(currentTrack).stop();
	}
	
	public void nextTrack() {
		currentTrack++;
		tracks.get(currentTrack).play();
	}
	
	public float discSize () {
		float discsize = 0;
		for (int i=0; i<=tracks.size(); i++) {
			discsize = discsize + tracks.get(i).getLen();
		}
		
		return discsize;
	}
}