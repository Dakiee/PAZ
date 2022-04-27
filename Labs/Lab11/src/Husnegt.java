
public class Husnegt {
		public static void main(String[] args) {
			int[][] intArr = new int[10][10];
			for ( int i = 0; i < 10; i++ ) {
				 for(int j=0; j < 10; j++ ) {
				    intArr[i][j] = (int)Math.floor(Math.random()*1000);
				}
			}
			int max=intArr[0][0],k=0;
				for ( int i = 0; i < 10; i++ ) {
					 for(int j=0; j < 10; j++ ) {
					    	if(max<intArr[i][j])
				    		{
				    			max=intArr[i][j]; k=j;
				    		}
				    }
				}
				int min=intArr[0][0],m=0;
				for ( int i = 0; i < 10; i++ ) {
					 for(int j=0; j < 10; j++ ) {
					    	if(max>intArr[i][j])
				    		{
				    			min=intArr[i][j]; m=j;
				    		}
				    }
				}
		
			    System.out.println(" Hamgiiin ih elementiin dugaar : ["+k+"]" + " \n HAmgiin ih element ni " + max);
			    System.out.println(" Hamgiiin baga elementiin dugaar : ["+m+"]" + " \n HAmgiin baga element ni " + min);
			}
	}


