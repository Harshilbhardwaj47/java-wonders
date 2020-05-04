package exp2;

import java.util.Scanner;

public class Largestofthree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is greater :" + num1);

		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is greater :" + num2);
		} else if (num3 > num2 && num3 > num1) {
			System.out.println("num3 is greater :" + num3);
		}

		else {
			if (num1 == num2 && num1 > num3) {
				System.out.println("num1 and num2 are equal and greater then num3 :" + num1);
			} else if (num1 == num3 && num1 > num2) {
				System.out.println("num1 and num3 are equal and greater then num2 :" + num1);
			} else if (num2 == num3 && num2 > num1) {
				System.out.println("num2 and num3 are equal and greater then num1 :" + num2);
			} else if (num1 == num3 && num1 == num2) {
				System.out.println("all the entered numbers are equal no one is greater or smaller :" + num1);
			} else {
				System.out.println("you must be good that you entered this condition");
			}

		}

	}
}

