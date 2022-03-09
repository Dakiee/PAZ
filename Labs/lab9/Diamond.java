import java.awt.Color;

import acm.graphics.GPolygon;

public class Diamond extends GPolygon{
	
		public Diamond(double width, double height) {
		
			addVertex(width/2, 0); 
			addVertex(0, height/2);
			addVertex(width/2 , height);
			addVertex(width , height/2);
			setFillColor(Color.red);
			setFilled(true);
			
		}

}
