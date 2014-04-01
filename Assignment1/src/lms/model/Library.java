package lms.model;

import java.util.*;

import lms.model.exception.*;

public class Library {
	
	private LibraryCollection collection = new LibraryCollection();
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
	
	public void borrowHolding (int holdingId) throws Exception {
		member.borrowHolding(collection.getHolding(holdingId));
		
	}
	
	public double calculateRemainingCredit() {
		return member.calculateRemainingCredit();
	}
	
	public double calculateTotalLateFees() {
		return member.getBorrowingHistory().calculateTotalLateFees();
	}
	
	public ArrayList<Holding> getAllHoldings () { 
		return collection.getAllHoldings();
		
	}
	
	public ArrayList<Holding> getBorrowedHoldings () {
		return member.getCurrentHoldings();
	}
	
	public LibraryCollection getCollection() {
		return collection;
	}
	
	public HistoryRecord getHistoryRecord(int holdingId) {
		return member.getBorrowingHistory().getHistoryRecord(holdingId);
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