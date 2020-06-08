package walkthrough;

import javax.swing.*;

public class JTable1 {
	JFrame f;

	JTable1() {
		f = new JFrame();
		String data[][] = { { "101", "Harshil", "670000" }, { "102", "Hariwansh", "780000" }, { "101", "HD", "700000" } };
		String column[] = { "ID", "NAME", "SALARY" };
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new JTable1();
	}
}

