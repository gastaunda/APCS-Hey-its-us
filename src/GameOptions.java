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
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction();

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
		
		JButton btnHowToPlay = new JButton("How To Play");
		btnHowToPlay.setAction(action_2);
		btnHowToPlay.setBounds(144, 25, 145, 23);
		desktopPane.add(btnHowToPlay);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.setAction(action_3);
		btnCredits.setBounds(144, 180, 145, 23);
		desktopPane.add(btnCredits);
		
		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setAction(action_1);
		btnBackToMain.setBounds(144, 225, 145, 23);
		desktopPane.add(btnBackToMain);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Back to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			GameMenu.main(null);
			frame.dispose();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "How to Play");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			HowToPlay.main(null);
			frame.dispose();
		}
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Credits");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Credits.main(null);
			frame.dispose();
		}
	}
}
