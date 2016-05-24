import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class Restart {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restart window = new Restart();
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
	public Restart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		
		JButton btnRestart = new JButton("Restart");
		frame.getContentPane().add(btnRestart, BorderLayout.SOUTH);
		
		JLabel lblYouDied = new JLabel("You Died!!!");
		lblYouDied.setFont(new Font("Papyrus", Font.PLAIN, 85));
		lblYouDied.setForeground(Color.RED);
		frame.getContentPane().add(lblYouDied, BorderLayout.NORTH);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
