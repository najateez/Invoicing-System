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
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
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
			count1=count1+1;
		}else if(number == 2) {
				inputString="Manage Shop Items.";
			count2=count2+1;
		}else if(number == 3){
				inputString="Create New Invoice.";
			count3=count3+1;
		}else if(number == 4){
				inputString="Report Statistics.";
			count4=count4+1;
		}else if(number == 5){
				inputString="Report: All Invoices.";
			count5=count5+1;
		}else if(number == 6){
				inputString="Search (1) Invoice.";
			count6=count6+1;
		}else if(number == 7){
				inputString="Program Statistics.";
			count7=count7+1;
		}else if(number == 8){
				inputString="Exit";
			count8=count8+1;
		}else {
          System.out.println("It is not an option. Try again");	
		}
		
					
		if(number == 0) {
		menuChoice.put(count, inputString);
		}else if(number == 1) {
			menuChoice.put(count1, inputString);
		}else if(number == 2) {
			menuChoice.put(count2, inputString);
		}else if(number == 3) {
			menuChoice.put(count3, inputString);
		}else if(number == 4) {
			menuChoice.put(count4, inputString);
		}else if(number == 5) {
			menuChoice.put(count5, inputString);
		}else if(number == 6) {
			menuChoice.put(count6, inputString);
		}else if(number == 7) {
			menuChoice.put(count7, inputString);
		}else if(number == 8) {
			menuChoice.put(count8, inputString);
		}
		
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
		
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		boolean isExit=true;
		
		while(isExit) {
			
			Map<Integer,String> menuChoice = new HashMap<Integer,String>();
			
		System.out.println("Enter a number (1 to 4):");
		 int number=s.nextInt();
		
		 
		String inputString = "";
		
		
		 if(number == 1) {
				inputString="Load Data.";
			count1=count1+1;
		}else if(number == 2) {
				inputString="Set Shop Name.";
			count2=count2+1;
		}else if(number == 3){
				inputString="Set Invoice Header";
			count3=count3+1;
		}else if(number == 4){
				inputString="Go Back.";
			count4=count4+1;
		}else {
          System.out.println("It is not an option. Try again");	
		}
		
		
		 
		 if(number == 1) {
			  menuChoice.put(count1, inputString);
			}else if(number == 2) {
			 menuChoice.put(count2, inputString);
			}else if(number == 3) {
			 menuChoice.put(count3, inputString);
			}else if(number == 4) {
			menuChoice.put(count4, inputString);
			}
		
		
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
		
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		boolean isExit=true;
		
		while(isExit) {
			
			Map<Integer,String> menuChoice = new HashMap<Integer,String>();
			
		System.out.println("Enter a number (1 to 5):");
		 int number=s.nextInt();
		
		 
		String inputString = "";
		
		
		 if(number == 1) {
			inputString="Add Items.";
			count1=count1+1;
		}else if(number == 2) {
			inputString="Delete Items.";
			count2=count2+1;
		}else if(number == 3){
			inputString="Change Item Price";
			count3=count3+1;
		}else if(number == 4){
			inputString="Report All Items.";
			count4=count4+1;
		}else if(number == 5){
			inputString="Go Back.";
		    count5=count5+1;
	    }else {
          System.out.println("It is not an option. Try again");	
		}
		 
		 
		 
	 if(number == 1) {
		 menuChoice.put(count1, inputString);
		}else if(number == 2) {
		 menuChoice.put(count2, inputString);
		}else if(number == 3) {
		 menuChoice.put(count3, inputString);
		}else if(number == 4) {
		 menuChoice.put(count4, inputString);
		}else if(number == 5) {
		 menuChoice.put(count5, inputString);
		}

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
