package lms.model;

public class HistoryRecord {

	private Holding holding;
	private double feepaid;
	
	public HistoryRecord(Holding holding) {
		this.holding = holding;
		feepaid = holding.calculateLateFee() + holding.getDefaultLoanFee();
	}
	
	public Holding getHolding() {
		return holding;
	}
	
	public double getFeePayed() {
		return feepaid; 
	}
	
	public String toString() {
		return holding.getCode()+":" + feepaid;
	}
	

}
