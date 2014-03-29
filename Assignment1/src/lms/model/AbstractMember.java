package lms.model;

import java.util.ArrayList;

public abstract class AbstractMember implements Member {

	private String memberID;
	private String fullname;
	private BorrowingHistory history;
	private ArrayList<Holding> currentholdings = new ArrayList<Holding>();
	private double credit;
	private double maxcredit;
	
	public AbstractMember() {
	}
	
	public AbstractMember(String memberID, String fullname, double credit, double maxcredit) {
		this.memberID = memberID;
		this.fullname = fullname;
		this.credit = credit;
		this.maxcredit = maxcredit;
	}
	
	@Override
	public abstract boolean borrowHolding();

	

	@Override
	public abstract double calculateRemainingCredit();

	@Override
	public BorrowingHistory getBorrowingHistory() {
		return history;
	}

	@Override
	public ArrayList<Holding> getCurrentHoldings() {
		return currentholdings;
	}

	@Override
	public String getFullName() {
		return fullname;
	}

	@Override
	public abstract double getMaxCredit();

	@Override
	public String getMemberId() {
		return memberID;
	}

	@Override
	public void resetCredit() {	
		credit = maxcredit;
	};
	
	@Override
	public abstract void returnHolding();
	
	public String toString() {
		return memberID+":"+fullname+":";
	}

}
