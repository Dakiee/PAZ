import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class counter extends JavaKaraProgram {
    int count()
    {
        int n=0;
        while (!kara.treeFront()) {
            if (kara.onLeaf()) n++;
            kara.move();
        }
        if(kara.onLeaf()) n++;
        return n;
    }
    int 
    public void myProgram() {
        int c=0;
            c = count();
            tools.showMessage( "7 udaa alhahad " + c + " navch taaraldav.");
    }
}