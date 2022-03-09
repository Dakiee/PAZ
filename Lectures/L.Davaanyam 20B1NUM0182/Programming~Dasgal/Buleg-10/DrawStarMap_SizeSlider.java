import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawStarMap_SizeSlider extends GraphicsProgram {

	public void init() {
		add(new JButton("Clear"), SOUTH);
		sizeSlider = new JSlider(MIN_SIZE, MAX_SIZE, DEFAULT_SIZE);
		add(new JLabel("  Small"), SOUTH);
		add(sizeSlider, SOUTH);
		add(new JLabel("Large"), SOUTH);
		addMouseListeners();
		addActionListeners();
	}
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(getCurrentSize());
		star.setFilled(true);
		add(star, e.getX(), e.getY());
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) {
			removeAll();
		}
	}

	public double getCurrentSize() {
		return sizeSlider.getValue();
	}

	private static final int MIN_SIZE = 1;
	private static final int MAX_SIZE = 50;
	private static final int DEFAULT_SIZE = 16;

	private JSlider sizeSlider;

}
