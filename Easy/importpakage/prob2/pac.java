package ex6;

import java.util.Scanner;

class account {
	public String name;
	public int balance;

	account() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter you name :");
		name = in.nextLine();
		System.out.println("Enter your balance");
		balance = in.nextInt();
		System.out.println();
		System.out.println("dear :" + name + " your balance is :" + balance);
	}
}

public class pac {

	account obj = new account();
}

