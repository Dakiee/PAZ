public class Pibonach {
	public static void main(String[] args) {
		int  n=1000, n1 = 0, n2 = 1;
	    System.out.print(""+ n +" hurtelh toonii fibonacci daraalal ni : ");

	    while(n1<=n){
	    	System.out.print(n1 + ", ");
	        int niilber = n1 + n2;
	        n1 = n2;
	        n2 = niilber;
	     }
	 }
	
}
