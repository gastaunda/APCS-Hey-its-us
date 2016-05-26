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
import javax.swing.Action;
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
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(Game.name);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		frame.setExtendedState(Game.winState);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSorryWeDont = DefaultComponentFactory.getInstance()
				.createLabel("Sorry, We don't have anything here at the moment");
		lblSorryWeDont.setHorizontalAlignment(SwingConstants.CENTER);
		lblSorryWeDont.setFont(new Font("Papyrus", Font.PLAIN, 50));
		lblSorryWeDont.setForeground(Color.RED);
		lblSorryWeDont.setBackground(Color.BLACK);
		frame.getContentPane().add(lblSorryWeDont);

		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setAction(action);
		frame.getContentPane().add(btnBackToMain);

		new Thread() {
			public void run() {
				while (running) {
					btnBackToMain.setBounds((frame.getWidth() - GameMenu.btnWidth) / 2,
							frame.getHeight() - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
					lblSorryWeDont.setBounds(0, 290, frame.getWidth(), 80);
				}
			};
		}.start();
	}

	private void close() {
		running  = false;
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
			GameOptions.main(null);
			close();
		}
	}
}
