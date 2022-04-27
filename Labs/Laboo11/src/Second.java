import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.event.*;

	public class Second extends GraphicsProgram{
		private RandomGenerator rgen = RandomGenerator.getInstance();
		public void init(){
			setSize(500, 500);
			addMouseListeners();
			addKeyListeners();
}
		public void keyTyped(KeyEvent key){
			if(key.getKeyChar() == 'r'){
				double w = rgen.nextDouble(10, getWidth()/3);
				double h = rgen.nextDouble(10, getHeight()/3);
				double x = rgen.nextDouble(0, getWidth() - w);
				double y = rgen.nextDouble(0, getHeight() - h);
				GRect rect = new GRect(x, y, w, h);
				rect.setFilled(true);
				rect.setColor(rgen.nextColor());
				add(rect);
} 
			else if(key.getKeyChar() == 'c'){
				double w = rgen.nextDouble(10, getWidth()/3);
				double h = rgen.nextDouble(10, getHeight()/3);
				double x = rgen.nextDouble(0, getWidth() - w);
				double y = rgen.nextDouble(0, getHeight() - h);
				GOval oval = new GOval(x, y, w, h);
				oval.setFilled(true);
				oval.setColor(rgen.nextColor());
				add(oval);
}
			else if(key.getKeyChar() == 's'){
				double w = rgen.nextDouble(10, getWidth() / 3);
				double x = rgen.nextDouble(w/2, getWidth() - w);
				double y = rgen.nextDouble(w/2, getHeight() - w);
				GStar star = new GStar(w);
				star.setFilled(true);
				star.setColor(rgen.nextColor());
				add(star, x, y);
}
			else if(key.getKeyChar() == 'h'){
				double w = rgen.nextDouble(10, getWidth() / 5);
				double x = rgen.nextDouble(w, getWidth() - w);
				double y = rgen.nextDouble(w, getHeight() - w);
				GPolygon hex = hexagon(w);
				hex.setFilled(true);
				hex.setColor(rgen.nextColor());
				add(hex, x, y);
}
			else if(key.getKeyChar() == 'd'){
				double w = rgen.nextDouble(10, getWidth()/3);
				double h = rgen.nextDouble(10, getHeight()/3);
				double x = rgen.nextDouble(w/2, getWidth() - w);
				double y = rgen.nextDouble(h/2, getHeight() - h);
				GPolygon diamond = diamond(w, h);
				diamond.setFilled(true);
				diamond.setColor(rgen.nextColor());
				add(diamond, x, y);
}
}
		public void mousePressed(MouseEvent e){
			last = new GPoint(e.getPoint());
			gobj = getElementAt(last);
}
		public void mouseDragged(MouseEvent e){
			if(gobj != null){
				gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
				last = new GPoint(e.getPoint());
}
}
		public void mouseClicked(MouseEvent e){
			remove(gobj);
}
		private GPolygon hexagon(double side){
			GPolygon hex = new GPolygon();
			hex.addVertex(-side, 0);
			int angle = 60;
			for(int i=0; i<6; i++){
				hex.addPolarEdge(side, angle);
				angle -= 60;
}
			return hex;
}
		private GPolygon diamond(double width ,double height){
			GPolygon diamond = new GPolygon();
			diamond.addVertex(-width/2, 0);
			diamond.addEdge(width/2, -height/2);
			diamond.addEdge(width/2, height/2);
			diamond.addEdge(-width/2, height/2);
			diamond.addEdge(-width/2, -height/2);
			return diamond;
}
		private GObject gobj;
		private GPoint last;
}