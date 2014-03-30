package lms.model;

public class HistoryRecord {

	private Holding holding;
	private double feepaid;

	
	public HistoryRecord(Holding holding) {
		this.holding = holding;
	}
	
	public Holding getHolding() {
		return holding;
	}
	
	public double getFeePayed() {
		double fee = holding.calculateLateFee() + holding.getDefaultLoanFee();
		return fee;
	}
	
	public String toString() {
		return holding.getCode()+":" + feepaid;
	}
	

}
