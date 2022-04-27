import java.awt.Color;

import acm.graphics.*;

public class Spade extends GPolygon {	

		public Spade(double width, double height) {
				double w=width/2;
				addVertex(w, 0);
				addVertex(0, w+w/3);
				addArc(w, w, -180, 180);
				addArc(w*2, height/2, 0, -90);				
				addEdge(2*w, 0);
				addArc(w*2, height/2, -90, -90);
				addArc(w, w, -180, 180);
				setFillColor(Color.black);
				setFilled(true);
			
		}		

}

