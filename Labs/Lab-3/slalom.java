import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class slalom extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  void quarterTurnLeft() {
    kara.move();
    kara.turnLeft();
    kara.move();
  }

  void quarterTurnRight() {
    kara.move();
    kara.turnRight();
    kara.move();
  }

  public void myProgram() {
    // put your main program here, for example:
    while (true) {
      if (kara.treeLeft()) {
        quarterTurnLeft();
        quarterTurnLeft();
      }
      if (kara.treeRight()) {
        quarterTurnRight();
quarterTurnRight();
            }
    }
  }
}