import java.awt.BorderLayout;


public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 467);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Spectator Mode");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(331, 90, 217, 42);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Single Player");
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		button.setBounds(10, 90, 217, 42);
		contentPane.add(button);
		
		JButton btnChallengeMode = new JButton("Challenge Mode");
		btnChallengeMode.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnChallengeMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChallengeMode.setBounds(10, 143, 217, 42);
		contentPane.add(btnChallengeMode);
		
		JButton btnMessenger = new JButton("Messenger");
		btnMessenger.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnMessenger.setBounds(331, 143, 217, 42);
		contentPane.add(btnMessenger);
		
		JButton btnNewButton_1 = new JButton("Credits");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(331, 254, 217, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHelp.setBounds(331, 288, 217, 23);
		contentPane.add(btnHelp);
		
		JButton btnCredits = new JButton("Quit Game");
		btnCredits.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnCredits.setBounds(128, 335, 283, 42);
		contentPane.add(btnCredits);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSettings.setBounds(10, 254, 217, 23);
		contentPane.add(btnSettings);
		
		JButton button_3 = new JButton("High Scores");
		button_3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(10, 288, 217, 23);
		contentPane.add(button_3);
		
		JLabel lblNewLabel = new JLabel("Sudoku Game");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 41));
		lblNewLabel.setBounds(153, 21, 272, 56);
		contentPane.add(lblNewLabel);
	}
}
