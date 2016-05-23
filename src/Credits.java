

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Credits {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits window = new Credits();
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
	public Credits() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(GameMenu.winWidth, GameMenu.winHeight);
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCredits = DefaultComponentFactory.getInstance().createTitle("Credits");
		lblCredits.setBounds(198, 16, 34, 14);
		lblCredits.setForeground(Color.GREEN);
		lblCredits.setBackground(Color.BLACK);
		frame.getContentPane().add(lblCredits);
		
		JLabel lblLocalForecast = DefaultComponentFactory.getInstance().createLabel("Local Forecast - Elevator Kevin MacLeod (incompetech.com)");
		lblLocalForecast.setBounds(71, 56, 287, 14);
		lblLocalForecast.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblLocalForecast);
		
		JLabel lblLicensedUnderCreative_1 = DefaultComponentFactory.getInstance().createLabel("Licensed under Creative Commons: By Attribution 3.0 License");
		lblLicensedUnderCreative_1.setBounds(67, 75, 295, 14);
		lblLicensedUnderCreative_1.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblLicensedUnderCreative_1);
		
		JLabel lblHttpcreativecommonsorglicensesby = DefaultComponentFactory.getInstance().createLabel("http://creativecommons.org/licenses/by/3.0/");
		lblHttpcreativecommonsorglicensesby.setBounds(107, 94, 216, 14);
		lblHttpcreativecommonsorglicensesby.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblHttpcreativecommonsorglicensesby);
		
		JLabel lblEasyoggByCoke = DefaultComponentFactory.getInstance().createLabel("easyogg by Coke and Code/Kevin Glass Which uses jorbis under the");
		lblEasyoggByCoke.setBounds(52, 113, 326, 14);
		lblEasyoggByCoke.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblEasyoggByCoke);
		
		JLabel lblGnuLesserGeneral = DefaultComponentFactory.getInstance().createLabel(" GNU LESSER GENERAL PUBLIC LICENSE v2.1 (refer to jorbis COPYING.LIB)");
		lblGnuLesserGeneral.setBounds(34, 132, 362, 14);
		lblGnuLesserGeneral.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblGnuLesserGeneral);
		
		JLabel lblAnubhavGarg = DefaultComponentFactory.getInstance().createLabel("Group Members:");
		lblAnubhavGarg.setBounds(175, 181, 79, 14);
		lblAnubhavGarg.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblAnubhavGarg);
		
		JLabel lblWillLum = DefaultComponentFactory.getInstance().createLabel("Garrison Austanda / Anubhav Garg");
		lblWillLum.setBounds(131, 200, 168, 14);
		lblWillLum.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblWillLum);
		
		JLabel lblJoshuaSamuel = DefaultComponentFactory.getInstance().createLabel(" Will Lum  / Joshua Samuel");
		lblJoshuaSamuel.setBounds(152, 219, 125, 14);
		lblJoshuaSamuel.setForeground(new Color(255, 204, 153));
		frame.getContentPane().add(lblJoshuaSamuel);
		
		JButton btnBackToMain = new JButton("Back To Game Options");
		btnBackToMain.setBounds((GameMenu.winWidth - GameMenu.btnWidth) / 2, GameMenu.winHeight - 100 - GameMenu.btnHeight, GameMenu.btnWidth, GameMenu.btnHeight);
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
