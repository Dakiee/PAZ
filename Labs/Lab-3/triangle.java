import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class triangle extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
   void paintLine (int length) {
    for (int i = 0; i < length; i++) {
      kara.putLeaf();
      kara.move();
    }
  }

  void gotoNextLine (boolean left2right) {
    if (left2right) {
      kara.turnRight();
      kara.move();
      kara.turnRight();
    }
    else {
      kara.turnLeft();
      kara.move();
      kara.turnLeft();
    }
  }

  public void myProgram() {
    // put your main program here, for example
    final int H = 8;

    int Width = 1;
    boolean left2right = true;

    for (int y = 0; y < H-1; y++) {
      paintLine (Width);
      gotoNextLine (left2right);
      left2right = !left2right;
      Width = Width + 2;
    }
    paintLine (Width);
  }

}