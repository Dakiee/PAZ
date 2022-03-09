import acm.program.*;

public class Add2Integers extends ConsoleProgram {

	public void run() {
		println("2 toonii niilber oldog programm.");
		int n1 = readInt("n1: ");
		int n2 = readInt("n2: ");
		int total = n1 + n2;
		println("Niilber ni " + total + ".");
	}

}
