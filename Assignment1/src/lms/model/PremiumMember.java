package lms.model;

import java.util.ArrayList;
import java.util.Date;

import lms.model.exception.InsufficientCreditException;

public class PremiumMember extends AbstractMember {

	private static final double PREMIUM_MAX_CREDIT = 45.00;
	ArrayList<Holding> currentholdings = super.getCurrentHoldings();
	
	public PremiumMember() {
		
	}

	public PremiumMember(String premiumMemberId, String premiumMemberName) {
		super(premiumMemberId, premiumMemberName, PREMIUM_MAX_CREDIT, PREMIUM_MAX_CREDIT);
		
	}

	public boolean borrowHolding(Holding holding) throws InsufficientCreditException  {
		
		boolean borrowed = true;
		
		
		
		
		if (this.calculateRemainingCredit() < holding.getDefaultLoanFee()) {
			borrowed = false;
			throw new InsufficientCreditException("Member does not have sufficient credit");
			
		}
		
		else {
			Date currentdate = new Date();
			holding.setBorrowDate(currentdate);
			holding.isOnLoan();
			borrowed= true;
		}
		
		return borrowed;
		
	};
	
	public double calculateRemainingCredit() {
		
		
		double currentfees = 0.00;
		for (int i = 0; i <= currentholdings.size(); i++ ) {
			currentfees += currentholdings.get(i).getDefaultLoanFee();
		}
		
		return PREMIUM_MAX_CREDIT - currentfees;
		
		
	};
	
	public double getMaxCredit() {
		return PREMIUM_MAX_CREDIT;
	};

	
	public void returnHolding() {

	}
	
	public String toString() {
		return super.getMemberId()+":"+this.calculateRemainingCredit()+":"+this.getClass();
	}

	@Override
	public boolean borrowHolding() {
		// TODO Auto-generated method stub
		return false;
	}
}