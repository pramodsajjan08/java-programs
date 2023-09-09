package programming;

import java.util.Scanner;

public class Rectangle 
{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int l=scan.nextInt();
		int b=scan.nextInt();
		int rect1=rect(l,b);
		System.out.println(rect1);
		
		}
	public static int rect(int a,int b) {
		
		 int rect= a * b;
		 return rect;
		
	}

}
