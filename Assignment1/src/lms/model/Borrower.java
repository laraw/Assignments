package lms.model;

public interface Borrower {
	public void borrowHolding(Holding holding) throws Exception;
	public void returnHolding(Holding holding) throws Exception;
}
