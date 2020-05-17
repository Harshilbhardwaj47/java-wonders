package walkthrough;

import javax.swing.*;

public class Buttonphoto {
	public static void main(String[] args) {
		ButtonExample();
	}

	static void ButtonExample() {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton(new ImageIcon("C:\\Users\\hp\\Pictures\\Saved Pictures\\ss.jpg"));
		b.setBounds(100, 100, 500, 500);
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

