import java.awt.Color;

import acm.graphics.*;

public class Heart extends GPolygon {

	public Heart(double width, double height) {
		double w=width/2;
		addVertex(w, height);
		addVertex(0, height/3);
		addArc(w, w, 180, -180);
		addArc(w, w, 180, -180);
		setFillColor(Color.red);
		setFilled(true);
	}

	

}
