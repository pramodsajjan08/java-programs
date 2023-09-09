import java.util.Scanner;

public class GCDApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the two number to calculate gcd");
	int m=scan.nextInt();
	int n=scan.nextInt();
	
	
	int res=GCD.findGCD(m, n);
	System.out.println("GCD of "+m+" and "+n+" is"+res);
}
}
