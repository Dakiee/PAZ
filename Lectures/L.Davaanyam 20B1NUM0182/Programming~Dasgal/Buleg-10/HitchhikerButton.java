import acm.program.*;
import java.awt.event.*;
import javax.swing.*;
public class HitchhikerButton extends ConsoleProgram {
	public void init() {
		add(new JButton("Red"), SOUTH);
		addActionListeners();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Red")) {
			println("Please do not press this button again.");
		}
	}

}
