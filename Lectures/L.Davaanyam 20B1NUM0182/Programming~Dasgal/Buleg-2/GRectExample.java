import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class GRectExample extends GraphicsProgram {

	public void run() {
		GRect rect = new GRect(100, 50, 125, 60);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
	}

}
