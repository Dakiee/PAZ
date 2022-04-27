import java.util.Random;

public class RandomSentence{

    final static int NO_WORDS = 5;
    final static int NO_SENTS = 20;
    final static String SPACE = " ";
    final static String PERIOD = ".";

    static Random r = new Random();

    public static void main( String args[] ){

        String article[] = { "neg", "hoyr", "gurvan", "durvun", "tavan" };
        String noun[] = { "zaluu", "ohin", "nohoi", "muur", "tagtaa" };
        String verb[] = { "mashin", "dugui", "ongots", "roller", "" };
        String preposition[] = { "unav", "random", "murguv", "nisev", "okok" };

        String sentence;
        for (int i = 0; i < NO_SENTS; i++){
            sentence = article[rand()];
            char c = sentence.charAt(0);
            sentence = sentence.replace( c, Character.toUpperCase(c) );
            sentence += SPACE + noun[rand()] + SPACE;
            sentence += (verb[rand()] + SPACE + preposition[rand()]);
            sentence += (SPACE + article[rand()] + SPACE + noun[rand()]);
            sentence += PERIOD;
            System.out.println(sentence);
            sentence = "";
        }
    }

    static int rand(){
        int ri = r.nextInt() % NO_WORDS;
        if ( ri < 0 )
            ri += NO_WORDS;
        return ri;
    }
}