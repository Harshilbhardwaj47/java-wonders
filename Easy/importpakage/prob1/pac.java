package exp6;

import java.util.Scanner;

public class pac { // defining class
	public int num1, num2;
	protected String member;

	public pac() // defining constructor
	{
		System.out.println("Enter value of num1,num2");
		Scanner in = new Scanner(System.in); // making object for scanner class
		num1 = in.nextInt();
		num2 = in.nextInt();
		System.out.println(num1 + num2);
	}

}
