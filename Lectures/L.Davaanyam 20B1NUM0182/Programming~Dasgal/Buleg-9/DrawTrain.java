import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawTrain extends GraphicsProgram {

	public void run() {
		double xc = getWidth() / 2;
		Train train = new Train();
		train.append(new Engine());
		train.append(new Boxcar(Color.GREEN));
		train.append(new Caboose());
		add(train, xc - train.getWidth() / 2, getHeight());
		waitForClick();
		while (train.getX() + train.getWidth() >= 0) {
			train.move(-DELTA_X, 0);
			pause(PAUSE_TIME);
		}
	}

	private static final double PAUSE_TIME = 20;
	private static final double DELTA_X = 2;

}
