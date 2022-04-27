import java.util.*;

public class TugsToo {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static int sentinel = 0;
	public static int readNonNegativeInt() {
		while (true) {
			System.out.print("Enter an integer (0 to quit): ");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.print("That was not an integer.  Please try again: ");  ;;
			}
			int input = scanner.nextInt();
			if (input >= 0)
				return input;
			else
				System.out.println("Illegal negative value.  Please try again.");
		}
	}
	public static boolean isPerfect(int n) {
		if (n < 2) return false;
		int factorSum = 1;
		for (int factor=2; factor*factor<=n; factor++) {
			if (n % factor == 0) {
				factorSum += factor;
				int otherFactor = n / factor;
				if (otherFactor != factor)
					factorSum += otherFactor;
			}
		}
		return (factorSum == n);
	}
	public static void main(String[] args) {
		System.out.println("This program determines whether numbers are perfect.\n");
		while (true) {
			int n = readNonNegativeInt();
			if (n == sentinel)
				break;
			if (isPerfect(n))
				System.out.printf("%d is perfect\n",n);
			else
				System.out.printf("%d is NOT perfect\n",n);
		}
	}
}