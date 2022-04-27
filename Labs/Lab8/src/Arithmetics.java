import acm.program.*;
import acm.util.*;


public class Arithmetics extends ConsoleProgram {
	public static final char ADD = '+';
	public static final char SUB = '-';
	public static final char MULT = '*';
	public static final char DIV = '/';
	private RandomGenerator grand = RandomGenerator.getInstance();
	
	public void run() {
		int n = grand.nextInt(1, 11);
		for (int i = 0; i < n; i++) {
			Rational r1 = new Rational(grand.nextInt(1, 11), grand.nextInt(1, 11));
			Rational r2 = new Rational(grand.nextInt(1, 11), grand.nextInt(1, 11));
			char op = nextOperator();
			println(r1 + " " + op + " " + r2 + "=");
			Rational r3 = calculate(r1, r2, op);
			int num = readInt("Хүртвэр:");
			int den= readInt("Хуваарь:");
			boolean b = equals(r3);
			if(b==true) {
				println("Хариулт зөв байна.");
			} else {
				println("Хариулт буруу байна.");
				println("Зөв хариулт бол:"+r3);
			}
		}
	}
	public static char nextOperator() {
		RandomGenerator rand = RandomGenerator.getInstance();
		switch (rand.nextInt(1, 4)) {
		case 1:
			return ADD;
		case 2:
			return SUB;
		case 3:
			return MULT;
		default:
			return DIV;
		}
	}

	private Rational calculate(Rational r1, Rational r2, char op) {
		Rational result = null;
		switch (op) {
		case ADD:
			result = r1.add(r2);
			break;
		case SUB:
			result = r1.subtract(r2);
			break;
		case MULT:
			result = r1.multiply(r2);
			break;
		case DIV:
			result = r1.divide(r2);
			break;
		}
		return result;
	}
}
