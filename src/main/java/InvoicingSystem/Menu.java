package InvoicingSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
	
public static void showAllMenusInOneMethod(int menuChoice) {
	
	String [] appMainMenu = new String[] {
			"Application Main Menu",
			"*******************************",
			"0) Enter URL,user name, and password.",
			"1) Shop Settings.",
            "2) Manage Shop Items",
            "3) Create New Invoice",
            "4) Report: Statistics (No Of Items, No of Invoices, Total Sales).",
            "5) Report: All Invoices (Invoice No, Invoice Date, Customer Name, No of items, Total, Balance).",
            "6) Search (1) Invoice (Search by Invoice No and Report All Invoice details with items).",
            "7) Program Statistics (Print each Main Menu Item with how many number selected).",
            "8) Exit",
            "*******************************",
            "Enter a number from menu above:"};
	
	
	String [] shopSettingMenu = new String[] {
			"Shop Setting",
			"*******************************",
			"Menu:",
			"1:Load Data (Items and invoices).",
			"2:Set Shop Name (data should be saved).",
			"3:Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved) ",
			"4:Go Back",
			"*******************************",
			"enter number 1: (case number)"};
	
	
	String [] manageShopItemsMenu = new String[] {
		"Manage Shop Items",
		"*******************************",
		"Menu:",
		"1:Add Items (Item should be saved/serialized)",
		"2:Delete Items",
		"3:Change Item Price",
		"4:Report All Items",
		"5:Go Back",
		"*******************************",
		"enter number 1: (case number)"};
	
	
	switch(menuChoice) {
	case 1:{
		printMenu(appMainMenu);
		break;
	}case 2:{
		printMenu(shopSettingMenu);
		break;
	}case 3:{
		printMenu(manageShopItemsMenu);
		break;
	}}
	}

	
	public static void printMenu(String [] displayMenus) {
		for(String i:displayMenus) {
			System.out.println(i);
		} 
	} 

}