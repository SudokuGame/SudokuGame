import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;


public class MessengerUI extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public MessengerUI() {
		setLayout(null);
		
		JLabel lblTo = new JLabel("To: ");
		lblTo.setBounds(10, 89, 46, 14);
		add(lblTo);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textField.setBounds(58, 86, 129, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject :");
		lblSubject.setBounds(10, 117, 46, 14);
		add(lblSubject);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textField_1.setBounds(58, 114, 129, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMessage = new JLabel("Message: ");
		lblMessage.setBounds(10, 161, 64, 14);
		add(lblMessage);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setBounds(58, 161, 339, 103);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("Back");
		button.setBounds(0, 0, 89, 58);
		add(button);
		
		JLabel lblNewLabel = new JLabel("Messenger");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 41));
		lblNewLabel.setBounds(162, 0, 220, 58);
		add(lblNewLabel);

	}
}
