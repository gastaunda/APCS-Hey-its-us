package aa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class GameMenu {

	private JFrame frmMainMenu;
	private boolean running = true;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();

	public static final short btnWidth = 400;
	public static final byte btnHeight = 50;
	public static final short btnSpace = 80;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMenu window = new GameMenu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frmMainMenu.setExtendedState(Game.winState);
		frmMainMenu.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Levels");
		frmMainMenu.getContentPane().add(btnNewButton);
		btnNewButton.setAction(action_2);
		btnNewButton.setFont(UIManager.getFont("Button.font"));

		JButton btnLevelPacks = new JButton("Level Packs");
		frmMainMenu.getContentPane().add(btnLevelPacks);
		btnLevelPacks.setAction(action_3);
		btnLevelPacks.setFont(UIManager.getFont("Button.font"));

		JButton btnOptions = new JButton("Options");
		frmMainMenu.getContentPane().add(btnOptions);
		btnOptions.setAction(action_1);
		btnOptions.setFont(UIManager.getFont("Button.font"));

		JButton btnExit = new JButton("Exit");
		frmMainMenu.getContentPane().add(btnExit);
		btnExit.setAction(action);
		btnExit.setFont(UIManager.getFont("Button.font"));

		JLabel label = new JLabel("");
		label.setBounds(0, 0, 3622, 3877);
		frmMainMenu.getContentPane().add(label);
		label.setIcon(new ImageIcon(GameMenu.class.getResource("/assets/images/LH_95.jpg")));
		label.setLabelFor(frmMainMenu);
		new Thread() {
			public void run() {
				while (running) {
					btnNewButton.setBounds((frmMainMenu.getWidth() - btnWidth) / 2, 30, btnWidth, btnHeight);
					btnLevelPacks.setBounds((frmMainMenu.getWidth() - btnWidth) / 2,
							btnHeight + btnNewButton.getY() + btnSpace, btnWidth, btnHeight);
					btnOptions.setBounds((frmMainMenu.getWidth() - btnWidth) / 2,
							btnHeight + btnLevelPacks.getY() + btnSpace, btnWidth, btnHeight);
					btnExit.setBounds((frmMainMenu.getWidth() - btnWidth) / 2, Game.winHeight - 100 - btnHeight,
							btnWidth, btnHeight);
				}
			}
		}.start();
	}

	private void close() {
		running = false;
		Game.winState = frmMainMenu.getExtendedState();
		frmMainMenu.setExtendedState(JFrame.NORMAL);
		Game.winWidth = frmMainMenu.getWidth();
		Game.winHeight = frmMainMenu.getHeight();
		Game.winX = frmMainMenu.getX();
		Game.winY = frmMainMenu.getY();
		frmMainMenu.dispose();
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Exit");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Options");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			GameOptions.main(null);
			close();
		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Levels");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			Levels.main(null);
			close();
		}
	}

	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Level Packs");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			LevelPacks.main(null);
			close();
		}
	}
}
