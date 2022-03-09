import acm.program.*;

public class BruteForceGCD extends ConsoleProgram {

	public void run() {
		println("This program computes the gcd of x and y.");
		int x = readInt("Enter x: ");
		int y = readInt("Enter y: ");
		println("gcd(" + x + ", " + y + ") = " + gcd(x, y));
	}

	public int gcd(int x, int y) {
		int guess = Math.min(x, y);
		while (x % guess != 0 || y % guess != 0) {
			guess--;
		}
		return guess;
	}

}
