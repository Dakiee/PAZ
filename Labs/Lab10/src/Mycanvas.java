import java.awt.*;  
import javax.swing.JFrame;  
  
public class Mycanvas extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("C:/Users/ldava/OneDrive/Documents/PAZ eclipse/Lab10/src/java.gif");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        Mycanvas m=new Mycanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(500,500);  
        f.setVisible(true);
    }  
}  