package lms.model;

import java.util.ArrayList;

import lms.model.exception.MultipleBorrowingException;

public class StandardMember extends AbstractMember {

	private static final double STD_MAX_CREDIT = 30.00;
	
	
	public StandardMember() {
	}
	
	
	public StandardMember(String standardMemberId, String standardMemberName) {
		super(standardMemberId, standardMemberName, STD_MAX_CREDIT, STD_MAX_CREDIT);
	}


	public boolean borrowHolding(Holding thisholding) throws MultipleBorrowingException {
		ArrayList<Holding> holdings = new ArrayList<Holding>();
		for (int i=0;i<=holdings.size();i++) {
			if(holdings.get(i).equals(thisholding)) {
				throw new MultipleBorrowingException("Holding already exists in current holdings");
			}
		}
		return true;
	};
	
	public double calculateRemainingCredit() {
		return 0;
	};
	
	public double getMaxCredit() {
		return STD_MAX_CREDIT;
	};

	
	public void returnHolding() {
		
	}
	
	public String toString() {
		return super.getMemberId()+":"+this.calculateRemainingCredit()+":"+this.getClass();
	}


	@Override
	public boolean borrowHolding() {
		return false;
	}
	
	

}
