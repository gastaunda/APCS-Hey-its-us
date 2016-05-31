package aa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class DeathMenu {

	private JFrame frame;
	private final Action action = new SwingAction();
	private boolean running = true;

	/**
	 * Launch the application.
	 */
	public static void dMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				if (Game.m != null)
					Game.m.close();
				Game.m = new Music("assets/audio/music/Sometimes I make video game music.ogg");
				Game.m.loop();
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
		frame.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frame.setExtendedState(Game.winState);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnBackToLevel = new JButton("Back to Level Selection");
		btnBackToLevel.setAction(action);
		btnBackToLevel.setBackground(new Color(0, 255, 255));

		frame.getContentPane().add(btnBackToLevel);

		JLabel lblYouDedTry = new JLabel("YOU DEAD: TRY AGAIN");
		lblYouDedTry.setForeground(Color.RED);
		lblYouDedTry.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouDedTry.setFont(new Font("Stencil", Font.PLAIN, 40));
		frame.getContentPane().add(lblYouDedTry);

		JLabel label = new JLabel("");
		label.setBounds(0, 0, 3622, 3877);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon(DeathMenu.class.getResource("/assets/images/LH_95.jpg")));
		label.setLabelFor(frame);

		new Thread() {
			public void run() {
				while (running) {
					lblYouDedTry.setBounds(0, 0, frame.getWidth(), btnBackToLevel.getY());
					btnBackToLevel.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2,
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
			putValue(NAME, "Back to Level Selection");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			Game.m.close();
			Game.m = new Music();
			Game.m.loop();
			Levels.wMenu();
			close();
		}
	}
}
