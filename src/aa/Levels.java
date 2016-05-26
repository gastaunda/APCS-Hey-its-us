package aa;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Insets;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import GUIPractice.Tester;
import javax.swing.SwingConstants;

public class Levels {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private boolean running = true;

	private static final byte btnSize = 48;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Levels window = new Levels();
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
	public Levels() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 0, 51));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frame.setExtendedState(Game.winState);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLevelSelect = DefaultComponentFactory.getInstance().createTitle("Level Select");
		lblLevelSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelSelect.setForeground(new Color(255, 0, 51));
		lblLevelSelect.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblLevelSelect);

		JButton button = new JButton("1");
		button.setAction(action_1);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("2");
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("3");
		frame.getContentPane().add(button_2);

		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setAction(action);
		frame.getContentPane().add(btnBackToMain);
		new Thread() {
			public void run() {
				while (running) {
					lblLevelSelect.setBounds(0, GameMenu.btnSpace, frame.getWidth(), 20);
					button.setBounds(GameMenu.btnSpace,
							lblLevelSelect.getY() + lblLevelSelect.getHeight() + GameMenu.btnSpace, btnSize, btnSize);
					button_1.setBounds(button.getX() + GameMenu.btnSpace + btnSize,
							lblLevelSelect.getY() + lblLevelSelect.getHeight() + GameMenu.btnSpace, btnSize, btnSize);
					button_2.setBounds(button_1.getX() + GameMenu.btnSpace + btnSize,
							lblLevelSelect.getY() + lblLevelSelect.getHeight() + GameMenu.btnSpace, btnSize, btnSize);
					btnBackToMain.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2,
							frame.getHeight() - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
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

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Back to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			GameMenu.main(null);
			close();
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			Tester.main(null);
			close();
		}
	}
}
