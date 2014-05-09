import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;


public class HelpUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public HelpUI() {
		setBackground(Color.ORANGE);
		setForeground(Color.WHITE);
		setLayout(null);
		
		JLabel lblHowToPlay = new JLabel("HOW TO PLAY");
		lblHowToPlay.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 41));
		lblHowToPlay.setBounds(119, 0, 321, 58);
		add(lblHowToPlay);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(HelpUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(0, 0, 89, 58);
		add(btnNewButton);
		
		JTextPane txtpnSudokuIsA = new JTextPane();
		txtpnSudokuIsA.setBackground(Color.ORANGE);
		txtpnSudokuIsA.setText("Sudoku is a logica-base, combinatorial number placement puzzle. The objective is to fill a 9x9 grid with digits so that each column, each row, and each of the nine 3x3 sub-grids that compose the grid contains all of the digits from 1 to 9. The puzzle setter provides a partially completed grid, which for a well-posed puzzle has a unique solution.");
		txtpnSudokuIsA.setBounds(10, 110, 430, 70);
		add(txtpnSudokuIsA);
		
		JTextPane txtpnCompletedPuzzlesAre = new JTextPane();
		txtpnCompletedPuzzlesAre.setBackground(Color.ORANGE);
		txtpnCompletedPuzzlesAre.setText("Completed puzzles are always a type of Latin square with an additional constraint on the contents of individual regions. For example, the same single integer may not appear twice in the same 9x9 playing board row or column or in any of the nine 3x3 subregions of the 9x9 playing board");
		txtpnCompletedPuzzlesAre.setBounds(10, 191, 430, 64);
		add(txtpnCompletedPuzzlesAre);

	}
}
