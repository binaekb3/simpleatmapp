package atm;

import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		Scanner b3 = new Scanner(System.in);
		int balance = 5000, deposit, withdraw;

		while (true) {
			System.out.println("you're in");
			System.out.println("enter 1 for withdraw");
			System.out.println("enter 2 to deposit");
			System.out.println("enter 3 for balance");
			System.out.println("enter 4 for exit");
			int n = b3.nextInt();

			switch (n) {
			case 1:
				System.out.println("enter the amount withdrawn");
				withdraw = b3.nextInt();
				if (withdraw <= balance) {
					balance = balance - withdraw;
				} else {
					System.out.println("insufficent funds");
				}

				break;
			case 2:
				System.out.println("enter the amount you want to deposit ");
				deposit = b3.nextInt();
				balance = balance + deposit;
				System.out.println("your balance" + balance);
				break;
			case 3
			:
				System.out.println("balance"+balance);
				
				break;
				
			case 4:
				System.exit(0);
			
				
				
			}
		}

	}

}
