package InvoicingSystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Report {
	
	public static void readReportStatisticsFromInvoiceTable(){
		
	    String url = "jdbc:mysql://localhost:3306/invoicingsystem";
	    String user = "root";
        String pass = "10@104Ar$";
    
		Scanner in = new Scanner(System.in);
		
		Connection con = null;
		
		try {
			 Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			 DriverManager.registerDriver(driver);
			 con = DriverManager.getConnection(url, user, pass);
			 Statement st = con.createStatement();
			 
			 
			 String sql = "SELECT * FROM Invoice";
			 ResultSet rs = st.executeQuery(sql);  //ResultSet class import from library
			 
			while (rs.next()) {
				int invoice_id = rs.getInt("invoice_id");
				int number_of_items = rs.getInt("number_of_items");
				double total_amount = rs.getDouble("total_amount");
				
				System.out.println("invoice id:"+ invoice_id + ", number of items:" + number_of_items +", total_amount: " + total_amount);
			//	count++;
			 }
			con.close();
		}catch (Exception ex) {
			System.err.println(ex);
		}
	}
	
public static void readReportAllInvoicesFromInvoiceTable(){
		
	    String url = "jdbc:mysql://localhost:3306/invoicingsystem";
	    String user = "root";
        String pass = "10@104Ar$";
    
		Scanner in = new Scanner(System.in);
		
		Connection con = null;
		
		try {
			 Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			 DriverManager.registerDriver(driver);
			 con = DriverManager.getConnection(url, user, pass);
			 Statement st = con.createStatement();
			 
			 
			 String sql = "SELECT * FROM Invoice";
			 ResultSet rs = st.executeQuery(sql);  //ResultSet class import from library
			 
			while (rs.next()) {
				int invoice_id = rs.getInt("invoice_id");
				String invoice_date = rs.getString("invoice_date");
				String customerFullName = rs.getString("customerFullName");
				int number_of_items = rs.getInt("number_of_items");
				double total_amount = rs.getDouble("total_amount");
				double balance = rs.getDouble("balance");
				
				System.out.println("invoice id:"+ invoice_id + ", invoice date:" + invoice_date +", customer full name:" + customerFullName + ", number_of_items:" + number_of_items + ", total_amount:" + total_amount+ ", balance:" + balance);
			//	count++;
			 }
			con.close();
		}catch (Exception ex) {
			System.err.println(ex);
		}
	}

	public static void main(String[] args) {
		
		
		
		
		

	}

}
