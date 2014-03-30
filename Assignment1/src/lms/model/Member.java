package lms.model;

import java.util.ArrayList;

public interface Member extends Borrower {
	
	public int calculateRemainingCredit();
	
	public BorrowingHistory getBorrowingHistory();
	
	public ArrayList<Holding> getCurrentHoldings();
	
	public String getFullName();
	
	public int getMaxCredit();
	
	public String getMemberId();
	
	public void resetCredit();

}
