import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for	(int K=1;K<=i;K++) {
			System.out.print("-");
		}
	
	
		for(int j=5;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
		}
	
	
	for (int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--)
		{
			System.out.print("-");
		}
		for (int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}
}

