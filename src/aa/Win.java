package aa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import oggVorbis.Music;
import javax.swing.SwingConstants;

public class Win {

	private JFrame frame;
	private final Action action = new SwingAction();
	private boolean running = true;

	/**
	 * Launch the application.
	 */
	public static void winMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				if (Game.m != null)
					Game.m.close();
				Game.m = new Music("assets/audio/music/Sometimes I make video game music.ogg");
				Game.m.loop();
				try {
					Win window = new Win();
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
	public Win() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frame.setExtendedState(Game.winState);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBackToLevel = new JButton("Back to Level Select");
		btnBackToLevel.setAction(action);
		frame.getContentPane().add(btnBackToLevel);
		
		JLabel lblYouWin = new JLabel("You Win :)");
		lblYouWin.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouWin.setFont(new Font("Stencil", Font.PLAIN, 72));
		lblYouWin.setForeground(Color.RED);
		frame.getContentPane().add(lblYouWin);

		new Thread() {
			public void run() {
				while (running) {
					lblYouWin.setBounds(0, 0, frame.getWidth(), btnBackToLevel.getY());
					btnBackToLevel.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2,
							frame.getHeight() - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
				}
			}
		}.start();
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Back to Level Select");
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
}
