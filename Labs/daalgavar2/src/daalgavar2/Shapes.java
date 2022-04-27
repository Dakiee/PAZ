package daalgavar2;
import java.awt.*;
import acm.graphics.*;
import acm.program.*;
public class Shapes extends GraphicsProgram{
	public void run() {
		add(new GLabel("Davaanyam"), 40, 40);
		GOval oval = new GOval(80, 100, 150, 60);
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		add(oval);
		GRect rect = new GRect(80, 200, 150, 60);
		rect.setFilled(true);
		rect.setFillColor(Color.BLUE);
		add(rect);
}
}
