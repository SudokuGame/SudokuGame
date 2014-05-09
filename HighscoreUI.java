import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JList;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class HighscoreUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public HighscoreUI() {
		setBackground(Color.ORANGE);
		setLayout(null);
		
		// Back Button should bring you to the main menu
		
		JToggleButton toggleButton = new JToggleButton("");
		toggleButton.setBounds(0, 0, 89, 58);
		toggleButton.setIcon(new ImageIcon(HighscoreUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		toggleButton.setBackground(Color.WHITE);
		add(toggleButton);
		
		// Titel Highscore
		
		JLabel lblHighscore = new JLabel("Highscore");
		lblHighscore.setBounds(165, 0, 225, 67);
		lblHighscore.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 41));
		add(lblHighscore);
		
		String highscorelist[] = {"50089", "45530", "39999", 
	            "22899", "15999", "13089", "8888"};
		
		//List with highscore will be created
		
		JList list = new JList(highscorelist);
		list.setBounds(390, 261, -234, -132);
		add(list);
		
		
		

	}
}
