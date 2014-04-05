package lms.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

import lms.model.*;
import lms.model.exception.*;
import lms.model.facade.*;
import lms.model.util.*;

public class TestDebug {

	
	/**
	private String date = null;
	
		
		public TestDebug() {
		}
			
			
			public String getDate() {
				return date;
			}

			public void setDate() {
				this.date = "01-01-2014";
			}

			/**
			 * calculates the difference (in number of days) between the provided borrow
			 * date and current date. make sure that the provided borrow date is kept in
			 * the required format (dd-MM-yyyy e.g. "25-01-2014")
			 **/
	/**
			public int getElapsedDays(String borrowDate) {
				// creates two calendars instances
				Calendar cal1 = Calendar.getInstance();
				Calendar cal2 = Calendar.getInstance();

				/** sets the dates for both calendar instances **//**
				// first date is the holding borrow date
				cal1.setTime(createDate(borrowDate));
				// second date is the return (i.e. current) date
				cal2.setTime(createDate(date));

				// calculates difference in milliseconds
				long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
				// calculates difference in days
				long diffDays = diff / (24 * 60 * 60 * 1000);	
				return (int) diffDays;
			}

			private Date createDate(String dateString) {
				DateFormat formatter;
				try {
					formatter = new SimpleDateFormat("dd-MM-yyyy");
					return (Date)formatter.parse(dateString);
				} catch (ParseException e) {
					e.getStackTrace();
				}

				return null;
			}
		
			public static void main(String[] args)  {
				
				
			}
				 * @throws Exception 
			**/
	
	public static void main(String args[]) throws Exception {
			
			//initialiseEngine();
			LMSModel model = new LMSFacade();
			model.addCollection(new LibraryCollection("11",
				"blah"));
		
		// IMPORTANT: we need to set artificial date in order to test borrow and
		// return functions (check the "Assignments" page on Blackboard for further explanation)
			model.setDate("01-01-2014");
			//initialiseHoldings
			
			Holding book1 = new Book(1000001, "Introduction to Java Programming");
			Holding book2 = new Book(1000002, "Learning UML");
			Holding book3 = new Book(1000003,
					"Design Patterns - Elements of Reusable Object-Oriented Software");

			Holding video1 = new Video(2000001, "Java 1", 4);
			Holding video2 = new Video(2000002, "Java 2", 4);
			Holding video3 = new Video(2000003, "UML 1", 6);
			Holding video4 = new Video(2000004, "UML 2", 6);
			
			
			String[] expected = { "1000001:10", "1000002:10" };

			model.addMember(new StandardMember("10000001", "Joe Bloggs"));
			model.addHolding(book1);
			model.addHolding(book2);
			System.out.println("Borrowing two books ...");
			model.borrowHolding(1000001);
			model.getBorrowedHoldings();
			model.returnHolding(1000001);
			model.getBorrowingHistory();
			
			
			
	}

			

				// NOTE: model.getBorrowingHistory() MUST return null if the history
				// has no records
				/** System.out
						.print("Checking empty history (expecting null) with getBorrowingHistory() ...");
				if (failureCheck(model.getBorrowingHistory() == null, true))
					return false;

				// Setting return date - normal (i.e. 28 days - no late penalty)
				model.setDate(BOOK_NORMAL_DATE);

				System.out.println("Returning two books ...");
				model.returnHolding(1000001);
				model.returnHolding(1000002);

				// NOTE: model.getHistoryRecord() MUST return null if this history
				// record does not exist
				System.out
						.print("Checking non-existent history record (expecting null) with getHistoryRecord() ...");
				if (failureCheck(model.getHistoryRecord(1000003) == null, true))
					return false;

				System.out
						.print("Checking valid history record with getHistoryRecord() ...");
				if (failureCheck(model.getHistoryRecord(1000001) == null, false))
					return false;
			
			
			
		}
			/**
			Holding book1 = new Book(1000001, "Introduction to Java Programming");
			Holding book2 = new Book(1000002, "Learning UML");
			Holding book3 = new Book(1000003,
					"Design Patterns - Elements of Reusable Object-Oriented Software");

			Holding video1 = new Video(2000001, "Java 1", 4);
			Holding video2 = new Video(2000002, "Java 2", 4);
			Holding video3 = new Video(2000003, "UML 1", 6);
			Holding video4 = new Video(2000004, "UML 2", 6);
		
			String[] expected = {
					"1000001:Introduction to Java Programming:10:28:BOOK",
					"1000002:Learning UML:10:28:BOOK",
					"1000003:Design Patterns - Elements of Reusable Object-Oriented Software:10:28:BOOK",
					"2000001:Java 1:4:7:VIDEO",
					"2000003:UML 1:6:7:VIDEO" };
			String collectionString = "LIB_IT:Information Technology:1000001,1000002,1000003,2000001,2000003";
			int numOfBooks = 3;
			int numOfVideos = 2;
			
			

			try {
				System.out.println("Adding sample holdings ... ");
				// adding holdings
				
				Library model = new Library();
				System.out.print("Adding book ...");
				model.addHolding(book1);
				System.out.print("Adding first video ...");
				model.addHolding(video1);
				System.out.println("Adding second video ...");
				model.addHolding(video3);

				System.out.println("Removing book with removeHolding() ...");
				model.removeHolding(1000001);

				// retrieving and checking holdings
				
				// find all holdings included in the collection
				
					
					/**
				
				// holding counting functions
				System.out.print("Checking the books counting function ...");
		        if (failureCheck
		        		 (model.countBooks() == numOfBooks, true))
		        	 return false;	        
		        System.out.print("Checking the videos counting function ...");
		        if (failureCheck
		        		 (model.countVideos() == numOfVideos, true))
		        	 return false;
		        
		       // check Library Collection string representation (with holding present)
				LibraryCollection collection = model.getCollection();
				System.out.print("Library Collection string is: " + collection.toString());	
				if (failureCheck(collection.toString()
						.equalsIgnoreCase(collectionString), true));
			
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
	

}
		
		public static boolean failureCheck(boolean check, boolean expected) {
			if (check == expected) {
				System.out.println(" OK");
				return false;
			} else {
				System.out.println(" not OK!");
				return true;
			}
		}
		
		private static boolean checkForHoldings(Holding[] holdings,
				String[] expected) throws Exception {
			// sort the returned holdings (OPTIONAL)
			Arrays.sort(expected);
			// create comparator for sort
			Comparator<Holding> holdingComparator = new Comparator<Holding>() {
				public int compare(Holding holding1, Holding holding2) {
					return Integer.valueOf(holding1.getCode()).compareTo(
							holding2.getCode());
				}
			};
			Arrays.sort(holdings, holdingComparator);

			try {
				// if number of holdings is different from expected, return failure
				if (holdings.length != expected.length)
					return false;
				// make some spots to tick
				boolean[] tickbox = new boolean[expected.length];

				// for each expected holding string...
				for (int i = 0; i < expected.length; i++) {
					// try to find a match
					boolean found = false;
					for (int j = 0; (j < holdings.length) && (!found); j++) {
						if (expected[i].equalsIgnoreCase(holdings[j].toString()))
							found = true;
					}
					// store result for this holding string in the tick box
					tickbox[i] = found;
				}
				// check there's a tick in every box
				for (int i = 0; i < tickbox.length; i++) {
					if (!tickbox[i])
						return false;
				}
			} catch (Exception e) {
				System.out
						.println("Parsing error: could not check Holding list successfully!");
				return false;
			}
			return true;
		}
		
		**/

public static void initialiseEngine() {
	
}

public static void initialiseHoldings() {
	
	// create sample books

}

}
