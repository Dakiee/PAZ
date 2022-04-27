import java.util.Scanner;

public class lab11_5 {

	public static void main(String[] args) {		
		int k=0;		
		System.out.println("n : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]  = new int[n];
		int b[] = new int[n];
		System.out.println("Elementvvdiig oruul");
		for(int i = 0 ; i<a.length; i++) {
			a[i]=scan.nextInt();
		}
		int min = 0;
		for(int i=0 ; i < a.length-1 ; i++) {
			for(int j=i+1; j < a.length;j++)
			if(a[i]>a[j]) {
				min = a[i];
				a[i]= a[j];
				a[j]=min;
			}
		}
		for(int i=0; i<a.length; i++,k++) {
			b[k]=a[i];
		}
		for( k=0 ; k<b.length; k++) {
			System.out.print(b[k]+ "");
		}
		
	}

}