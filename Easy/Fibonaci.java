package exp2;

import java.util.Scanner;

public class Fibonaci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter two starting num");
		long num1 = in.nextInt();
		long num2 = in.nextInt();
		System.out.println("Enter the num upto which we want to print fabonicci series");
		long num = in.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		for (long i = 1; i < num; i++) {
			long c = num1 + num2;// here we used long because if have to print a large series the result will got
									// out of bounds under int
			System.out.println(c);
			num1 = num2;
			num2 = c;
		}

	}
}

