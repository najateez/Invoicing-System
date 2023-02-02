package InvoicingSystem;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		


		// switch statement inside switch statement:-
		// https://stackoverflow.com/questions/1583744/java-question-is-it-possible-to-have-a-switch-statement-within-another-one

		boolean isExit = true;
		boolean goBack = true;

		Scanner in = new Scanner(System.in);
		try {
			do {

				Menu menuObj = new Menu();
				menuObj.applicationMainMenu();

				int choice = in.nextInt();

				switch (choice) {
				case 0: {
					
					Scanner s=new Scanner(System.in);

					boolean flag = true;

					
						while(flag) {
							String url = "jdbc:mysql://localhost:3306/invoicingsystem";
							String user = "root";
							String pass = "10@104Ar$"; 

							System.out.println("Enter url:");
							 url=s.next();
							System.out.println("Enter user:");
							 user=s.next();
							System.out.println("Enter password:");
							 pass=s.next();

							if(url.equals("jdbc:mysql://localhost:3306/invoicingsystem")&& user.equals("root")&& pass.equals("10@104Ar$") ) {

								Tables createTablesObj=new Tables();
								createTablesObj.createInvoiceTable();
								createTablesObj.createItemTable();
								createTablesObj.createShopTable();

								System.out.println("Lets get started!!");
								System.out.println("------------------------------");
								flag=false;
							}else {
								System.out.println("Invalid url or user or password!");
							}
						}
					
					break;
				}
				case 1: {

					Menu menuObj1 = new Menu();
					menuObj1.shopSettingMenu();

					ShopSettings ssobj = new ShopSettings();

					/*
					 * System.out.println("Shop Setting");
					 * System.out.println("*******************************");
					 * System.out.println("Menu:");
					 * System.out.println("1:Load Data (Items and invoices).");
					 * System.out.println("2:Set Shop Name (data should be saved)."); System.out.
					 * println("3:Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved) "
					 * ); System.out.println("4:Go Back");
					 * System.out.println("*******************************");
					 * System.out.println("enter number 1: (case number)");
					 */
					int option = in.nextInt();

					switch (option) {
					case 1:{

						System.out.println("enter your option from menu above: ");
						int op = in.nextInt();
						if (op == 1) {
							ssobj.loadDataInvoice();
							ssobj.loadDataItem();
						} else if (op == 2) {
							ssobj.insertDataIntoShopTable();
						} else if (op == 3) {
							ssobj.loadDataInvoice(); // already these columns added in invoice table.
						} else if (op == 4) {
							goBack=false;
						} else {
							System.out.println("t is not an option, try again.");
						}
					}

					}
					break;
				}case 2: {

					Menu menuObj2 = new Menu();
					menuObj2.manageShopItemsMenu();

					ManageShopItems msiobj = new ManageShopItems();

					/*
					 * System.out.println("Manage Shop Items");
					 * System.out.println("*******************************");
					 * System.out.println("Menu:");
					 * System.out.println("1:Add Items (Item should be saved/serialized)");
					 * System.out.println("2:Delete Items");
					 * System.out.println("3:Change Item Price");
					 * System.out.println("4:Report All Items"); System.out.println("5:Go Back");
					 * System.out.println("*******************************");
					 * System.out.println("enter number 1: (case number)");
					 */
					int optionn = in.nextInt();

					switch (optionn) {
					case 1: {

						System.out.println("enter your option from menu above: ");
						int opt = in.nextInt();

						if (opt == 1) {
							msiobj.addItems();
						} else if (opt == 2) {
							msiobj.deleteById();
						} else if (opt == 3) {
							msiobj.updateById();
						} else if (opt == 4) {
							msiobj.reportAllItems();
						} else if (opt == 5) {
							goBack=false;
						} else {
							System.out.println("it is no an option, try again");
						}
					}
					}
					break;
				}
				case 3: {

					ShopSettings ssObj = new ShopSettings();
					ssObj.loadDataInvoice();
					break;
				}
				case 4: {
					Report reportObj = new Report();
					reportObj.readReportStatisticsFromInvoiceTable();
					break;
				}
				case 5: {
					Report reportObj = new Report();
					reportObj.readReportAllInvoicesFromInvoiceTable();
					break;
				}
				case 6: {
					SearchReport reportObj = new SearchReport();
					reportObj.searchById();
					break;
				}
				case 7: {
					Report reportObj = new Report();
					reportObj.programStatisticsPrintMenuItemWithHowManyNumberSelected();
					break;
				}
				case 8: {

					System.out.println("Are you sure you want to exit? yes/no");
					String choose = in.next();

					if (choose.equals("yes")) {
						isExit = false;
					} else {
						isExit = true;
					}
					break;
				}
				}
			} while (isExit);

		} catch (InputMismatchException e) {
			System.out.println("Error!: enter any number from menu above. can not be string, try again.");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
}
