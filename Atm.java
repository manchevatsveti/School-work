package eddu.smg;
import java.util.Scanner;
import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	Account[] accounts = new Account[10];
	for(int i=0;i<10;i++) {
		accounts[i] = new Account(i,100);
//		System.out.println(i);
//		System.out.println(accounts[i].getId());
//		System.out.println(accounts[i].getBalance());
	}
	while(true) {
		System.out.println("Enter id");
	
	int id =in.nextInt();
	while(id>9 || id<0) {
		System.out.println("Enter valid id");
		}
	System.out.println("Option 1: See current balance");
	System.out.println("Option 2: Withdraw money");
	System.out.println("Option 3: Deposit money");
	System.out.println("Option 4: Exit of menu");
	
	int op = in.nextInt();
	while (op!=4) {
	switch(op) {
	case 1:
		System.out.println("Current account balance: "+accounts[id].getBalance());
		break;
	case 2:
		System.out.println("How much money do you want to withdraw?");
		double withdraw = in.nextDouble();
		accounts[id].withdraw(withdraw);
		System.out.println("Current account balance: "+accounts[id].getBalance());
		break;
	case 3:
		System.out.println("How much money do you want to deposit?");
		double deposit = in.nextDouble();
		accounts[id].deposit(deposit);
		System.out.println("Current account balance: "+accounts[id].getBalance());
		
	  }
	System.out.println("Option 1: See current balance");
	System.out.println("Option 2: Withdraw money");
	System.out.println("Option 3: Deposit money");
	System.out.println("Option 4: Exit of menu");
	op = in.nextInt();
	 }
    }
  }
}
