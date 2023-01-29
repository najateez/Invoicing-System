package InvoicingSystem;

import java.util.Scanner;

public class ManageShopItems {

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
			 break;
			}case 2: {
			 break;
			}case 3: {
			 break;
			}case 4: {
			 break;
			}case 5: {
			  isExit=false;
			  break;
			}
			}
	   }while(isExit);
		

	}

}
