package lms.model;

import java.util.Date;

public abstract class AbstractHolding implements Holding {

	private int code;
	private String title;
	private Date borrowDate;
	public boolean isOnLoan = false;
	
	
	public AbstractHolding() {

	}
	
	public AbstractHolding(int code, String title) {
		this.code = code;
		this.title = title;
	}

	@Override
	public Date getBorrowDate() {
		return borrowDate;
	}

	@Override
	public int getCode() {
		return code;
	}
	
	
	@Override
	
	// The default loan fee depends on the type of holding and thus cannot be determined 
	
	public abstract double getDefaultLoanFee();

	@Override
	// Each type of holding has a constant max period 
	public abstract int getMaxLoanPeriod();

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public boolean isOnLoan() {
		return isOnLoan;
	}

	@Override
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
		
	}
	
	public void setLoan() {
		isOnLoan = true;
	}
		
	public String toString() {
		return code + ":" + title;
	};

}
