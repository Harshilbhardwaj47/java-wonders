package walkthrough;

import javax.swing.*;

public class Textarea1 {

	Textarea1() {
		JFrame f = new JFrame("note pad");
		JTextArea area = new JTextArea();
		area.setBounds(10, 30, 200, 200);
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Textarea1 ob = new Textarea1();
	}
}

