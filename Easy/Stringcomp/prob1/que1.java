package exp8;

public class que1 {
	public static void main(String[] args) {
		String in = "Hi i am harshil bhadwaj i love plalying basketball and i love java i want to explore about it more";
		System.out.println("First index at which i occurs:" + in.indexOf("i"));
		System.out.println("last index at which i occurs:" + in.lastIndexOf("i"));
		System.out.println("First index at which i occurs after some index:" + in.indexOf("i", 5));
		// for a substring
		String sub = "am";
		System.out.println("First index at which " + sub + " occurs:" + in.indexOf(sub));
		System.out.println("last index at which " + sub + " occurs:" + in.lastIndexOf(sub));
		System.out.println("First index at which " + sub + " occurs after some index:" + in.indexOf(sub, 5));
	}

}

