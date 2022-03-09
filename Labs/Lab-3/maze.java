import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class maze extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  void search(){  
	kara.turnRight();     
	kara.turnRight();         
	while(kara.treeRight()){
	    kara.move();
	}
	kara.turnRight();         
	kara.move();          
	kara.move();
	kara.turnRight();    
  }

  public void myProgram() {
    // put your main program here, for example:
   
    while (!kara.onLeaf()){
       if(!kara.treeFront()){
           kara.move();
       }else search();
  }
     kara.removeLeaf();
 }
}