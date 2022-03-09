import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class putMushrooms extends JavaKaraProgram {
  public void myProgram() {
  
      for(int i=0; i<world.getSizeY();i++){
        for(int l=0; l<world.getSizeX(); l++){
            if(world.isTree(l,i) && i != world.getSizeY()-1){
                world.setMushroom(l,i+1,true);
            }
        }
      }    
  }
}



        