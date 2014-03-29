package com.lynda.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.lynda.javatraining.db.tables.Tours;


public class Main {
	

public static void main(String args[]) throws ClassNotFoundException, SQLException {
	// Class.forName("com.mysql.jdbc.Driver");
	
	Scanner console = new Scanner(System.in);
	System.out.print("Please enter your minimum price: ");
	Integer minPrice = console.nextInt();try (
			
			Connection conn = DBUtil.getConnection(DBType.MYSQL);
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT * from tours");
			
			
			
			
			)
	
	{
		
		Tours.displayData(rs);
		
//		while (rs.next()) {
//			String columnValue = rs.getString("");
//			
//		}
//		rs.last();
//		System.out.println("Number of rows: " + rs.getRow());
		
	}
	catch (SQLException e) {
		DBUtil.processException(e);
	}

	
	
	}
}
		

	
	