package assets.images;

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

public class Credits {

	private JFrame frame;

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
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(Color.BLACK);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCredits = DefaultComponentFactory.getInstance().createTitle("Credits");
		lblCredits.setForeground(Color.GREEN);
		lblCredits.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblCredits = new GridBagConstraints();
		gbc_lblCredits.gridheight = 2;
		gbc_lblCredits.insets = new Insets(0, 0, 5, 5);
		gbc_lblCredits.gridx = 4;
		gbc_lblCredits.gridy = 1;
		frame.getContentPane().add(lblCredits, gbc_lblCredits);
		
		JLabel lblLocalForecast = DefaultComponentFactory.getInstance().createLabel("Local Forecast - Elevator Kevin MacLeod (incompetech.com)");
		lblLocalForecast.setForeground(new Color(255, 204, 153));
		GridBagConstraints gbc_lblLocalForecast = new GridBagConstraints();
		gbc_lblLocalForecast.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalForecast.gridx = 4;
		gbc_lblLocalForecast.gridy = 3;
		frame.getContentPane().add(lblLocalForecast, gbc_lblLocalForecast);
		
		JLabel lblLicensedUnderCreative_1 = DefaultComponentFactory.getInstance().createLabel("Licensed under Creative Commons: By Attribution 3.0 License");
		lblLicensedUnderCreative_1.setForeground(new Color(255, 204, 153));
		GridBagConstraints gbc_lblLicensedUnderCreative_1 = new GridBagConstraints();
		gbc_lblLicensedUnderCreative_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLicensedUnderCreative_1.gridx = 4;
		gbc_lblLicensedUnderCreative_1.gridy = 4;
		frame.getContentPane().add(lblLicensedUnderCreative_1, gbc_lblLicensedUnderCreative_1);
		
		JLabel lblHttpcreativecommonsorglicensesby = DefaultComponentFactory.getInstance().createLabel("http://creativecommons.org/licenses/by/3.0/");
		lblHttpcreativecommonsorglicensesby.setForeground(new Color(255, 204, 153));
		GridBagConstraints gbc_lblHttpcreativecommonsorglicensesby = new GridBagConstraints();
		gbc_lblHttpcreativecommonsorglicensesby.insets = new Insets(0, 0, 5, 5);
		gbc_lblHttpcreativecommonsorglicensesby.gridx = 4;
		gbc_lblHttpcreativecommonsorglicensesby.gridy = 5;
		frame.getContentPane().add(lblHttpcreativecommonsorglicensesby, gbc_lblHttpcreativecommonsorglicensesby);
		
		JLabel lblGarrisonAustanda = DefaultComponentFactory.getInstance().createLabel("Garrison Austanda");
		lblGarrisonAustanda.setForeground(new Color(255, 204, 153));
		GridBagConstraints gbc_lblGarrisonAustanda = new GridBagConstraints();
		gbc_lblGarrisonAustanda.insets = new Insets(0, 0, 5, 5);
		gbc_lblGarrisonAustanda.gridx = 4;
		gbc_lblGarrisonAustanda.gridy = 7;
		frame.getContentPane().add(lblGarrisonAustanda, gbc_lblGarrisonAustanda);
		
		JLabel lblAnubhavGarg = DefaultComponentFactory.getInstance().createLabel("Anubhav Garg");
		lblAnubhavGarg.setForeground(new Color(255, 204, 153));
		GridBagConstraints gbc_lblAnubhavGarg = new GridBagConstraints();
		gbc_lblAnubhavGarg.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnubhavGarg.gridx = 4;
		gbc_lblAnubhavGarg.gridy = 8;
		frame.getContentPane().add(lblAnubhavGarg, gbc_lblAnubhavGarg);
		
		JLabel lblWillLum = DefaultComponentFactory.getInstance().createLabel("Will Lum");
		lblWillLum.setForeground(new Color(255, 204, 153));
		GridBagConstraints gbc_lblWillLum = new GridBagConstraints();
		gbc_lblWillLum.insets = new Insets(0, 0, 5, 5);
		gbc_lblWillLum.gridx = 4;
		gbc_lblWillLum.gridy = 9;
		frame.getContentPane().add(lblWillLum, gbc_lblWillLum);
		
		JLabel lblJoshuaSamuel = DefaultComponentFactory.getInstance().createLabel("Joshua Samuel");
		lblJoshuaSamuel.setForeground(new Color(255, 204, 153));
		GridBagConstraints gbc_lblJoshuaSamuel = new GridBagConstraints();
		gbc_lblJoshuaSamuel.insets = new Insets(0, 0, 5, 5);
		gbc_lblJoshuaSamuel.gridx = 4;
		gbc_lblJoshuaSamuel.gridy = 10;
		frame.getContentPane().add(lblJoshuaSamuel, gbc_lblJoshuaSamuel);
		
		JButton btnBackToMain = new JButton("Back To Main Menu");
		GridBagConstraints gbc_btnBackToMain = new GridBagConstraints();
		gbc_btnBackToMain.insets = new Insets(0, 0, 5, 5);
		gbc_btnBackToMain.gridx = 4;
		gbc_btnBackToMain.gridy = 12;
		frame.getContentPane().add(btnBackToMain, gbc_btnBackToMain);
		
	}
	

}
