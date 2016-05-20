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

public class HowToPlay {

	private JFrame frame;
	private final Action action = new SwingAction();

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
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSorryWeDont = DefaultComponentFactory.getInstance()
				.createLabel("Sorry, We don't have anything here at the moment");
		lblSorryWeDont.setFont(new Font("Papyrus", Font.PLAIN, 50));
		lblSorryWeDont.setBounds(120, 290, 1078, 80);
		lblSorryWeDont.setForeground(Color.RED);
		lblSorryWeDont.setBackground(Color.BLACK);
		frame.getContentPane().add(lblSorryWeDont);

		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setBounds((1280 - GameMenu.btnWidth) / 2, 720 - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
		btnBackToMain.setAction(action);
		frame.getContentPane().add(btnBackToMain);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Back to Game Options");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			GameOptions.main(null);
			frame.dispose();
		}
	}
}
