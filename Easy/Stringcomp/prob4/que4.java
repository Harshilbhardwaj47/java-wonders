package exp8;

public class que4 {
	public static void main(String[] args) {
		Integer count = 0;
		String s = new String("harshil bhardwaj");
		System.out.println("length of name is: " + s.length()); // using length method
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' && s.charAt(i) == 'a') {
				count++;
				System.out.println("element a is found at: " + i + " position");
			}
		}
		System.out.println("element a is found " + count + " times");
	}
}

