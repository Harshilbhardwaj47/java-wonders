package exp8;

import java.util.Scanner;

public class que3 {
	static String LowerToUpper(String s) {
		String result = ("");
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) {

			// check valid alphabet and it is in lower-case
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ch = (char) (s.charAt(i) - 32); // here we are dealing with the asscii values of characters in string
			}
			// else keep the same alphabet or any character
			else {
				ch = (char) (s.charAt(i));
			}

			result = result + ch; // concatenation, append c to result
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter lower case string: ");
		String s = in.nextLine();
		System.out.println("lower case string converted into upper case string: " + LowerToUpper((s)));
	}
}

