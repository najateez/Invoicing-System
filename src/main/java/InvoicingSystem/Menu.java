package InvoicingSystem;

public class Menu {
	
public static void applicationMainMenu() {
		
		System.out.println("Application Main Menu:");
		System.out.println("*******************************");
		System.out.println("0) Enter URL,user name, and password.");
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

public static void shopSettingMenu() {
	
	System.out.println("Shop Setting");
	System.out.println("*******************************");
	System.out.println("Menu:");
	System.out.println("1:Load Data (Items and invoices).");
	System.out.println("2:Set Shop Name (data should be saved).");
	System.out.println("3:Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved) ");
	System.out.println("4:Go Back");
	System.out.println("*******************************");
	System.out.println("enter number 1: (case number)");
	
}

public static void manageShopItemsMenu() {
	
	System.out.println("Manage Shop Items");
	System.out.println("*******************************");
	System.out.println("Menu:");
	System.out.println("1:Add Items (Item should be saved/serialized)");
	System.out.println("2:Delete Items");
	System.out.println("3:Change Item Price");
	System.out.println("4:Report All Items");
	System.out.println("5:Go Back");
	System.out.println("*******************************");
	System.out.println("enter number 1: (case number)");
	
}

	public static void main(String[] args) {
		

	}

}
