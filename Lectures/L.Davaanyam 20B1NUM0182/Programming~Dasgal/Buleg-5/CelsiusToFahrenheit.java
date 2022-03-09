import acm.program.*;

public class CelsiusToFahrenheit extends ConsoleProgram {

	public void run() {
		println("Celsius to Fahrenheit table.");
		for (int c = LOWER_LIMIT; c <= UPPER_LIMIT; c += STEP_SIZE) {
			int f = (int) celsiusToFahrenheit(c);
			println(c + "C = " + f + "F");
		}
	}

	private double celsiusToFahrenheit(double c) {
		return 9.0 / 5.0 * c + 32;
	}

	private static final int LOWER_LIMIT = 0;
	private static final int UPPER_LIMIT = 100;
	private static final int STEP_SIZE = 5;

}
