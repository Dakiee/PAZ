import acm.graphics.*;
import acm.program.*;

public class TicTacToeBoard extends GraphicsProgram {

	public void run() {
		add(new GLine(130, 60, 220, 60));
		add(new GLine(130, 90, 220, 90));
		add(new GLine(160, 30, 160, 120));
		add(new GLine(190, 30, 190, 120));
	}

}
