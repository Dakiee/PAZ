import acm.graphics.*;
import java.awt.*;

public class FilledRect extends GRect {

	public FilledRect(double x, double y, double width, double height) {
		super(x, y, width, height);
		setFilled(true);
	}

	public FilledRect(double x, double y, double width, double height,
	                  Color color) {
		this(x, y, width, height);
		setColor(color);
	}

}
