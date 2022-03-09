import acm.program.*;
import java.awt.event.*;
import javax.swing.*;
public class HitchhikerImageButton extends ConsoleProgram {

	public void init() {
		JButton button = new JButton(new ImageIcon("images/RedSquare.gif"));
		button.setActionCommand("Red");
		add(button, SOUTH);
		addActionListeners();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Red")) {
			println("Please do not press this button again.");
		}
	}

}
