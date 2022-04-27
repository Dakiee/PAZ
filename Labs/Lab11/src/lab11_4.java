
public class lab11_4 {
		public static void main(String[] args) {
			int[][] intArr = new int[10][10];
			for ( int i = 0; i < 10; i++ ) {
				 for(int j=0; j < 10; j++ ) {
				    if(i>j) intArr[i][j]=1;
				    else
				    	intArr[i][j]=0;
					 System.out.print(intArr[i][j]);
				}
				 System.out.println();
			}
	}
}

