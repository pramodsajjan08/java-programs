package kodnest.training.programmingmarathon;
import java.util.*;

public class Natural_Numbers {
 public static void main(String[]args) {
	 Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
		
	}
	System.out.println(sum);
 }

} 
