package aa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUp = new JLabel("Up");
		lblUp.setBounds(165, 38, 46, 14);
		frame.getContentPane().add(lblUp);

		JLabel lblDown = new JLabel("Down");
		lblDown.setBounds(165, 120, 46, 14);
		frame.getContentPane().add(lblDown);

		JLabel lblLeft = new JLabel("Left");
		lblLeft.setBounds(70, 84, 46, 14);
		frame.getContentPane().add(lblLeft);

		JLabel lblRight = new JLabel("Right");
		lblRight.setBounds(257, 84, 46, 14);
		frame.getContentPane().add(lblRight);
	}
}
