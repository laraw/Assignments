package lms.model;

import java.util.Date;

public abstract class AbstractHolding implements Holding {

	private int code;
	private String title;
	private Date borrowDate;
	public boolean isOnLoan = false;
	
	
	public AbstractHolding() {

	}
	
	// Constructs the holding and passes it the holding code and title of the holding
	
	public AbstractHolding(int code, String title) {
		this.code = code;
		this.title = title;
	}

	// Returns the holdings code & title
	
		@Override
		public int getCode() {
			return code;
		}
		
		@Override
		public String getTitle() {
			return title;
		}
		
	
	// Returns the date that a holding was borrowed, this is used to calculate late fees if applicable
	
	@Override
	public Date getBorrowDate() {
		return borrowDate;
	}

	
	
	// The default loan fee that a member pays for a holding depends on the type of holding, this is implemented in the subclass
	
	@Override
	public abstract double getDefaultLoanFee();

	
	// Each type of holding has a maximum period that it can be loaned to a member, this is implemented in the subclass
	
	@Override
	public abstract int getMaxLoanPeriod();


	
	@Override
	public boolean isOnLoan() {
		return isOnLoan;
	}

	
	// When a holding is borrowed, the date the holding was borrowed is set, it can be determined then that the holding is on loan and this value
	// is set to true
	
	@Override
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
		isOnLoan = true;
	}


	// Returns a string representation of the holding
		
	public String toString() {
		return code + ":" + title;
	};

}
