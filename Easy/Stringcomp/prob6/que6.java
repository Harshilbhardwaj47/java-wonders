package exp8;

public class que6 {
	public static void main(String[] args) {

		Float fObj = new Float("78.50");
		// use byteValue method of Float class to convert it into byte type.
		byte b = fObj.byteValue();
		System.out.println(b);

		// use shortValue method of Float class to convert it into short type.
		short s = fObj.shortValue();
		System.out.println(s);

		// use intValue method of Float class to convert it into int type.
		int i = fObj.intValue();
		System.out.println(i);

		// use floatValue method of Float class to convert it into float type.
		float f = fObj.floatValue();
		System.out.println(f);

		// use doubleValue method of Float class to convert it into double type.
		double d = fObj.doubleValue();
		System.out.println(d);
		// float to double
		String si = fObj.toString();
		System.out.println(si);

	}
}

