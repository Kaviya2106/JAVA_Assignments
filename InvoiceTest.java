/* 14)Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. 
  An Invoice should include four pieces of information as instance variables‐a part number(type String),a part description(type String),
 a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes
 the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoice 
Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. 
Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities. */

package pfa.java.assignments;
public class InvoiceTest {    //Main Class
class Invoice{              //Inner Class
//Instance variables
	String part_num , part_des;
	int quan_purchased;
	double price_per_item;
//Initialized using constructor
Invoice(String pn,String pd,int qp,double pp){
	this.part_num = pn;
	this.part_des = pd;
	this.quan_purchased = qp;
	this.price_per_item = pp;
}	
//Set and get methods for Instaince variables
	public void setpart_num(String part_num) {
		this.part_num = part_num;
	}
	public String getpart_num() {
		return part_num;
	}
	public void setpart_des(String part_des) {
		this.part_des = part_des;
	}
	public String getpart_des() {
		return part_des;
	}
	public void setquan_purchased(int quan_purchased) {
		this.quan_purchased =quan_purchased;
	}
	public int getquan_purchased() {
		return quan_purchased;
	}
	public void setprice_per_item(double price_per_item) {
		this.price_per_item = price_per_item;
	}
	public double getprice_per_item() {
		return price_per_item;
	}
	
	//Method to display InvoiceAmmout
		public void GetInvoiceAmount() {
			if (getquan_purchased() < 0) {
				setquan_purchased(0);
				System.out.println("Quantity Purchased:"+getquan_purchased());
				if  (getprice_per_item() < 0) {
					setprice_per_item(0.0);
					System.out.println("Price per Item:"+getprice_per_item());
			     }
				System.out.println("Invoice Amount:0");
			}
			else {
			double in_amt = getquan_purchased() * getprice_per_item();
			System.out.println("Invoice Amount:" +in_amt);
		    }
		}
}
public static void main(String[] args) {
	InvoiceTest obj = new InvoiceTest();
	//Invoice obj1 = obj.new Invoice("As4561","Face Wash",2,85.00);
	Invoice obj2 = obj.new Invoice("As4561","Soap",-2,-85.00);
	//obj1.GetInvoiceAmount();
	obj2.GetInvoiceAmount();
	
	
}
}
		




