package lms.model;

import java.util.Date;

// The holding interface provides a list of method signatures that must be implemented by the Holding superclass

public interface Holding {
	
	// The borrow date is the date the library member borrows the holding
	
	public java.util.Date getBorrowDate();
	
	// The holding code is an identifier for the holding
	
	public int getCode();
	
	// The default loan fee is the loan fee for a holding and will vary depending on the type of holding
	
	public double getDefaultLoanFee();
	
	// The max loan period is the maximum period a holding can be borrowed before a late fee is incurred
	
	public int getMaxLoanPeriod();
	
	// Returns the holding title
	
	public String getTitle();
	
	// Will return true if the holding is on loan
	
	public boolean isOnLoan();
	
	// Sets the date a holding is borrowed
	
	public void setBorrowDate(Date borrowDate);
	
	// Returns a string representation of the holding
	
	public String toString();
	
	// Based on business rules, will determine the correct late fee to be charged for a holding
	
	public double calculateLateFee();
	
}
