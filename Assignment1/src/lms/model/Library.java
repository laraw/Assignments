package lms.model;

import java.util.*;

import lms.model.exception.*;

public class Library {
	
	private LibraryCollection collection;
	private Member member;
	
	
	public Library() {
	}
	
	public void addCollection(LibraryCollection collection){
		this.collection = collection;
	}
	
	public boolean addHolding(Holding holding) {
		return collection.addHolding(holding);
	}
	
	public void addMember(Member member) {
		this.member = member;
	}
	
	public void borrowHolding (Holding holding) throws Exception {
		member.borrowHolding(holding);
		
	}
	
	public double calculateRemainingCredit() {
		return member.calculateRemainingCredit();
	}
	
	public double calculateTotalLateFees() {
		return member.getBorrowingHistory().calculateTotalLateFees();
	}
	
	public ArrayList<Holding> getAllHoldings () { 
		ArrayList<Holding> holdings = new ArrayList<Holding>();
		return holdings;
	}
	
	public ArrayList<Holding> getBorrowedHoldings () {
		return member.getCurrentHoldings();
	}
	
	public LibraryCollection getCollection() {
		return collection;
	}
	
	public HistoryRecord getHistoryRecord(Holding holding) {
		return member.getBorrowingHistory().getHistoryRecord(holding);
	}
	
	public Holding getHolding(int code) {
		return collection.getHolding(code);
	}
	
	public Member getMember() {
		return member;
	}
	
	public boolean removeHolding (int code)  {
		return collection.removeHolding(code);
	}
	
	public void resetCredit() {
		member.resetCredit();
	}
	
	public void returnHolding(Holding holding) throws Exception {
		member.returnHolding(holding);
		
	}
}