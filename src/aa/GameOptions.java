package aa;

import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.Action;
import javax.swing.ImageIcon;

public class GameOptions {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction();
	private boolean running = true;

	/**
	 * Launch the application.
	 */
	public static void gOpt() {
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
		frame.setTitle(Game.name);
		frame.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frame.setExtendedState(Game.winState);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setLayout(null);

		JButton btnHowToPlay = new JButton("How To Play");
		frame.getContentPane().add(btnHowToPlay);
		btnHowToPlay.setAction(action_2);

		JButton btnBackToMain = new JButton("Back to Main Menu");
		frame.getContentPane().add(btnBackToMain);
		btnBackToMain.setAction(action_1);

		JButton btnCredits = new JButton("Credits");
		frame.getContentPane().add(btnCredits);
		btnCredits.setAction(action_3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 3622, 3877);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon(GameMenu.class.getResource("/assets/images/LH_95.jpg")));
		label.setLabelFor(frame);
		
		new Thread() {
			public void run() {
				while (running) {
					btnHowToPlay.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2, 30, GameMenu.btnWidth,
							GameMenu.btnHeight);
					btnBackToMain.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2,
							frame.getHeight() - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
					btnCredits.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2,
							btnBackToMain.getY() - GameMenu.btnHeight - GameMenu.btnSpace, GameMenu.btnWidth,
							GameMenu.btnHeight);
				}
			}
		}.start();
	}

	private void close() {
		running = false;
		Game.winState = frame.getExtendedState();
		frame.setExtendedState(JFrame.NORMAL);
		Game.winWidth = frame.getWidth();
		Game.winHeight = frame.getHeight();
		Game.winX = frame.getX();
		Game.winY = frame.getY();
		frame.dispose();
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Back to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			GameMenu.gaMenu();
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
			Credits.cred();
			frame.dispose();
		}
	}
}
