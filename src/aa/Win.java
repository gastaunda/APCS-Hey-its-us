package aa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class Win {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Win window = new Win();
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
	public Win() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBackToLevel = new JButton("Back to Level Select");
		frame.getContentPane().add(btnBackToLevel, BorderLayout.SOUTH);
		
		JLabel lblYouWin = DefaultComponentFactory.getInstance().createLabel("You Win :)");
		lblYouWin.setFont(new Font("Stencil", Font.PLAIN, 72));
		lblYouWin.setForeground(Color.RED);
		frame.getContentPane().add(lblYouWin, BorderLayout.CENTER);
	}

}
