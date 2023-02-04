package InvoicingSystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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


public static void programStatisticsPrintMainAppMenuWithHowManyNumberSelected(){
	
	Scanner s=new Scanner(System.in);
	
	//	Map<Integer,String> menuChoice = new HashMap<Integer,String>();
		Map<Integer, Map<Integer,String>> counterMap= new HashMap <Integer, Map<Integer,String>>();
		
		int count = 0;	
		boolean isExit=true;
		
		while(isExit) {
			
			Map<Integer,String> menuChoice = new HashMap<Integer,String>();
			
		System.out.println("Enter a number (0 to 8):");
		 int number=s.nextInt();
		
		 
		String inputString = "";
		
		
		if(number == 0) {
				inputString="Enter URL,user name, and password";
			count=count+1;
		}else if(number == 1) {
				inputString="Shop Settings.";
			count=count+1;
		}else if(number == 2) {
				inputString="Manage Shop Items.";
			count=count+1;
		}else if(number == 3){
				inputString="Create New Invoice.";
			count=count+1;
		}else if(number == 4){
				inputString="Report Statistics.";
			count=count+1;
		}else if(number == 5){
				inputString="Report: All Invoices.";
			count=count+1;
		}else if(number == 6){
				inputString="Search (1) Invoice.";
			count=count+1;
		}else if(number == 7){
				inputString="Program Statistics.";
			count=count+1;
		}else if(number == 8){
				inputString="Exit";
			count=count+1;
		}else {
          System.out.println("It is not an option. Try again");	
		}
		
					
		
		menuChoice.put(count, inputString);
		counterMap.put(number, menuChoice);
		
		System.out.println("0:Press zero(0) to continue.\n1:Press one (1) to exit. ");
		int inputflag=s.nextInt();
		if(inputflag==1) {
			isExit=false;
		}
		}
		System.out.println(counterMap);

}


public static void programStatisticsPrintShopSettingMenuWithHowManyNumberSelected(){
	
	Scanner s=new Scanner(System.in);
	
	//	Map<Integer,String> menuChoice = new HashMap<Integer,String>();
		Map<Integer, Map<Integer,String>> counterMap= new HashMap <Integer, Map<Integer,String>>();
		
		int count = 0;	
		boolean isExit=true;
		
		while(isExit) {
			
			Map<Integer,String> menuChoice = new HashMap<Integer,String>();
			
		System.out.println("Enter a number (1 to 4):");
		 int number=s.nextInt();
		
		 
		String inputString = "";
		
		
		 if(number == 1) {
				inputString="Load Data.";
			count=count+1;
		}else if(number == 2) {
				inputString="Set Shop Name.";
			count=count+1;
		}else if(number == 3){
				inputString="Set Invoice Header";
			count=count+1;
		}else if(number == 4){
				inputString="Go Back.";
			count=count+1;
		}else {
          System.out.println("It is not an option. Try again");	
		}
		
					
		
		menuChoice.put(count, inputString);
		counterMap.put(number, menuChoice);
		
		System.out.println("0:Press zero(0) to continue.\n1:Press one (1) to exit. ");
		int inputflag=s.nextInt();
		if(inputflag==1) {
			isExit=false;
		}
		}
		System.out.println(counterMap);

}


public static void programStatisticsPrintManageShopItemsMenuWithHowManyNumberSelected(){
	
	Scanner s=new Scanner(System.in);
	
	//	Map<Integer,String> menuChoice = new HashMap<Integer,String>();
		Map<Integer, Map<Integer,String>> counterMap= new HashMap <Integer, Map<Integer,String>>();
		
		int count = 0;	
		boolean isExit=true;
		
		while(isExit) {
			
			Map<Integer,String> menuChoice = new HashMap<Integer,String>();
			
		System.out.println("Enter a number (1 to 5):");
		 int number=s.nextInt();
		
		 
		String inputString = "";
		
		
		 if(number == 1) {
			inputString="Add Items.";
			count=count+1;
		}else if(number == 2) {
			inputString="Delete Items.";
			count=count+1;
		}else if(number == 3){
			inputString="Change Item Price";
			count=count+1;
		}else if(number == 4){
			inputString="Report All Items.";
			count=count+1;
		}else if(number == 5){
			inputString="Go Back.";
		    count=count+1;
	    }else {
          System.out.println("It is not an option. Try again");	
		}
		
					
		
		menuChoice.put(count, inputString);
		counterMap.put(number, menuChoice);
		
		System.out.println("0:Press zero(0) to continue.\n1:Press one (1) to exit. ");
		int inputflag=s.nextInt();
		if(inputflag==1) {
			isExit=false;
		}
		}
		System.out.println(counterMap);

}

	public static void main(String[] args) {
		
		
		
		
		

	}

}
