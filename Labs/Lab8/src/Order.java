import acm.program.ConsoleProgram;

	public class Order extends ConsoleProgram {
		public void run(){
			println("Өгөгдсөн тоон дарааллын хамгийн их, хамгийн бага, дундаж утгыг хэвлэдэг програм.");
			int Maximum, Minimum, i=1;
			float Avarage;
			int x=readInt("Та эхний тоогоо оруулна уу: ");
			Maximum=x;
			Minimum=x;
			Avarage=x;
			if(x==0){
				println("0 гэх тоог оруулахаас өмнө өөр нэг тоо оруулна уу: ");
				while(true){
				int k=readInt("");
					if(k==0){
						println("0 гэх тоог оруулахаас өмнө өөр нэг тоо оруулна уу: ");
					} else break;
				}
			}
			while(true){
				int y=readInt("Та дараагийн тоог оруулна уу. Хэрвээ тоон дарааллыг дуусгах бол 0-ийг оруулна уу: ");
				if(y==0){
					break;
				}
				else if(Maximum<y){
					Maximum=y;
				} else if(Minimum>y){
					Minimum=y;
				} 
				   i=i+1;
				   Avarage=Avarage+y;
			}
			Avarage=Avarage/i;
			println("Хамгийн их утга нь:"+Maximum);
			println("Хамгийн бага утга нь:"+Minimum);
			println("Дундаж утга нь:"+Avarage);
		}
	}