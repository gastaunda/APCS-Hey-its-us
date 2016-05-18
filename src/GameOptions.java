import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.Action;


public class GameOptions {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOptions window = new GameOptions();
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
	public GameOptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.BLACK);
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.setAction(action);
		btnCredits.setBounds(159, 226, 103, 23);
		desktopPane.add(btnCredits);
		
		JButton btnHowToPlay = new JButton("How To Play");
		btnHowToPlay.setBounds(156, 26, 106, 23);
		desktopPane.add(btnHowToPlay);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Credits");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			//Display Credits page
		}
	}
}
