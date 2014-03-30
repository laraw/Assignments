package lms.model;

import java.text.SimpleDateFormat;

import lms.model.util.DateUtil;

public class Video extends AbstractHolding {

	double standardLoanFee;
	private static final int MAX_LOAN_PERIOD = 7;
	
	public Video() {
		
	}

	public Video(int code, String title) {
		super(code, title);
	}

	public Video(int code, String title, double standardLoanFee) {
		super(code, title);
		this.standardLoanFee = standardLoanFee;
	}
	
	@Override
	public double getDefaultLoanFee() {
		return standardLoanFee;
	}

	@Override
	public int getMaxLoanPeriod() {
		return MAX_LOAN_PERIOD;
	}

	@Override
	public String toString() {
		return super.toString()+":"+standardLoanFee+":"+MAX_LOAN_PERIOD+":"+this.getClass();
	}
	
	
	// A video has a late fee of 50% of the standard loan fee multiplied by the number of days a video is late
	
	public double calculateLateFee() {
		
		double surcharge = standardLoanFee * 0.50;
		double latefee;
		
		// The date must be converted to string to pass to the utility method telling us the number of elapsed days a holding has 
		// been on loan
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String borrowDate = sdf.format(super.getBorrowDate());
		int elapseddays = DateUtil.getInstance().getElapsedDays(borrowDate);
		
		if (elapseddays <= MAX_LOAN_PERIOD) {
			latefee = 0.00;
		}
		
		else {
			latefee = (elapseddays - MAX_LOAN_PERIOD) * surcharge;
		}
		
		return latefee;
	}	

}
