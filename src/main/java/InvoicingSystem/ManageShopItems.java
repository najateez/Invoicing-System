package InvoicingSystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class ManageShopItems {
	
	
	public static void addItems() {
    	
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
             
             System.out.println("How many items do you want to insert in item table:");
             int insertItem=in.nextInt();
             
          for(int i=0;i<insertItem;i++)
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
                 System.out.println("Item values inserted successfully: " + q1);
             else
                 System.out.println("insertion failed");
          //   con.close();
            }
        } catch (Exception ex) {
             System.err.println(ex);
         }  
}
	
	public static void deleteById() {
		
		String url = "jdbc:mysql://localhost:3306/invoicingsystem";
		 String user = "root";
	    String pass = "10@104Ar$";
	    
	    Scanner in=new Scanner(System.in);
	    
	   Connection con = null;
	   try {
	       Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
	       DriverManager.registerDriver(driver);
	       
	       con = DriverManager.getConnection(url, user, pass);
	       Statement st = con.createStatement();
	       
	       System.out.println("enter item id you want to delete:");
	   	   int item_id=in.nextInt();
	   	 
	       String sql = "delete from Item where item_id = ?";
	       PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(sql);
	       preparedStmt.setInt(1, item_id);
	       // execute the preparedstatement
	       preparedStmt.execute();
	       con.close(); 
	    }
	 catch (Exception ex) {
	     System.err.println(ex);
	   }
	}
	
	
	public static void updateById(){
		
		 String url = "jdbc:mysql://localhost:3306/invoicingsystem";
		    String user = "root";
	     String pass = "10@104Ar$";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter id to update item price:");
		int item_id = in.nextInt();
		
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(url, user, pass);
			
			//some instructions i follow from this website: https://alvinalexander.com/java/java-mysql-update-query-example/
			
			// create the java mysql update preparedstatement
			String sql = "update Item set price =? where item_id = ?";
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
			
			System.out.println(" enter new price:");
			double price =in.nextDouble();
			
			pstmt.setDouble(1,price);
			pstmt.setInt(2, item_id);
			pstmt.executeUpdate();
			
			String sql2 = "SELECT * FROM Item WHERE item_id = ?";
			PreparedStatement pstmt2 = (PreparedStatement) con.prepareStatement(sql2);
			pstmt2.setInt(1, item_id);
			ResultSet rs = pstmt2.executeQuery();
			if (rs.next()) {
			//	int item_id = rs.getInt("item_id");
				String item_name = rs.getString("item_name");
				double unit_price = rs.getDouble("unit_price");
				int quantity = rs.getInt("quantity");
				 price= rs.getDouble("price");
				int invoice_id= rs.getInt("invoice_id");
				
				System.out.println("item id:"+item_id + ", item_name:" + item_name + ", unit_price:" + unit_price + ", quantity:" + quantity + ", price:" + price + ", isActive:" + invoice_id);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
public static void reportAllItems(){
		
		String url = "jdbc:mysql://localhost:3306/invoicingsystem";
	    String user = "root";
        String pass = "10@104Ar$";
    
		Scanner in = new Scanner(System.in);
		
	/*	int readRows;
		System.out.println("Enter how many users you want to print on consol:");
		readRows = in.nextInt(); */
		
	//	int count = 0;
		Connection con = null;
		
		try {
			 Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			 DriverManager.registerDriver(driver);
			 con = DriverManager.getConnection(url, user, pass);
			 Statement st = con.createStatement();
			 
			 //as mr explaination on board
			 String sql = "SELECT * FROM Item";
			 ResultSet rs = st.executeQuery(sql);  //ResultSet class import from library
			 
			while (rs.next()) {
				int item_id = rs.getInt("item_id");
				String item_name = rs.getString("item_name");
				double unit_price = rs.getDouble("unit_price");
				int quantity = rs.getInt("quantity");
				double price = rs.getDouble("price");
				int invoice_id = rs.getInt("invoice_id");
				
				System.out.println("item id:"+ item_id + ", item name:" + item_name +", unit_price:" + unit_price +", quantity:" + quantity + ", price:" + price + ", invoice_id:" + invoice_id);
			//	count++;
			 }
			con.close();
		}catch (Exception ex) {
			System.err.println(ex);
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean isExit=true;

	   do {
			System.out.println("Manage Shop Items");
			System.out.println("*******************************");
			System.out.println("Menu:");
			System.out.println("1:Add Items (Item should be saved/serialized)");
			System.out.println("2:Delete Items");
			System.out.println("3:Change Item Price");
			System.out.println("4:Report All Items");
			System.out.println("5:Go Back");
			System.out.println("*******************************");
			System.out.println("Enter a number from menu: ");
			int choice = in.nextInt();

			switch (choice) {
			case 1: {
			  addItems();
			 break;
			}case 2: {
			  deleteById();
			 break;
			}case 3: {
			  updateById();
			 break;
			}case 4: {
			  reportAllItems();
			 break;
			}case 5: {
			  isExit=false;
			  break;
			}
			}
	   }while(isExit);
		

	}

}
