import javax.swing.JPanel;


public class GameUI extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GameUI() {
		setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setIcon(new ImageIcon(GameUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setBounds(0, 0, 89, 58);
		add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(GameUI.class.getResource("/com/sun/webpane/sg/prism/resources/mediaPause.png")));
		button_1.setBounds(0, 69, 89, 58);
		add(button_1);
		
		JButton btnHint = new JButton("Hint");
		btnHint.setBounds(0, 151, 89, 23);
		add(btnHint);
		
		JButton btnRedo = new JButton("Redo");
		btnRedo.setBounds(0, 185, 89, 23);
		add(btnRedo);
		
		JPanel panel = new JPanel();
		panel.setBounds(158, 25, 342, 281);
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		table = new JTable();
		panel.add(table);

	}
}
