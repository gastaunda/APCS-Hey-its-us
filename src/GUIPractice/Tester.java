package GUIPractice;

import javax.swing.JFrame;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		GraphicExperiment s = new GraphicExperiment();
		f.add(s);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1280, 720);
	}
}
