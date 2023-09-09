package constructors;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		if (num1>num2) {
			System.out.println(num2-num1);
		}
		else {
			System.out.println(num1-num2);
		}
			
		// TODO Auto-generated constructor stub
	}

}
