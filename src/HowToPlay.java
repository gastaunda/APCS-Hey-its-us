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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblSorryWeDont = DefaultComponentFactory.getInstance().createLabel("Sorry, We don't have anything here at the moment");
		lblSorryWeDont.setForeground(Color.RED);
		lblSorryWeDont.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblSorryWeDont = new GridBagConstraints();
		gbc_lblSorryWeDont.insets = new Insets(0, 0, 5, 5);
		gbc_lblSorryWeDont.gridx = 4;
		gbc_lblSorryWeDont.gridy = 4;
		frame.getContentPane().add(lblSorryWeDont, gbc_lblSorryWeDont);
		
		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setAction(action);
		GridBagConstraints gbc_btnBackToMain = new GridBagConstraints();
		gbc_btnBackToMain.insets = new Insets(0, 0, 0, 5);
		gbc_btnBackToMain.gridx = 4;
		gbc_btnBackToMain.gridy = 7;
		frame.getContentPane().add(btnBackToMain, gbc_btnBackToMain);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			GameMenu.main(null);
			frame.dispose();
		}
	}
}
