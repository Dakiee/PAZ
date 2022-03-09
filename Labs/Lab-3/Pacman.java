import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Pacman extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
   void turnAround() {
    kara.turnLeft();
    kara.turnLeft();
  }
  public void myProgram() {
    // put your main program here, for example:
              kara.removeLeaf();
      while (!kara.treeFront()) {   
      kara.move();                
      if (!kara.onLeaf()) {       
        turnAround();            
        kara.move();
        kara.turnRight();
        kara.move();
        if (!kara.onLeaf()) {     
          turnAround();           
          kara.move();
          kara.move();
        }
      }
      kara.removeLeaf();          
    }
  }

}