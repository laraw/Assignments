import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ShowAuthors {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost/clientdb";
		String user = "dbuser";
		String password = "dbpassword";
		
		Scanner console = new Scanner(System.in);
		int clientID = 0;
		System.out.println("This program will show all transactions for the selected client");
		System.out.print("Please enter the client ID: ");
		clientID = console.nextInt();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			pst = con.prepareStatement("select t1.date, t1.total, t4.itemName, t2.price, t3.firstName, t3.lastName from trans_hdr t1 " 
			+ "inner join trans_lin t2 "
			+ "on t1.idtrans_hdr = t2.trans_hdr_id "
			+ "inner join items t4 "
			+ "on t2.item = t4.itemId "
			+ "inner join client t3 "
			+ "on t1.clientId = t3.clientid "
			+ "where t3.clientid = " + clientID);			
			rs = pst.executeQuery();
			
			System.out.print("Date");
			System.out.print(" | ");
			System.out.print("Order Total");
			System.out.print(" | ");
			System.out.print("Item Name");
			System.out.print(" | ");
			System.out.print("Item Price");
			System.out.print(" | ");
			System.out.print("First Name");
			System.out.print(" | ");
			System.out.print("Last Name");
			System.out.println();
			
			while (rs.next()) {
				System.out.print(rs.getDate(1));
				System.out.print(" | ");
				System.out.print(rs.getInt(2));
				System.out.print(" | ");
				System.out.print(rs.getString(3));
				System.out.print(" | ");
				System.out.print(rs.getInt(4));
				System.out.print(" | ");
				System.out.print(rs.getString(5));
				System.out.print(" | ");
				System.out.print(rs.getString(6));
				System.out.println();
			}
		}
		catch (SQLException ex) {
		     
			Logger lgr = Logger.getLogger(Prepared.class.getName());
            lgr.log(Level.WARNING, ex.getMessage(), ex);

		}
		
		finally {
			try {
				if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
			}
			}
			catch (SQLException ex) {
				Logger lgr = Logger.getLogger(Prepared.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
			}
		}

	}

}
