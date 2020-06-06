package walkthrough;

import javax.swing.*;
import java.awt.event.*;

public class Radiobutton2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton rb1, rb2;
	JButton b;

	Radiobutton2() {
		rb1 = new JRadioButton("Anime");
		rb1.setBounds(100, 50, 100, 30);
		rb2 = new JRadioButton("Manga");
		rb2.setBounds(100, 100, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b = new JButton("click");
		b.setBounds(100, 150, 80, 30);
		b.addActionListener(this);
		add(rb1);
		add(rb2);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "Welcome to the Anime fam.");
		}
		if (rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "Manga rocks bro");
		}
	}

	public static void main(String[] args) {
		new Radiobutton2();
	}
}

