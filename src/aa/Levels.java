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
import javax.swing.ImageIcon;

import GUIPractice.Tester;
import javax.swing.SwingConstants;

public class Levels {

	private JFrame frame;
	private final Action action_1 = new SwingAction_1();
	private boolean running = true;

	private static final byte btnSize = 48;
	private final Action bk = new SwingAction();
	private final Action action = new SwingAction_2();
	private final Action action_2 = new SwingAction_3();
	private final Action action_3 = new SwingAction_4();
	private final Action action_4 = new SwingAction_5();
	private final Action action_5 = new SwingAction_6();
	private final Action action_6 = new SwingAction_7();
	private final Action action_7 = new SwingAction_8();
	private final Action action_8 = new SwingAction_9();

	/**
	 * Launch the application.
	 */
	public static void wMenu() {
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
		frame.setTitle(Game.name);
		frame.getContentPane().setForeground(new Color(255, 0, 51));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frame.setExtendedState(Game.winState);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLevelSelect = DefaultComponentFactory.getInstance().createTitle("Level Select");
		lblLevelSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelSelect.setBounds(0, GameMenu.btnSpace, frame.getWidth(), 20);
		lblLevelSelect.setForeground(new Color(255, 0, 51));
		lblLevelSelect.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblLevelSelect);

		JButton button = new JButton("1");
		button.setBounds(GameMenu.btnSpace, lblLevelSelect.getY() + lblLevelSelect.getHeight() + GameMenu.btnSpace,
				btnSize, btnSize);
		button.setAction(action_1);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("2");
		button_1.setAction(action);
		button_1.setBounds(button.getX() + GameMenu.btnSpace + btnSize, button.getY(), btnSize, btnSize);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("3");
		button_2.setAction(action_2);
		button_2.setBounds(button_1.getX() + GameMenu.btnSpace + btnSize, button.getY(), btnSize, btnSize);
		frame.getContentPane().add(button_2);

		JButton btnRandom = new JButton("Random");
		btnRandom.setAction(action_3);
		btnRandom.setBounds(513, 304, 245, 48);
		frame.getContentPane().add(btnRandom);
		
		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setAction(bk);
		frame.getContentPane().add(btnBackToMain);
		
		JButton button_3 = new JButton("4");
		button_3.setAction(action_4);
		button_3.setBounds(444, 180, 48, 48);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setAction(action_5);
		button_4.setBounds(580, 180, 48, 48);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setAction(action_6);
		button_5.setBounds(727, 180, 48, 48);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setAction(action_7);
		button_6.setBounds(909, 180, 48, 48);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setAction(action_8);
		button_7.setBounds(1142, 180, 48, 48);
		frame.getContentPane().add(button_7);

		JLabel lblRandom = new JLabel("");
		lblRandom.setBounds(0, 0, 3622, 3877);
		frame.getContentPane().add(lblRandom);
		lblRandom.setIcon(new ImageIcon(Levels.class.getResource("/assets/images/LH_95.jpg")));
		lblRandom.setLabelFor(frame);

		new Thread() {
			public void run() {
				while (running) {
					lblLevelSelect.setBounds(0, GameMenu.btnSpace, frame.getWidth(), 20);
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
			GameMenu.gaMenu();
			close();
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "1");
			putValue(SHORT_DESCRIPTION, "Easy level");
		}

		public void actionPerformed(ActionEvent e) {
			Tester.init(1);
			close();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "2");
			putValue(SHORT_DESCRIPTION, "Very difficult level");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(2);
			close();
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "3");
			putValue(SHORT_DESCRIPTION, "Patience level");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(3);
			close();
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Random");
			putValue(SHORT_DESCRIPTION, "Randomly generated level");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(4);
			close();
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "4");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(5);
			close();
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "5");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(6);
			close();
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "6");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(7);
			close();
		}
	}
	private class SwingAction_8 extends AbstractAction {
		public SwingAction_8() {
			putValue(NAME, "7");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(8);
			close();
		}
	}
	private class SwingAction_9 extends AbstractAction {
		public SwingAction_9() {
			putValue(NAME, "8");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.init(9);
			close();
		}
	}
}
