package walkthrough;

import javax.swing.*;

public class Checkbox1 {

	Checkbox1() {
		JFrame f = new JFrame("Checkbox1");
		JCheckBox checkBox1 = new JCheckBox("Unreal Engine");
		checkBox1.setBounds(100, 100, 80, 80);
		JCheckBox checkBox2 = new JCheckBox("Java");
		checkBox2.setBounds(100, 150, 80, 80);
		f.add(checkBox1);
		f.add(checkBox2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Checkbox1();
	}
}

