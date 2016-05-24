import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class DeathMenu {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeathMenu window = new DeathMenu();
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
	public DeathMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(GameMenu.winWidth, GameMenu.winHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnRestart = new JButton("Restart");
		btnRestart.setAction(action_1);
		btnRestart.setBounds((GameMenu.winWidth - GameMenu.btnWidth * 2 - GameMenu.btnSpace) / 2,
				GameMenu.winHeight - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
		frame.getContentPane().add(btnRestart);

		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setBounds(btnRestart.getX() + GameMenu.btnWidth + GameMenu.btnSpace, btnRestart.getY(),
				GameMenu.btnWidth, GameMenu.btnHeight);
		frame.getContentPane().add(btnBackToMain);
		btnBackToMain.setAction(action);

		JLabel lblYouDied = new JLabel("You Died!!!");
		lblYouDied.setBounds(0, 0, 434, 135);
		lblYouDied.setFont(new Font("Papyrus", Font.PLAIN, 85));
		lblYouDied.setForeground(Color.RED);
		frame.getContentPane().add(lblYouDied);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Back to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			GameMenu.main(null);
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Restart");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			GUIPractice.Tester.main(null);
		}
	}
}
