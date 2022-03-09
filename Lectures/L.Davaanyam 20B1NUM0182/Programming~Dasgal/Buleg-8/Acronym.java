import acm.program.*;

public class Acronym extends ConsoleProgram {

	public void run() {
		while (true) {
			String line = readLine("Enter a string: ");
			if (line.length() == 0) break;
			String acronym = acronym(line);
			println(acronym);
		}
	}
	private String acronym(String str) {
		String result = str.substring(0, 1);
		int pos = str.indexOf(' ');
		while (pos != -1) {
			result += str.substring(pos + 1, pos + 2);
			pos = str.indexOf(' ', pos + 1);
		}
		return result;
	}

}
