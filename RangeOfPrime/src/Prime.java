import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int count=0;
	for (int i=3;i<=n;i++) {
		int res=checkPrime(i);
		if(res!=0) {
			count=count+1;
			System.out.println(res);
		}
		
	}
	System.out.println("number of prime number is="+count);
	
}
public static int checkPrime(int n) {
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			return 0;
		}
	}
	return n;
}
}
