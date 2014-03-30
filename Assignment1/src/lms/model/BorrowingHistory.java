package lms.model;

import java.util.*;

public class BorrowingHistory {

	private HashMap<HistoryRecord, Member> records = new HashMap<HistoryRecord, Member>();
	
	
	public BorrowingHistory() {
		
	}
	
	
	public void addHistoryRecord(HistoryRecord record, Member m) {
		records.put(record, m);
	}
	
	public double calculateTotalLateFees(Member member) {
		
		double totallatefees = 0;
		
		for (int i=0; i <= records.size(); i++) {
			totallatefees += records.get(i).getFeePayed();
		}
		
		
		return totallatefees;
	}
	
	public HistoryRecord getHistoryRecord(Holding holding) {
		return 
		
		
	}
	
	public void getAllHistoryRecords() {
		
	}
	
	

}
