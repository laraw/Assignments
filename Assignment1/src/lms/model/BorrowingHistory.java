package lms.model;

import java.util.*;

public class BorrowingHistory {

	private Set<HistoryRecord> records = new HashSet<HistoryRecord>();
	
	public BorrowingHistory() {
		
	}
	
	public void addHistoryRecord(HistoryRecord record) {
		records.add(record);
	}
	
	public double calculateTotalLateFees() {
		
		double totallatefees = 0;
		
		Iterator<HistoryRecord> iter = records.iterator();
		
		while(iter.hasNext()) {
			totallatefees += iter.next().getFeePayed();
		}
		
		return totallatefees;
	}
	
	public HistoryRecord getHistoryRecord(int recordID) {
		
		Iterator<HistoryRecord> iter = records.iterator();
		
		while iter.h
	}
	
	public Set<HistoryRecord> getAllHistoryRecords() {
		return records;
	}
	
	

}
