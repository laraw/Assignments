package ClassicModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseHelper {
	
public static void createProduct(Product newproduct) {
	Connection conn = null;
	PreparedStatement pst = null;
		
	try {
		conn = DBUtil.getConnection(DBType.MYSQL);
		pst = conn.prepareStatement("CALL insertNewProduct (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		pst.setString(1, newproduct.getProductCode());
		pst.setString(2, newproduct.getProductName());
		pst.setString(3, newproduct.getProductLine());
		pst.setString(4, newproduct.getProductScale());
		pst.setString(5, newproduct.getProductVendor());
		pst.setString(6, newproduct.getProductDesc());
		pst.setInt(7, newproduct.getQtyStock());
		pst.setDouble(8, newproduct.getPrice());
		pst.setDouble(9, newproduct.getMSRP());
		int result = pst.executeUpdate();
		if(result == 1) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
		conn.close();
		pst.close();
		
	} catch (SQLException e) {
		System.out.print(e.getMessage());
	}
}


public static void createProductLine(ProductLine newproductLine) {
	Connection conn = null;
	PreparedStatement pst = null;
		
	try {
		conn = DBUtil.getConnection(DBType.MYSQL);
		pst = conn.prepareStatement("CALL newProductLine (?, ?)");
		pst.setString(1, newproductLine.getProductLine());
		pst.setString(2, newproductLine.getTextDesc());
		int result = pst.executeUpdate();
		if(result == 1) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
		conn.close();
		pst.close();
		
	} catch (SQLException e) {
		System.out.print(e.getMessage());
	}
}

public static boolean checkProductLine (String productlinecheck) {
	Connection conn = null;
	PreparedStatement pst = null;
	boolean success = false;
	try {
		conn = DBUtil.getConnection(DBType.MYSQL);
		pst = conn.prepareStatement("CALL checkProductLines(?)");
		pst.setString(1, productlinecheck);
		ResultSet result = pst.executeQuery();
		
		while (result.next()) {
			String plcheck = result.getString(1);
			
			if (plcheck.equalsIgnoreCase(productlinecheck)) {				
				
				success = true;
			}
			
		}
		pst.close();
		conn.close();
		return success;
		
		
	}
	
	catch (SQLException ex) {
		System.out.print(ex.getMessage());
	}
	return success;
}

public static boolean checkProductCode (String productCode) {
	Connection conn = null;
	PreparedStatement pst = null;
	boolean success = false;
	try {
		conn = DBUtil.getConnection(DBType.MYSQL);
		pst = conn.prepareStatement("CALL checkProductCode(?)");
		pst.setString(1, productCode);
		ResultSet result = pst.executeQuery();
		
		while (result.next()) {
			String pccheck = result.getString(1);
			
			if (pccheck.equalsIgnoreCase(productCode)) {				
				
				success = true;
			}
		}
		pst.close();
		conn.close();
		}
		
	
		
	
	catch (SQLException ex) {
		System.out.print(ex.getMessage());
	}
	return success;
	}
	
}


