package lms.model;

import java.util.ArrayList;

public class BorrowingHistory {

	private ArrayList<HistoryRecord> records = new ArrayList<HistoryRecord>();
	
	public BorrowingHistory() {
		
	}
	
	public void addHistoryRecord(HistoryRecord record) {
		records.add(record);
	}
	
	public double calculateTotalLateFees() {
		
		double totallatefees = 0;
		
		for (int i = 0; i <= records.size(); i++) {
			 totallatefees += records.get(i).getHolding().calculateLateFee();
			 
			 		
		}
		
		return totallatefees;
	}
	
	public HistoryRecord getHistoryRecord(int recordID) {
		return records.get(recordID);
	}
	
	public ArrayList<HistoryRecord> getAllHistoryRecords() {
		return records;
	}
	
	

}
