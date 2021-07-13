package _01_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyBluesRunner {
	public static void main(String[] args) {
		SmileyBlues smileyRunner = new SmileyBlues();
		smileyRunner.start();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		Smiley smiley = new Smiley();
		Smiley smile = new Smiley();
		Smiley smil = new Smiley();
		panel.add(smiley);
		panel.add(smile);
		panel.add(smil);
		frame.pack();
	}
}
