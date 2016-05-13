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

public class GameMenu {

	private JFrame frmMainMenu;
	private final Action action = new SwingAction();

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
		frmMainMenu.getContentPane().setForeground(Color.BLACK);
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.setBounds(100, 100, 450, 300);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JDesktopPane desktopPane = new JDesktopPane();
		frmMainMenu.getContentPane().add(desktopPane, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("Levels");
		btnNewButton.setFont(UIManager.getFont("Button.font"));
		btnNewButton.setBounds(172, 10, 90, 23);
		desktopPane.add(btnNewButton);

		JButton btnLevelPacks = new JButton("Level Packs");
		btnLevelPacks.setFont(UIManager.getFont("Button.font"));
		btnLevelPacks.setBounds(172, 44, 90, 23);
		desktopPane.add(btnLevelPacks);

		JButton btnOptions = new JButton("Options");
		btnOptions.setFont(UIManager.getFont("Button.font"));
		btnOptions.setBounds(172, 78, 90, 23);
		desktopPane.add(btnOptions);

		JButton btnExit = new JButton("Exit");
		btnExit.setAction(action);
		btnExit.setFont(UIManager.getFont("Button.font"));
		btnExit.setBounds(172, 227, 90, 23);
		desktopPane.add(btnExit);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GameMenu.class.getResource("/assets/images/LH_95.jpg")));
		label.setLabelFor(frmMainMenu);
		label.setBounds(0, 0, 442, 273);
		label.setBounds(0, 0, 434, 261);
		desktopPane.add(label);
		label.setIcon(new ImageIcon(GameMenu.class.getResource("/assets/images/LH_95.jpg")));
		label.setLabelFor(frmMainMenu);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Exit");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
