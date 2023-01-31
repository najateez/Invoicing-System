package InvoicingSystem;

public class Invoice {
	
	private int invoice_id;
	private String customerFullName;
	private int phone_number;
	private String invoice_date;
	private int number_of_items;
	private double total_amount;
	private double paid_amount;
	private double balance;
	private String Tel;
	private String Fax;
	private String Email;
	private String Website;
	

	public Invoice(int invoice_id, String customerFullName, int phone_number, String invoice_date, int number_of_items,
			double total_amount, double paid_amount, double balance, String tel, String fax, String email,
			String website) {

		this.invoice_id = invoice_id;
		this.customerFullName = customerFullName;
		this.phone_number = phone_number;
		this.invoice_date = invoice_date;
		this.number_of_items = number_of_items;
		this.total_amount = total_amount;
		this.paid_amount = paid_amount;
		this.balance = balance;
		Tel = tel;
		Fax = fax;
		Email = email;
		Website = website;
	}
	

	@Override
	public String toString() {
		return "Invoice [invoice_id=" + invoice_id + ", customerFullName=" + customerFullName + ", phone_number="
				+ phone_number + ", invoice_date=" + invoice_date + ", number_of_items=" + number_of_items
				+ ", total_amount=" + total_amount + ", paid_amount=" + paid_amount + ", balance=" + balance + ", Tel="
				+ Tel + ", Fax=" + Fax + ", Email=" + Email + ", Website=" + Website + "]";
	}


	
	
	public static void main(String[] args) {
		

	}

}
