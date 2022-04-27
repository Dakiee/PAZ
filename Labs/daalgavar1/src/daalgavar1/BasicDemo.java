package daalgavar1;
import acm.program.*;
public class BasicDemo extends ConsoleProgram{
	public void run() {
		println("Ehnii 10 toonii niilber.");
		int total=0;
		for(int i = 1; i <= 10; ++i)
        {
            total+=i;
        }
		println("Tentsuu " + total + ".");
		}
}
