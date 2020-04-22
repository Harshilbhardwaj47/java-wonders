import java.io.File;
import java.io.IOException;

public class hidcl {
	public static void main(String[] args) {
		File file = new File("G:\\semester 4-original.txt");
		if (file.isHidden()) {
			System.out.println("The file is hidden");
		} else {
			System.out.println("The file is not hidden");

		}
	}
}

