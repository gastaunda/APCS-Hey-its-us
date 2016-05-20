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


public class Levels {

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblLevelSelect = DefaultComponentFactory.getInstance().createTitle("Level Select");
		lblLevelSelect.setForeground(new Color(255, 0, 51));
		lblLevelSelect.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_lblLevelSelect = new GridBagConstraints();
		gbc_lblLevelSelect.insets = new Insets(0, 0, 5, 5);
		gbc_lblLevelSelect.gridheight = 2;
		gbc_lblLevelSelect.gridwidth = 5;
		gbc_lblLevelSelect.gridx = 5;
		gbc_lblLevelSelect.gridy = 0;
		frame.getContentPane().add(lblLevelSelect, gbc_lblLevelSelect);
		
		JButton button = new JButton("1");
		button.setAction(action_1);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 2;
		frame.getContentPane().add(button, gbc_button);
		
		JButton button_1 = new JButton("2");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 7;
		gbc_button_1.gridy = 2;
		frame.getContentPane().add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("3");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 11;
		gbc_button_2.gridy = 2;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		JButton btnBackToMain = new JButton("Back to Main Meu");
		btnBackToMain.setAction(action);
		GridBagConstraints gbc_btnBackToMain = new GridBagConstraints();
		gbc_btnBackToMain.insets = new Insets(0, 0, 0, 5);
		gbc_btnBackToMain.gridx = 7;
		gbc_btnBackToMain.gridy = 7;
		frame.getContentPane().add(btnBackToMain, gbc_btnBackToMain);
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
			Level.main(null);
			frame.dispose();
		}
	}
}
