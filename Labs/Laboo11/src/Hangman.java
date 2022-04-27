import acm.program.*;
import acm.util.*;

public class Hangman extends ConsoleProgram {
	private static final int APP_HEIGHT = 500;
	private static final int APP_WIDTH = 800;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private HangmanLexicon wordDB = new HangmanLexicon();
	private HangmanCanvas canvas;

	public void init(
			
			) {
		super.init();
		setSize(APP_WIDTH, APP_HEIGHT);
		canvas = new HangmanCanvas();
		add(canvas);
	}

	private final static int NUMBER_OF_GUESSES = 8;
	private String word;
	private String tmpw;
	private char letter;
	private int opp;
	private int cnt;

	public void run() {
		opp = NUMBER_OF_GUESSES;
		cnt = 0;
		word = wordDB.getWord(rgen.nextInt(0, 9));
		tmpw = createDashedWord(word);
		canvas.displayWord(tmpw);
		println("Таны таах үг:" + tmpw);
//		println(word);
		while (opp > 0 && cnt < word.length()) {
			readChar();
			checkLetter(letter);
		}
		if(opp==0) {
			canvas.lose(word);
		} else {
			canvas.win();
			
		}
	}

	String createDashedWord(String w) {
		String a = "";
		for (int i = 0; i < w.length(); i++) {
			a = a + "-";
		}
		return a;
	}

	void checkLetter(char letter) {
		int too = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				showLetters(i, letter);
				too++;
				cnt++;
			}
		}
		if (too == 0) {
			println(letter + " үсэг уг үгэнд байхгүй байна.");
			canvas.noteIncorrectGuess(letter);
			canvas.addPart();
			opp--;
		} else {
			println(letter + " үсэг уг үгэнд байна");
		}
		println("Танд үлдсэн боломжийн тоо:" + opp);
		println("Таны таах үг:" + tmpw);
		canvas.displayWord(tmpw);
	}

	void showLetters(int pos, char ch) {
		char[] a = tmpw.toCharArray();
		a[pos] = ch;
		tmpw = new String(a);
	}

	char readChar() {
		String a = readLine();
		a = a.toUpperCase();
		letter = a.charAt(0);
		if ('A' <= letter && 'Z' >= letter) {
			return letter;
		}
		return '1';
	}
}