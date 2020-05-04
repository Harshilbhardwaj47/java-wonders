import java.util.Random;

public class rand {
	public static void main(String[] args) {
		Random rand = new Random();
		int randnumber = rand.nextInt(1000);
		for (int i = 0; i < randnumber; i++) {
			System.out.println(randnumber);
		}
	}
}

