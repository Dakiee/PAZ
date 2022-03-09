import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
 public class spiral extends JavaKaraProgram {
 
 void move (int space) {
    for (int i = 0; i < space; i++) {
      kara.putLeaf();
      kara.move();
    }
  }
  
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    final int MAX_LENGTH = 20;
    int d = 1;

    while (d < MAX_LENGTH) {
      move (d);
      kara.turnRight();
      d ++;
    }
  }

}