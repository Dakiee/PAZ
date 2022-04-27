public class MaxRand {
	public static void main(String[] args) {
		
		int[] intArr = new int[100];
		

			for ( int i = 0; i < intArr.length; i++ ) {
			    intArr[i] = (int)Math.floor(Math.random()*1000);

			}
		    int max=intArr[0],k=0;
		    for(int j=1; j < intArr.length; j++ ) {
		    	if(max<intArr[j])
		    		{
		    			max=intArr[j]; k=j;
		    		}
		    	
		    }
		    System.out.println(" Hamgiiin ih elementiin dugaar : ["+k+"]" + " \n HAmgiin ih element ni " + max);
		}
}
