package lms.model;

import java.util.*;

public class BorrowingHistory {

	private ArrayList<HistoryRecord> records = new ArrayList<HistoryRecord>();
		
	public BorrowingHistory() {
		
	}
	
	
	public void addHistoryRecord(HistoryRecord record) {
		records.add(record);
	}
	
	public int calculateTotalLateFees() {
		int latefee = 0;
		for (int i = 0; i <= records.size(); i++) {
			latefee += (records.get(i).getFeePayed() - records.get(i).getHolding().calculateLateFee());
		}
		
		return latefee;
	}
	
	public HistoryRecord getHistoryRecord(Holding holding) {
		
		
		for (int i = 0; i <= records.size(); i++) {
			if (records.get(i).getHolding() == holding) {
				 return records.get(i);
			}
		}
		
		return null;
	}
	
	public ArrayList<HistoryRecord> getAllHistoryRecords() {
		return records;
	}
	
	

}
