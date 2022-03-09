import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Shiidoloh extends JavaKaraProgram {
  public void myProgram() {
    int a=tools.intInput("a=");
    int b=tools.intInput("b=");
    int c=tools.intInput("c=");
    double x1, x2, d;
    d=b*b-4*a*c;
    if(d>=0){
        double y=Math.sqrt(d);
        x1=(-b+y)/(2*a);
        x2=(-b-y)/(2*a);
        tools.showMessage(x1+","+x2);
    } else
        tools.showMessage("Shiidgui.");
  }
}