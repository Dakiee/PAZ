import acm.program.*;

public class Countdown extends ConsoleProgram {

	public void run() {
		for (int t = START; t >= 0; t--) {
			println(t);
		}
		println("Liftoff!");
	}

	private static final int START = 10;

}
