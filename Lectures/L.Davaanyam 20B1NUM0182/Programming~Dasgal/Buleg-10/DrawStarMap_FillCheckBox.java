import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawStarMap_FillCheckBox extends GraphicsProgram {

	public void init() {
		add(new JButton("Clear"), SOUTH);
		fillCheckBox = new JCheckBox("Filled");
		fillCheckBox.setSelected(true);
		add(fillCheckBox, SOUTH);
		addActionListeners();
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(STAR_SIZE);
		star.setFilled(fillCheckBox.isSelected());
		add(star, e.getX(), e.getY());
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
	}
	private static final double STAR_SIZE = 20;
	private JCheckBox fillCheckBox;

}
