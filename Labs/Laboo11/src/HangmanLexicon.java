import acm.util.*;

public class HangmanLexicon {

	public int getWordCount() {
		return 10;
	}

	public String getWord(int index) {
		switch (index) {
			case 0: return "PAZ";
			case 1: return "COMPUTER";
			case 2: return "LAPTOP";
			case 3: return "NOTEBOOK";
			case 4: return "MONITOR";
			case 5: return "DISPLAY";
			case 6: return "KEYBOARD";
			case 7: return "MOUSE";
			case 8: return "CPU";
			case 9: return "GPU";
			default: throw new ErrorException("getWord: Illegal index");
		}
	};
}