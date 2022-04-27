import acm.graphics.GLabel;
import acm.program.ConsoleProgram;

public class RandomSentences extends ConsoleProgram{
	public void init(){
		setSize(800,400);
	}
	public void run(){
		int s=readInt("Нэгээс тав хүртэлх тоонуудаас нэгийг сонгон бичнэ үү:");
		int v=readInt("Нэгээс тав хүртэлх тоонуудаас нэгийг сонгон бичнэ үү:");
		int q=readInt("Нэгээс тав хүртэлх тоонуудаас нэгийг сонгон бичнэ үү:");
		String i, j, k;
		i=getSubject(s);
		j=getLocation(v);
		k=getVerb(q);
		println(i+" "+j+" "+k);
	}
	public String getSubject(int s){
		switch(s){
		case 1:
			return "Хүүхэд";
		case 2:
			return "Багш нар";
		case 3:
			return "Сурагчид";
		case 4:
			return "Ажилчид";
		case 5:
			return "Гишүүд";
		}
		return "";
	}
	public String getLocation(int v){
		switch(v){
		case 1:
			return "кино театрт";
		case 2:
			return "номын санд";
		case 3:
			return "зааланд";
		case 4:
			return "зоогийн газар";
		case 5:
			return "гэртээ";
		}
		return "";
	}
	public String getVerb(int q){
		switch(q){
		case 1:
			return "кино үзэв.";
		case 2:
			return "ном уншив.";
		case 3:
			return "сагс тоглов.";
		case 4:
			return "хоол идэв.";
		case 5:
			return "унтав.";
		}
		return "";
	}
}