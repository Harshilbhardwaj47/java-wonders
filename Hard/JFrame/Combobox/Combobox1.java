package walkthrough;

import javax.swing.*;

public class Combobox1 {
	JFrame f;

	Combobox1() {
		f = new JFrame("ComboBox Example");
		String country[] = { "India", "Australia", "U.S.A", "England", "Newzealand" };
		JComboBox cb = new JComboBox(country);
		cb.setBounds(50, 50, 90, 20);
		f.add(cb);
		f.setLayout(null);
		f.setSize(400, 500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Combobox1();
	}
}

