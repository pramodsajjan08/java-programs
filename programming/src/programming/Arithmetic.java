package programming;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int result=add(a,b);
		System.out.println(result);
		int result1=sub(a,b);
		System.out.println(result1);
		int result2= mul(a,b);
		System.out.println(result2);
		
	}

	public static int add(int a ,int b) {
		int add=a+b;
		return add;
		
	}
	public static int sub(int a,int b) {
		int sub=a-b;
		return sub;
		
	}
	public static int mul(int a, int b) {
		int mul=a*b;
		return mul;
	}

}



