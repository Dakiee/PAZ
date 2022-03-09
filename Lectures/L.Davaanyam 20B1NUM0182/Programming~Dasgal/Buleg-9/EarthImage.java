import acm.graphics.*;
import acm.program.*;

public class EarthImage extends GraphicsProgram {

	public void run() {
		add(new GImage("EarthFromApollo17.jpg"));
		addCitation("Courtesy NASA/JPL-Caltech ");
	}

	private void addCitation(String text) {
		GLabel label = new GLabel(text);
		label.setFont(CITATION_FONT);
		double x = getWidth() - label.getWidth();
		double y = getHeight() - CITATION_MARGIN + label.getAscent();
		add(label, x, y);
	}

	private static final String CITATION_FONT = "SansSerif-10";
	private static final int CITATION_MARGIN = 13;

	public static final int APPLICATION_WIDTH = 640;
	public static final int APPLICATION_HEIGHT = 640 + CITATION_MARGIN;

}
