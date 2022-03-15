/* 13)Create a class Account to provide a method called debit that withdraws money from an 
Account. Ensure that the debit amount does not exceed the Account’s balance. If it does, the 
balance should be left unchanged and the method should print a message indicating ―Debit 
amount exceeded account balance. */

package pfa.java.assignments;

public class Account {
	
	void Debit(int deb_amt,int acc_bal) {
		if (deb_amt > acc_bal) {
			System.out.println("Debit amount exceeded account balance");
		}
		else {
			int curr_bal = acc_bal - deb_amt;
			System.out.println("Amount has been debited");
			System.out.println("Current Balance:"+curr_bal);
		}
		
	}
	public static void main(String[] args) {
		int acc_bal = 1000;
		int deb_amt = 1500;
		Account obj = new Account();
		obj.Debit(deb_amt,acc_bal);
		
	}

}
