import acm.program.*;
public class test extends ConsoleProgram {
	public void run(){
	int n=1000;
	println(n + "too hurtelkh pibonachiin too oloh");
	int n1=0, n2=1;
	
	while(n1 < n){
		print(n1 + " ");
		int total = n1+n2;
		n1=n2;
		n2=total;
	}
}
}
