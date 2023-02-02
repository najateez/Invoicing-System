package InvoicingSystem;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Tables {
	
public static void createInvoiceTable() {
		
		String url = "jdbc:mysql://localhost:3306/invoicingsystem";
		 String user = "root";
	     String pass = "10@104Ar$"; 
			
	     // can not create table with duplicate column name
		String invoiceTable = "CREATE TABLE Invoice (" 
		        + "invoice_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,"  
		        + "customerFullName VARCHAR(500)," 
		        + "phone_number INT NOT NULL,"
		        + "invoice_date VARCHAR(800),"
		        + "number_of_items INT NOT NULL,"
		        + "total_amount DECIMAL(5,3),"
		        + "paid_amount DECIMAL(5,3),"
		        + "balance DECIMAL(5,3),"
		        
                + "Tel VARCHAR(500),"
                + "Fax VARCHAR(400),"
                + "Email VARCHAR(500),"		        
		        + "Website VARCHAR(900) )"; 

	        Connection con = null;
	        
	        try {

	            Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
	            DriverManager.registerDriver(driver);
	            
	            con = DriverManager.getConnection(url, user,pass);
	            Statement st = con.createStatement();

	            int m = st.executeUpdate(invoiceTable);
	            if (m <=  1) {
	                System.out.println("table invoice created successfully.");
	                
	            }
	            else {
	                System.out.println("table invoice not created, try again");
	            }
	            con.close();
	        } catch (Exception ex) {
	            System.err.println("table invoice already exists.");
	  }
	        
	}


public static void createItemTable() {
	
	String url = "jdbc:mysql://localhost:3306/invoicingsystem";
	 String user = "root";
     String pass = "10@104Ar$"; 
		
     // can not create table with duplicate column name
	String itemTable = "CREATE TABLE Item (" 
	        + "item_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,"  
	        + "item_name VARCHAR(500)," 
	        + "unit_price DECIMAL(5,4),"
	        + "quantity INT,"
	        + "price DECIMAL(5,4),"
	        + "invoice_id int REFERENCES Invoice (invoice_id))"; 
	
        Connection con = null;
        
        try {

            Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(driver);
            
            con = DriverManager.getConnection(url, user,pass);
            Statement st = con.createStatement();

            int m = st.executeUpdate(itemTable);
            if (m <=  1) {
                System.out.println("table item created successfully.");
                
            }
            else {
                System.out.println("table item not created, try again");
            }
            con.close();
        } catch (Exception ex) {
            System.err.println("table item already exists.");
  }
        
}


public static void createShopTable() {
	
	String url = "jdbc:mysql://localhost:3306/invoicingsystem";
	 String user = "root";
     String pass = "10@104Ar$"; 
		
     // can not create table with duplicate column name
	String shopTable = "CREATE TABLE Shop (" 
	        + "shop_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,"  
	        + "shop_name VARCHAR(500),"
	        + "item_id int REFERENCES Item (item_id))"; 
	
        Connection con = null;
        
        try {

            Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(driver);
            
            con = DriverManager.getConnection(url, user,pass);
            Statement st = con.createStatement();

            int m = st.executeUpdate(shopTable);
            if (m <=  1) {
                System.out.println("table Shop created successfully.");
                
            }
            else {
                System.out.println("table Shop not created, try again");
            }
            con.close();
        } catch (Exception ex) {
            System.err.println("table shop already exists.");
  }
        
}

	public static void main(String[] args) {
		
		
		
		

	}

}
