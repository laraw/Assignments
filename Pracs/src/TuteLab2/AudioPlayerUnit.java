package TuteLab2;

import java.util.ArrayList;

public class AudioPlayerUnit {
	
	private int currentCD;
	private ArrayList<CD> cds;

	
	
	public AudioPlayerUnit() {
		ArrayList<CD> cds = new ArrayList<CD>();
		currentCD = 0;
	}
	
	public void addCD(CD newCD) {
		cds.add(newCD);
		
	}
	
	
	
	

	
	
}
