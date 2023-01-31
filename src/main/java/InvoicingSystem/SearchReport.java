package InvoicingSystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchReport {
	
public static void searchById(){
		
		String url = "jdbc:mysql://localhost:3306/invoicingsystem";
	    String user = "root";
        String pass = "10@104Ar$";
        
        Connection con = null;
        
        try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("enter id you want to search:");
			int invoice_id = in.nextInt();
			
			String sql = "select * from Invoice inner join Item on Invoice.invoice_id=Item.invoice_id where Item.invoice_id='" + invoice_id + "'";
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				int invoice_idd = rs.getInt(1);
				String customerFullName = rs.getString(2);
				int phone_number = rs.getInt(3);
				String invoice_date = rs.getString(4);
				int number_of_items = rs.getInt(5);
				double total_amount = rs.getDouble(6);
				double paid_amount = rs.getDouble(7);
				double balance = rs.getDouble(8);
				String Tel = rs.getString(9);
				String Fax = rs.getString(10);
				String Email = rs.getString(11);
				String Website = rs.getString(12);
				int item_id = rs.getInt(13);
				

				System.out.println("invoice id:" + invoice_idd + "," + "customer full name:" + customerFullName + ","
				+ "phone number:" + phone_number + "," + "invoice date:" + invoice_date + ","  
				+ "number of items:" + number_of_items + "," + "total amount:"+ total_amount
				+ "," + "paid amount:"+ paid_amount+ "," + "balance:"+ balance
				+ "," + "Tel:"+ Tel+ "," + "Fax:"+ Fax+"," + "Email:"+ Email+ "," +"Website:"+ Website+ "," +"item id:"+ item_id);

			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		
		

	}

}
