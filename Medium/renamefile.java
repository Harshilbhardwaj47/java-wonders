import java.io.File;

public class rename {
	public static void main(String[] args) {
		File oldfile = new File("");
		File newfile = new File("");
		if (oldfile.renameTo(newfile)) {
			System.out.println("REname sucessfull");
		} else {
			System.out.println("Rename not able to perform");
		}
	}
}

