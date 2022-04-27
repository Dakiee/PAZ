import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

    public class Test extends ConsoleProgram{
        public static final char ADD = '+';
        public static final char SUB = '-';
        public static final char MULT = '*';
        public static final char DIV = '/';
        RandomGenerator rand=RandomGenerator.getInstance();
        public void run() {
            int n = rand.nextInt(10);
            for(int q=0; q<n;  q++){
                int x = rand.nextInt(100);
                int y = rand.nextInt(100);
                 char i= nextOperator(); 
                 int a = calculate(x, y, i);
                 println(+x+"" +i+"" +y+ "=?");
                    int s=readInt("");
                    if(s==a){
                        println("Хариулт зөв.");
                    } else println("Хариулт буруу. Хариу: "+x+"" +i+"" +y+ "="+a);

                    }


        }
        public static char nextOperator() {
        RandomGenerator rand = RandomGenerator.getInstance();
        switch (rand.nextInt(1, 4)){
        case 1:
            return ADD;
            case 2:
            return SUB;
            case 3:
            return MULT;
            default:
            return DIV;
            }
            }
        private int calculate(int first, int second, char op) {
            int result = 0;
            switch (op) {
            case ADD:
                result=first+second;
            break;
            case SUB:
                result=first-second;
            break;
            case MULT:
                result=first*second;
            break;
            case DIV:
                result=first/second;
            break;
            }
            return result;
            }
        }