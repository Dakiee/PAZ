import acm.graphics.*;
import java.awt.event.MouseEvent;
import java.util.Random;


import acm.program.GraphicsProgram;

public class RandomCard extends GraphicsProgram{

	public void run() {
		addMouseListeners();
		addKeyListeners();
	}
	public void mouseClicked(MouseEvent e) {
		
			int s = new Random().nextInt(4)+1;
			int r = new Random().nextInt(13)+1;
			Card m = new Card(s, r);
			m.setLocation(e.getX(), e.getY());
			add(m);
	}
}