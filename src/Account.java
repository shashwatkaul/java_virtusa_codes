
import java.util.*;

class Account1 {
	int accountNumber;
	double balance = 0.0;
	Scanner a = new Scanner(System.in);
	

	public int getAccountNumber() {
		System.out.println("Enter the Accout Number");
		return accountNumber = a.nextInt();
	}

	public double getBalance() {
		System.out.print("Your remaining balance is :" + balance);
		return 0;
	}
	

	public void setBalance(double balance1) {
		balance = balance1;
	}

	public void credit(double amount) {
		balance = balance + amount;

	}

	public void debit(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else
			System.out.println("amount withdrawn exceeds the corrent balance!");

	}

	public String toString() {
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Account Balance:" + balance);
		return "";
	}

}

public class Account {

	public static void main(String[] args) {

		Account1 obj = new Account1();

		obj.getAccountNumber();
		obj.setBalance(5000);
		obj.credit(3000);
		obj.debit(2000);
		obj.toString();
		obj.getBalance();
		
		
	}

}
