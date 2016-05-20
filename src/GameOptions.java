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

	private JFrame frmOptions;
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
					window.frmOptions.setVisible(true);
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
		frmOptions = new JFrame();
		frmOptions.setTitle("Options");
		frmOptions.setSize(1280, 720);
		frmOptions.getContentPane().setBackground(Color.BLACK);
		frmOptions.getContentPane().setForeground(Color.BLACK);
		frmOptions.getContentPane().setLayout(null);
		
		JButton btnHowToPlay = new JButton("How To Play");
		btnHowToPlay.setBounds((1280 - GameMenu.btnWidth) / 2, 30, GameMenu.btnWidth, GameMenu.btnHeight);
		frmOptions.getContentPane().add(btnHowToPlay);
		btnHowToPlay.setAction(action_2);
		
		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setBounds((1280 - GameMenu.btnWidth) / 2, 720 - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
		frmOptions.getContentPane().add(btnBackToMain);
		btnBackToMain.setAction(action_1);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.setBounds((1280 - GameMenu.btnWidth) / 2, btnBackToMain.getY() - GameMenu.btnHeight - GameMenu.btnSpace, GameMenu.btnWidth, GameMenu.btnHeight);
		frmOptions.getContentPane().add(btnCredits);
		btnCredits.setAction(action_3);
		frmOptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Back to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			GameMenu.main(null);
			frmOptions.dispose();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "How to Play");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			HowToPlay.main(null);
			frmOptions.dispose();
		}
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Credits");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Credits.main(null);
			frmOptions.dispose();
		}
	}
}
