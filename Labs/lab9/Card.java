import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.*;

public class Card extends GCompound{
	public static int SUIT_WIDTH=50;
	public static int SUIT_HEIGHT=50;
	private GObject suit;
	private GLabel rank;
	public Card(int suit, int rank) {
		this.suit=getSuit(suit);
		this.rank=new GLabel(getRank(rank));
		add(this.rank,0,SUIT_HEIGHT);
		add(this.suit,this.rank.getWidth()+5,0);
	}
	public static GObject getSuit(int suit) {
		switch (suit) {
		case 1:
			return new Spade(SUIT_WIDTH,SUIT_HEIGHT);
		case 2:
			return new Diamond(SUIT_WIDTH,SUIT_HEIGHT);	
		case 3:
			return new Heart(SUIT_WIDTH,SUIT_HEIGHT);	
		case 4:
			return  new CLub(SUIT_WIDTH,SUIT_HEIGHT);		
		default:		
			return null;
		}
	}
	public static String getRank(int rank) {
		switch (rank) {
		case 1:
			return  "A";					
		case 11:
			return   "J";		
		case 12:
			return   "Q";	
		case 13:
			return  "K";			
		default:
			return  rank+"";	
		}
	}
	
}
