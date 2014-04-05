package lms.model;

import java.util.ArrayList;

import lms.model.exception.*;


public class StandardMember extends AbstractMember {

	private static final int STD_MAX_CREDIT = 30;
	
	
	public StandardMember() {
	}
	
	
	public StandardMember(String standardMemberId, String standardMemberName) {
		super(standardMemberId, standardMemberName, STD_MAX_CREDIT, STD_MAX_CREDIT);
	}
	
	public int getMaxCredit() {
		return STD_MAX_CREDIT;
	};

	
	public void returnHolding(Holding holding) throws OverdrawnCreditException {
		if(super.calculateRemainingCredit() < holding.calculateLateFee()) {
			throw new OverdrawnCreditException("Unable to return as credit would become overdrawn");
		}
		
		else {
			HistoryRecord histrecord = new HistoryRecord(holding, (int)(holding.calculateLateFee() + holding.getDefaultLoanFee()));
			super.getBorrowingHistory().addHistoryRecord(histrecord);
			holding.onLoan(false);
			holding.setBorrowDate(null);
			super.getCurrentHoldings().remove(holding);
		}
	}
	
	public String toString() {
		return super.getMemberId()+":"+super.getFullName()+":"+super.calculateRemainingCredit()+":"+"STANDARD";
	}


	
	

}
