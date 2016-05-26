package aa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

public class DeathMessage {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeathMessage window = new DeathMessage();
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
	public DeathMessage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBackToLevel = new JButton("Back to Level Select");
		btnBackToLevel.setAction(action);
		btnBackToLevel.setBackground(new Color(0, 255, 255));
		frame.getContentPane().add(btnBackToLevel, BorderLayout.SOUTH);
		
		JLabel lblYouDedTry = new JLabel("YOU DEAD: TRY AGAIN");
		lblYouDedTry.setFont(new Font("Stencil", Font.PLAIN, 40));
		frame.getContentPane().add(lblYouDedTry, BorderLayout.CENTER);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Levels.main(null);
			close();
		}
	}
}