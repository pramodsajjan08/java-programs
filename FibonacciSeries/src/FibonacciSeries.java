import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to calculate fibanocci series");
		int n=scan.nextInt();
		int f1=0;
		int f2=1;
		if(n==1) {
			System.out.println(f1);
		}
		else if(n==2) {
			System.out.println(f1+" "+f2);
		}
		else {
			System.out.print(f1+" "+f2+" ");
			for(int i=3;i<=n;i++)
			{
				int nextNo=f1+f2;
				System.out.print(nextNo+" ");
				f1=f2;
				f2=nextNo;
			}
			
		}
	}

}
