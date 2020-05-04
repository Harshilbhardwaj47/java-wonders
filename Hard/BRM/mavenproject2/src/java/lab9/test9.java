package lab9;

import java.net.URL;
import java.net.URLConnection;

public class test9 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://learn.upes.ac.in/webapps/portal/execute/tabs/tabAction?tab_tab_group_id=_141_1");
			URLConnection con = url.openConnection();
			con.connect();
			System.out.println("you are connected to internet");
		} catch (Exception e) {
			System.out.println("no internet");
		}
	}

}
