import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class invert extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
   void invert() {
    if (kara.onLeaf()){
      kara.removeLeaf();
    }
    else {
      kara.putLeaf();
    }
  } 

  void walk() {
    invert();
    while (!kara.treeFront()) {
      kara.move();
      invert();
    }
  } 

  void right() {
    walk();
    if (!kara.treeRight()) {
      kara.turnRight();
      kara.move();
      kara.turnRight();
    }
  }

  void left() {
    walk();
    if (!kara.treeLeft()) {
      kara.turnLeft();
      kara.move();
      kara.turnLeft();
    }
  }
  public void myProgram() {
    // put your main program here, for example:
    boolean walkingRight = true;

    while (!( kara.treeFront() && 
              (kara.treeLeft() || kara.treeRight()) )) {
      if (walkingRight){
        right();
      }
      else{
        left();
      }
      walkingRight = !walkingRight;
    }
  }

}