import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawFace extends GraphicsProgram {

	public void run() {
		GFace face = new GFace(FACE_WIDTH, FACE_HEIGHT);
		double x = (getWidth() - FACE_WIDTH) / 2;
		double y = (getHeight() - FACE_HEIGHT) / 2;
		add(face, x, y);
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
		gobj = getElementAt(lastX, lastY);
	}

	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - lastX, e.getY() - lastY);
			lastX = e.getX();
			lastY = e.getY();
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (gobj != null) gobj.sendToFront();
	}

	private static final double FACE_WIDTH = 200;
	private static final double FACE_HEIGHT = 300; 

	private GObject gobj;    
	private double lastX;  
	private double lastY;   

}
