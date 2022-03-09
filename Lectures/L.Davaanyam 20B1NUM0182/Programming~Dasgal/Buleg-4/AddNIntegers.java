import acm.program.*;

public class AddNIntegers extends ConsoleProgram {

	public void run() {
		println("This program adds " + NVALUES + " integers.");
		int total = 0;
		for (int i = 0; i < NVALUES; i++) {
			int value = readInt(" ? ");
			total += value;
		}
		println("The total is " + total + ".");
	}

	private static final int NVALUES = 10; 

}
