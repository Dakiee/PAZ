package lecture9;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class NewApplet extends Applet {
  

   
    public void paint(Graphics g) {
        //this is for first big rectangle 
        
       g.setColor(Color.red);
       g.fillRect(300, 400, 1000, 200);
       g.drawRect(300, 400, 1000, 200); 
       
       // this is for the upper polygon
       int[]x = {400,550,950,1100};
       int[]y = {400,250,250,400};
       
       g.setColor(Color.black);
       g.fillPolygon(x,y,4);
       g.drawPolyline(x, y, 4);
       
       //this is for car's wheel 
       g.setColor(Color.white);
       g.fillOval(400, 530, 150, 150);
       g.drawOval(400, 530, 150, 150);
       
       // this is also for cars wheel 
       g.setColor(Color.green);
       g.fillOval(415, 545, 120, 120);
       g.drawOval(415, 545, 120, 120);
       
       // this is also cars wheel 
       g.setColor(Color.white);
       g.fillOval(435,565,80,80);
       g.drawOval(435,565,80,80);
       
       //this is also for cars wheel 
       g.setColor(Color.white);
       g.fillOval(1000,530,150,150);
       g.drawOval(1000,530,150,150);
       
      // this is also cars wheel 
       g.setColor(Color.green);
       g.fillOval(1015, 545, 120, 120);
       g.drawOval(1015, 545, 120, 120);
       
       //this is also cars wheel 
       g.setColor(Color.white);
       g.fillOval(1035, 565, 80, 80);
       g.drawOval(1035, 565, 80, 80);
       
       // its the valu declaration part of polygon 
       int []x1={550,600,850,900};
       int []y1={350,300,300,350};
       
       //this is for polygon 
       g.setColor(Color.yellow);
       g.fillPolygon(x1,y1,4);
       g.drawPolygon(x1,y1,4);
       
       // this is for car's window 
       g.setColor(Color.white);
       g.fillRect(260,550,40,20);
       g.drawRect(260,550,40,20);
       
       //this is for also cars window 
       g.setColor(Color.white);
       g.fillRect(710,300,10,50);
       g.drawRect(710,300,10,50);
       
            
    }

    
}