
public class shut {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			Process proc = run.exec("shutdown -s -t" + 5);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

