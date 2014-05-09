import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;


public class UserSettingsUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSettingsUI frame = new UserSettingsUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserSettingsUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChangeSettings = new JLabel("Change Settings");
		lblChangeSettings.setFont(new Font("Comic Sans MS", Font.PLAIN, 41));
		lblChangeSettings.setBounds(91, 11, 315, 65);
		contentPane.add(lblChangeSettings);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(UserSettingsUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		btnNewButton_1.setBounds(10, 22, 71, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblMusics = new JLabel("Musics");
		lblMusics.setForeground(Color.BLACK);
		lblMusics.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblMusics.setBounds(101, 87, 123, 22);
		contentPane.add(lblMusics);
		
		JLabel lblNewLabel = new JLabel("Theme");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel.setBounds(97, 129, 110, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Languages");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(101, 168, 83, 22);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(200, 87, 129, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(200, 129, 129, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(200, 168, 129, 22);
		contentPane.add(comboBox_2);
		
		JCheckBox chckbxOnOff = new JCheckBox("on / off");
		chckbxOnOff.setBounds(335, 83, 97, 23);
		contentPane.add(chckbxOnOff);
	}
}
