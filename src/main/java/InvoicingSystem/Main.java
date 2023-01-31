package InvoicingSystem;

import java.util.Scanner;

public class Main {
	
	public static void applicationMainMenu() {
		
		System.out.println("Application Main Menu:");
		System.out.println("*******************************");
		System.out.println("1) Shop Settings");
		System.out.println("2) Manage Shop Items");
		System.out.println("3) Create New Invoice");
		System.out.println("4) Report: Statistics (No Of Items, No of Invoices, Total Sales).");
		System.out.println("5) Report: All Invoices (Invoice No, Invoice Date, Customer Name, No of items, Total, Balance).");
		System.out.println("6) Search (1) Invoice (Search by Invoice No and Report All Invoice details with items).");
		System.out.println("7) Program Statistics (Print each Main Menu Item with how many number selected).");
		System.out.println("8) Exit");
		System.out.println("*******************************");
		System.out.println("Enter a number from menu above: ");
		
	}
	

	public static void main(String[] args) {
		
		//switch statement inside switch statement:-
		//https://stackoverflow.com/questions/1583744/java-question-is-it-possible-to-have-a-switch-statement-within-another-one
		
		boolean isExit= true;
		
		Scanner in = new Scanner(System.in);
		
    do {	
	/*	System.out.println("Application Main Menu:");
		System.out.println("*******************************");
		System.out.println("1) Shop Settings");
		System.out.println("2) Manage Shop Items");
		System.out.println("3) Create New Invoice");
		System.out.println("4) Report: Statistics (No Of Items, No of Invoices, Total Sales).");
		System.out.println("5) Report: All Invoices (Invoice No, Invoice Date, Customer Name, No of items, Total, Balance).");
		System.out.println("6) Search (1) Invoice (Search by Invoice No and Report All Invoice details with items).");
		System.out.println("7) Program Statistics (Print each Main Menu Item with how many number selected).");
		System.out.println("8) Exit");
		System.out.println("*******************************");
		System.out.println("Enter a number from menu above: "); */
    	
    	applicationMainMenu();
    	
		int choice = in.nextInt();

		switch (choice) {
		case 1: {
				ShopSettings ssobj= new ShopSettings();
				
				System.out.println("Shop Setting");
				System.out.println("*******************************");
				System.out.println("Menu:");
				System.out.println("1:Load Data (Items and invoices).");
				System.out.println("2:Set Shop Name (data should be saved).");
				System.out.println("3:Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved) ");
				System.out.println("4:Go Back");
				System.out.println("*******************************");
				System.out.println("Enter a number from menu: ");
				int option = in.nextInt();
				
				switch (option) {
				case 1: 
					
					if(option==1) {
					ssobj.loadDataInvoice();
					ssobj.loadDataItem();
					}else if(option==2) {
					ssobj.insertDataIntoShopTable();
					}else if(option==3) {
						ssobj.loadDataInvoice(); //already these columns added in invoice table.
					}else if(option==4) {
						applicationMainMenu();
					}else {
						System.out.println("t is not an option, try again.");	
					}
				}
				break;
		}
					
		case 2:{
			ManageShopItems msiobj= new ManageShopItems();
			
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
			int option = in.nextInt();
			
			switch (option) {
			case 1: {

				if(option==1) {
					msiobj.addItems();
				}else if(option==2) {
					msiobj.deleteById();
				}else if(option==3) {
					msiobj.updateById();
				}else if(option==4) {
					msiobj.reportAllItems();
				}else if(option==5) {
					applicationMainMenu();
				}else {
					System.out.println("it is no an option, try again");
				}
			}
			break;
		}
}case 3:{
	ShopSettings ssObj=new ShopSettings();
	ssObj.loadDataInvoice();
	break;
	}case 4:{
		Report reportObj= new Report();
		reportObj.readReportStatisticsFromInvoiceTable();
		break;
	}case 5:{
		Report reportObj= new Report();
		reportObj.readReportAllInvoicesFromInvoiceTable();
		break;
	}case 6:{
		SearchReport reportObj= new SearchReport();
		reportObj.searchById();
		break;
	}case 7:{
		Report reportObj= new Report();
		reportObj.programStatisticsPrintMenuItemWithHowManyNumberSelected();
		break;
	}case 8:{
		
		System.out.println("Are you sure you want to exit? yes/no");
		String choose=in.next();
		
		if(choose.equals("yes")) {
			isExit=false;
		}else { 
			isExit=true;
		}
		break;
	  }
     }
	}while(isExit);
    
    
		}
    }