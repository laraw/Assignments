package Tutelab4;

import java.util.HashSet;

public class WeekFourPrac {

	public WeekFourPrac() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet newhash = new HashSet();
		
		String mystring = new String("hi");
		
		newhash.add(mystring);
		newhash.add(mystring);
		
		for (int i=0; i<= newhash.size(); i++) {
			System.out.print(newhash.toString()); 
		}

	}

}