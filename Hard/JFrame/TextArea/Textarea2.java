package walkthrough;

import javax.swing.*;
import java.awt.event.*;

public class Textarea2 implements ActionListener {
	JLabel l1, l2;
	JTextArea area;
	JButton b;
	private ActionEvent e;

	Textarea2() {
		JFrame f = new JFrame("Character counter");
		l1 = new JLabel();
		l1.setBounds(50, 25, 100, 30);
		l2 = new JLabel();
		l2.setBounds(160, 25, 100, 30);
		area = new JTextArea();
		area.setBounds(20, 75, 250, 200);
		b = new JButton("Count Words");
		b.setBounds(100, 300, 120, 30);
		b.addActionListener(this);
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(b);
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);
		actionPerformed(e);
	}

	public void actionPerformed(ActionEvent e) {
		String text = area.getText();
		String words[] = text.split("\\s");
		l1.setText("Words: " + words.length);
		l2.setText("Characters: " + text.length());
	}

	public static void main(String[] args) {
		Textarea2 ob = new Textarea2();
	}
}

