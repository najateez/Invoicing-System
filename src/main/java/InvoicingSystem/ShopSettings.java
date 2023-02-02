package InvoicingSystem;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ShopSettings {
	
	 public static void loadDataInvoice() {
	    	
	    	Scanner in= new Scanner(System.in);
	    	
	    	String url = "jdbc:mysql://localhost:3306/invoicingsystem";
			 String user = "root";
		     String pass = "10@104Ar$"; 
	            
	            Connection con = null;
	            
	        try {
	        	 Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
	             DriverManager.registerDriver(driver);
	             
	             con = DriverManager.getConnection(url, user, pass);
	             Statement st = con.createStatement();
	             
	             System.out.println("How many data you want to insert in ivoice table:");
	             int insertData=in.nextInt();
	             
	          for(int i=0;i<insertData;i++)
	            {
	             System.out.println("enter customer full name:");
			     String customerFullName=in.next();
			     System.out.println("enter phone_number:");
			     int phone_number=in.nextInt();
			     System.out.println("enter invoice_date:");
			     String invoice_date=in.next();
			     System.out.println("enter number_of_items:");
			     int number_of_items=in.nextInt();
			     System.out.println("enter total_amount:");
			     double total_amount=in.nextDouble();
			     System.out.println("enter paid_amount:");
			     double paid_amount=in.nextDouble();
			     System.out.println("enter balance:");
			     double balance=in.nextDouble();
			     System.out.println("enter Tel:");
			     String tel=in.next();
			     System.out.println("enter Fax:");
			     String fax=in.next();
			     System.out.println("enter Email:");
			     String email=in.next();
			     System.out.println("enter Website:");
			     String website=in.next();
			        
		     String q1 = "insert into Invoice (customerFullName,phone_number,invoice_date,number_of_items,total_amount,paid_amount,balance,tel,fax,email,website) values('"+ customerFullName+ "', " +phone_number+ ", '" +invoice_date
		         + "', " +number_of_items+ ", " +total_amount+ ", " +paid_amount + ", " +balance+ ", '"
		           +tel+ "', '"+ fax+ "', '"+email+ "', '"+website+"')";
		     
	             int m = st.executeUpdate(q1);
	             if (m >=  1)
	                 System.out.println("Invoice values inserted successfully : " + q1);
	             else
	                 System.out.println("insertion failed");
	       //      con.close();
	             }
	        } catch (Exception ex) {
	             System.err.println(ex);
	         }
	}
	 
	 
	 public static void loadDataItem() {
	    	
	    	Scanner in= new Scanner(System.in);
	    	
	    	String url = "jdbc:mysql://localhost:3306/invoicingsystem";
			 String user = "root";
		     String pass = "10@104Ar$"; 
	            
	            Connection con = null;
	            
	        try {
	        	 Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
	             DriverManager.registerDriver(driver);
	             
	             con = DriverManager.getConnection(url, user, pass);
	             Statement st = con.createStatement();
	             
	             System.out.println("How many data you want to insert in item table:");
	             int insertData=in.nextInt();
	             
	          for(int i=0;i<insertData;i++)
	            { 
	             System.out.println("enter item name:");
			     String item_name=in.next();
			     System.out.println("enter unit_price:");
			     double unit_price=in.nextDouble();
			     System.out.println("enter quantity:");
			     int quantity=in.nextInt();
			     System.out.println("enter price:");
			     double price=in.nextDouble();
			     
			     
			     System.out.println("enter customer full name from invoice table:");
			     String customerFullName=in.next(); 
			     
			     String sql2="SELECT invoice_id FROM Invoice WHERE customerFullName='"+customerFullName+"'";
		         ResultSet rs1 = st.executeQuery(sql2);
		          rs1.next();
					int invoice_id = rs1.getInt("invoice_id");
			    
		     String q1 = "insert into Item (item_name,unit_price,quantity,price,invoice_id) values('"+ item_name+ "', " +unit_price+ "," +quantity
		         + ", " +price+ ", "+invoice_id+")";

	             int m = st.executeUpdate(q1);
	             if (m >=  1)
	                 System.out.println("Item values inserted successfully : " + q1);
	             else
	                 System.out.println("insertion failed");
	          //   con.close();
	            }
	        } catch (Exception ex) {
	             System.err.println(ex);
	         }  
	}
	 
	 
	 public static void insertDataIntoShopTable() {
	    	
	    	Scanner in= new Scanner(System.in);
	    	
	    	String url = "jdbc:mysql://localhost:3306/invoicingsystem";
			 String user = "root";
		     String pass = "10@104Ar$"; 
	            
	            Connection con = null;
	            
	        try {
	        	 Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
	             DriverManager.registerDriver(driver);
	             
	             con = DriverManager.getConnection(url, user, pass);
	             Statement st = con.createStatement();
	             
	             System.out.println("How many data you want to insert in shop table:");
	             int insertData=in.nextInt();
	             
	          for(int i=0;i<insertData;i++)
	            { 
	             System.out.println("enter shop name:");
			     String shop_name=in.next();
			    
			     System.out.println("enter items name from item table:");
			     String item_name=in.next(); 
			     
			     String sql="SELECT item_id FROM Item WHERE item_name='"+item_name+"'";
		         ResultSet rs = st.executeQuery(sql);
		          rs.next();
					int item_id = rs.getInt("item_id");
			    
		     String q1 = "insert into Shop (shop_name,item_id) values('"+ shop_name+ "', "+item_id+")";

	             int m = st.executeUpdate(q1);
	             if (m >=  1)
	                 System.out.println("Item values inserted successfully : " + q1);
	             else
	                 System.out.println("insertion failed");
	          //   con.close();
	            }
	        } catch (Exception ex) {
	             System.err.println(ex);
	         }  
	}
	 
	 
	 
/*	 public static void ShhhopSettingsss() {
			Scanner in=new Scanner(System.in);
			
			boolean goBack=true;
			
			do {
			  System.out.println("Shop Setting");
			  System.out.println("*******************************");
			  System.out.println("Menu:");
			  System.out.println("1:Load Data (Items and invoices).");
			  System.out.println("2:Set Shop Name (data should be saved).");
			  System.out.println("3:Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved) ");
			  System.out.println("4:Go Back");
			  System.out.println("*******************************");
			  System.out.println("enter number 1: (case number)");
			 
			int option = in.nextInt();

			switch (option) {
			case 1:{
				
				System.out.println("enter your option from menu above: ");
				int op = in.nextInt();
				if (op == 1) {
					loadDataInvoice();
					loadDataItem();
				} else if (op == 2) {
					insertDataIntoShopTable();
				} else if (op == 3) {
					loadDataInvoice(); // already these columns added in invoice table.
				} else if (op == 4) {
					Menu menuObj=new Menu();
					menuObj.showAllMenusInOneMethod(1);
					goBack=false;
				} else {
					System.out.println("t is not an option, try again.");
				}
			}
			
		}
	 }while(goBack);
	 } */
	 

	public static void main(String[] args) {
	
		
		
		
	
		

	}

}
