
public class RandomNumber {

	public static void main(String[] args) {
		
	int[] intArr = new int[100];
	

		for ( int i = 0; i < intArr.length; i++ ) {
		    intArr[i] = (int)Math.floor(Math.random()*1000);
		    System.out.println("["+i+"]" + intArr[i]);
		}
	}

}