import acm.program.*;
import java.lang.Math;
public class Urjih extends ConsoleProgram {
public void run() {
	int n = readInt("n: ");
	int k = readInt("k: ");
	int a;
	for (int i = 1; i <= n; i++) {
		for(int l = 1;l <= k-1;l++){
			print(i + "x");
		}
		print(i);
		println("=" + Math.pow(i, k));
	}
	}
}