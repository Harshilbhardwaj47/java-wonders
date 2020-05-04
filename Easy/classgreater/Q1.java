package exp3;

import java.util.Scanner;

public class Q1 {
	private static int var1;
	public static int var2;

	Q1() {
		Scanner s = new Scanner(System.in);
		var1 = s.nextInt();
		var2 = s.nextInt();
	}

	private void add() {
		Integer sum = var1 + var2;
		System.out.println("sum is :" + sum);
	}

	public void greater() {
		if (var1 > var2) {
			System.out.println(var1 + ": is greater");
		} else if (var2 > var1) {
			System.out.println(var2 + ": is greater");
		} else {
			System.out.println("both are equal");
		}
	}

	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.greater();// using the obj object called greater method and printed which number is
						// greater
		obj.add();// using the obj object called add method and printed the sum
	}
}

