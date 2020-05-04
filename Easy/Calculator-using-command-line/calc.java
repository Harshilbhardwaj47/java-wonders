package exp2;

public class calc {
	public static void main(String[] args) {
		int num1 = int.parseInt(args[0]);
		String operator = args[1];
		int num2 = int.parseInt(args[2]);
		int operation = 0;
		if (operator.contentEquals("+")) // content equals is used to equate any character
			operation = num1 + num2;
		if (operator.contentEquals("*"))
			operation = num1 * num2;
		if (operator.contentEquals("-"))
			operation = num1 - num2;
		if (operator.contentEquals("/"))
			operation = num1 / num2;
		System.out.println("answer of " + operator + ": " + operation);
	}
}

