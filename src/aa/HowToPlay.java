package aa;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.ImageIcon;

import java.awt.Font;
import javax.swing.SwingConstants;

public class HowToPlay {

	private JFrame frame;
	private final Action action = new SwingAction();
	private boolean running = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowToPlay window = new HowToPlay();
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
	public HowToPlay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(Game.name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frame.setExtendedState(Game.winState);
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);

		JButton btnBackToMain = new JButton("Back To Game Options");
		btnBackToMain.setAction(action);
		frame.getContentPane().add(btnBackToMain);

		LinkedList<JLabel> text = new LinkedList<JLabel>();
		try {
			int val = 0;
			final int h = 14;
			Scanner scanner = new Scanner(
					new File(getClass().getClassLoader().getResource("assets/text/howToPlay.txt").getFile()));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.charAt(0) != '#') {
					JLabel lblTemp = new JLabel(line.substring(1));
					if (line.charAt(0) == 'c')
						lblTemp.setHorizontalAlignment(SwingConstants.CENTER);
					else if (line.charAt(0) == 'r')
						lblTemp.setHorizontalAlignment(SwingConstants.RIGHT);
					lblTemp.setForeground(Color.YELLOW);
					lblTemp.setBounds(0, val, frame.getWidth(), h);
					val += h;
					frame.getContentPane().add(lblTemp);
					text.add(lblTemp);
				}
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 3622, 3877);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon(GameMenu.class.getResource("/assets/images/LH_95.jpg")));
		label.setLabelFor(frame);
		
		new Thread() {
			public void run() {
				while (running) {
					btnBackToMain.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2,
							frame.getHeight() - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
					for (JLabel lblTemp : text)
						lblTemp.setBounds(lblTemp.getX(), lblTemp.getY(), frame.getWidth(), lblTemp.getHeight());
				}
			};
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
			putValue(NAME, "Back to Game Options");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			GameOptions.gOpt();
			close();
		}
	}
}
