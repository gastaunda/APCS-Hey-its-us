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

public class Levels {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

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
		frame.setSize(GameMenu.winWidth, GameMenu.winHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLevelSelect = DefaultComponentFactory.getInstance().createTitle("Level Select");
		lblLevelSelect.setBounds((GameMenu.winWidth - 57)/2, 20, 57, 14);
		lblLevelSelect.setForeground(new Color(255, 0, 51));
		lblLevelSelect.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblLevelSelect);
		
		JButton button = new JButton("1");
		button.setBounds(20, 60, btnSize, btnSize);
		button.setAction(action_1);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(195, 60, btnSize, btnSize);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(370, 60, btnSize, btnSize);
		frame.getContentPane().add(button_2);
		
		JButton btnBackToMain = new JButton("Back to Main Meu");
		btnBackToMain.setBounds((GameMenu.winWidth - GameMenu.btnWidth) / 2, GameMenu.winHeight - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
		btnBackToMain.setAction(action);
		frame.getContentPane().add(btnBackToMain);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Back to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			GameMenu.main(null);
			frame.dispose();
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Tester.main(null);
			frame.dispose();
		}
	}
}
