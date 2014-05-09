import javax.swing.JPanel;


public class SinglePlayerUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public SinglePlayerUI() {
		setLayout(null);
		
		JButton backButton = new JButton("Back");
		backButton.setBounds(0, 0, 89, 58);
		add(backButton);
		
		JLabel lblNewLabel = new JLabel("Single Player");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblNewLabel.setBounds(188, -29, 199, 120);
		add(lblNewLabel);
		
		JLabel lblSelectDifficulty = new JLabel("Select Difficulty");
		lblSelectDifficulty.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSelectDifficulty.setBounds(117, 65, 283, 96);
		add(lblSelectDifficulty);
		
		JButton btnNewButton = new JButton("EASY");
		btnNewButton.setBounds(188, 172, 124, 33);
		add(btnNewButton);
		
		JButton btnMedum = new JButton("MEDIUM");
		btnMedum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMedum.setBounds(188, 216, 124, 33);
		add(btnMedum);
		
		JButton btnHard = new JButton("HARD");
		btnHard.setBounds(188, 260, 124, 33);
		add(btnHard);

	}
}
