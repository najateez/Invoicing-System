package InvoicingSystem;

public class Product {
	
	/* the relationship between invoice and product is Composition. Because strong relationship.
	  it means we can not get invoice without item, so if class invoice is destroyed, also class
	  product will destroy.
	 */
	private int item_id;
	private String item_name;
	private double unit_price;
	private int quantity;
	private int price;
	private Invoice invoice;
	

	public Product(int item_id, String item_name, double unit_price, int quantity, int price, int invoice_id, String customerFullName, int phone_number, String invoice_date, int number_of_items,
			double total_amount, double paid_amount, double balance, String tel, String fax, String email,
			String website) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.unit_price = unit_price;
		this.quantity = quantity;
		this.price = price;
		this.invoice = new Invoice(invoice_id,customerFullName,phone_number,invoice_date,number_of_items,total_amount,paid_amount,balance,tel,fax,email,website);
	}
	


	
	@Override
	public String toString() {
		return "Product [item_id=" + item_id + ", item_name=" + item_name + ", unit_price=" + unit_price + ", quantity="
				+ quantity + ", price=" + price + ", invoice=" + invoice.toString() + "]";
	}


	public static void main(String[] args) {
		
		Product productObj= new Product(767,"chocolate",4.5,10,88,123,"najateez",9372,"1996/6/8",5,2.3,99.2,7.3,"(+383)","fjkhf","abc@d.com","google.com");
		System.out.println(productObj.toString());

	}

}
