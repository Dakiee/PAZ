import acm.program.*;
import java.awt.event.*;

public class DrawStarMap extends GraphicsProgram {
	public void init() {
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(STAR_SIZE);
		star.setFilled(true);
		add(star, e.getX(), e.getY());
	}
	private static final double STAR_SIZE = 20;

}
