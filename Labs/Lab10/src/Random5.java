import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JFrame;


public class Random5 extends Canvas{

public void paint(Graphics g) {
int[] intArray = {150, 400, 800};


int x = new Random().nextInt(intArray.length);
int y = new Random().nextInt(intArray.length);

int x2 = new Random().nextInt(intArray.length);
int y2 = new Random().nextInt(intArray.length);

int x3 = new Random().nextInt(intArray.length);
int y3 = new Random().nextInt(intArray.length);

int x4 = new Random().nextInt(intArray.length);
int y4 = new Random().nextInt(intArray.length);

int x5 = new Random().nextInt(intArray.length);
int y5 = new Random().nextInt(intArray.length);


int randx1 = intArray[x];
int randy1 = intArray[y];

int randx2 = intArray[x2];
int randy2 = intArray[y2];


int randx3 = intArray[x3];
int randy3 = intArray[y3];

int randx4 = intArray[x4];
int randy4 = intArray[y4];

int randx5 = intArray[x5];
int randy5 = intArray[y5];

Toolkit t=Toolkit.getDefaultToolkit();
Image i1=t.getImage("C:/Users/ldava/OneDrive/Documents/PAZ eclipse/Lab10/src/java.gif");
g.drawImage(i1, randx1,randy1,this);
Image i2=t.getImage("C:/Users/ldava/OneDrive/Documents/PAZ eclipse/Lab10/src/java.gif");
g.drawImage(i2, randx2,randy2,this);
Image i3=t.getImage("C:/Users/ldava/OneDrive/Documents/PAZ eclipse/Lab10/src/java.gif");
g.drawImage(i3, randx3,randy3,this);
Image i4=t.getImage("C:/Users/ldava/OneDrive/Documents/PAZ eclipse/Lab10/src/java.gif");
g.drawImage(i4, randx4,randy4,this);
Image i5=t.getImage("C:/Users/ldava/OneDrive/Documents/PAZ eclipse/Lab10/src/java.gif");
g.drawImage(i5, randx5,randy5,this);
}
public static void main(String[] args) {
Random5 m=new Random5();
JFrame f=new JFrame();
f.add(m);
f.setSize(800,800);
f.setVisible(true);
}
}