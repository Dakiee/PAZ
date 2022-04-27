import java.awt.Color;

import acm.graphics.*;
import acm.util.ErrorException;

public class HangmanCanvas extends GCanvas {

	public HangmanCanvas() {

		lblGuessWord = new GLabel("");
		lblGuessWord.setFont("times-30");
		lblGuessWord.setLocation(SCAFFOLD_X, SCAFFOLD_Y + SCAFFOLD_HEIGHT + lblGuessWord.getHeight());
		lblIncorrectGuess = new GLabel("Aлдсан үсэг: ", lblGuessWord.getX(),
		lblGuessWord.getY() + lblGuessWord.getHeight());
		lblIncorrectGuess.setFont("times-italic-20");
		reset();
		add(lblGuessWord);
		add(lblIncorrectGuess);
	}

	public void reset() {
		removeAll();
		drawScaffold();
		countPart = 0;
		lblGuessWord.setLabel("");
		lblIncorrectGuess.setLabel("Aлдсан үсэг: ");
	}

	private void drawScaffold() {
		add(new GLine(SCAFFOLD_X, SCAFFOLD_Y, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y));
		add(new GLine(SCAFFOLD_X, SCAFFOLD_Y, SCAFFOLD_X, SCAFFOLD_Y + SCAFFOLD_HEIGHT));
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH));

	}

	private void drawHead() {
		GOval a = new GOval(HEAD_RADIUS * 2, HEAD_RADIUS * 2);
		add(a, SCAFFOLD_X + BEAM_LENGTH - HEAD_RADIUS, SCAFFOLD_Y + ROPE_LENGTH);
	}

	private void drawBody() {
		GLine a = new GLine(0, 0, 0, BODY_LENGTH);
		add(a, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS);
	}

	private void drawLeftArm() {
		GLine a = new GLine(0, 0, -UPPER_ARM_LENGTH, 0);
		add(a, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + ARM_OFFSET_FROM_HEAD);
		GLine b = new GLine(0, 0, 0, LOWER_ARM_LENGTH);
		add(b, SCAFFOLD_X + BEAM_LENGTH - UPPER_ARM_LENGTH,
				SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + ARM_OFFSET_FROM_HEAD);
	}

	private void drawRightArm() {
		GLine a = new GLine(0, 0, UPPER_ARM_LENGTH, 0);
		add(a, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + ARM_OFFSET_FROM_HEAD);
		GLine b = new GLine(0, 0, 0, LOWER_ARM_LENGTH);
		add(b, SCAFFOLD_X + BEAM_LENGTH + UPPER_ARM_LENGTH,
				SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + ARM_OFFSET_FROM_HEAD);
	}

	private void drawLeftLeg() {
		GLine a = new GLine(0, 0, -HIP_WIDTH, 0);
		GLine b = new GLine(0, 0, 0, LEG_LENGTH);
		add(a, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + BODY_LENGTH);
		add(b, SCAFFOLD_X + BEAM_LENGTH - HIP_WIDTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + BODY_LENGTH);
	}

	private void drawRightLeg() {
		GLine a = new GLine(0, 0, HIP_WIDTH, 0);
		GLine b = new GLine(0, 0, 0, LEG_LENGTH);
		add(a, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + BODY_LENGTH);
		add(b, SCAFFOLD_X + BEAM_LENGTH + HIP_WIDTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + BODY_LENGTH);
	}

	private void drawLeftFoot() {
		GLine a = new GLine(0, 0, -FOOT_LENGTH, 0);
		add(a, SCAFFOLD_X + BEAM_LENGTH - HIP_WIDTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + LEG_LENGTH + BODY_LENGTH);
	}

	private void drawRightFoot() {
		GLine a = new GLine(0, 0, FOOT_LENGTH, 0);
		add(a, SCAFFOLD_X + BEAM_LENGTH + HIP_WIDTH, SCAFFOLD_Y + ROPE_LENGTH + 2 * HEAD_RADIUS + LEG_LENGTH + BODY_LENGTH);
	}

	public void displayWord(String word) {
		lblGuessWord.setLabel(word);
	}

	public void noteIncorrectGuess(char letter) {
		lblIncorrectGuess.setLabel(lblIncorrectGuess.getLabel() + Character.toUpperCase(letter) + ", ");
	}

	public void addPart() {
		countPart++;
		switch (countPart) {
		case 1:
			drawHead();
			break;
		case 2:
			drawBody();
			break;
		case 3:
			drawLeftArm();
			break;
		case 4:
			drawRightArm();
			break;
		case 5:
			drawLeftLeg();
			break;
		case 6:
			drawRightLeg();
			break;
		case 7:
			drawLeftFoot();
			break;
		case 8:
			drawRightFoot();
			break;
		default:
			throw new ErrorException("addPart: can not add part. allready lossed");
		}
	}

	public void win() {
		GLabel label = new GLabel("Та хожлоо");
		label.setColor(Color.BLUE);
		label.setFont("arial-30");
		add(label, (getWidth() - label.getWidth()) / 2, (getHeight() + label.getAscent()) / 2);
		GLabel word = new GLabel("Танд баяр хүргэе");
		word.setColor(Color.BLUE);
		word.setFont("arial-20");
		add(word, (getWidth() - word.getWidth()) / 2, (label.getY() + word.getHeight()));
	}

	public void lose(String correctWord) {
		GLabel label = new GLabel("Та хожигдлоо");
		label.setColor(Color.RED);
		label.setFont("arial-30");
		add(label, (getWidth() - label.getWidth()) / 2, (getHeight() + label.getAscent()) / 2);
		GLabel word = new GLabel("Зөв хариулт - " + correctWord.toUpperCase());
		word.setColor(Color.BLUE);
		word.setFont("arial-20");
		add(word, (getWidth() - word.getWidth()) / 2, (label.getY() + word.getHeight()));
	}

	private int countPart;
	private GLabel lblGuessWord;
	private GLabel lblIncorrectGuess;

	private static final int SCAFFOLD_X = 10;
	private static final int SCAFFOLD_Y = 10;
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;

}