package practice;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter tne number 1");
		int a=5;
		int b=scan.nextInt();
		if(a==b) {
			System.out.println("guessing crt");
		}
		else if(a<b)
			System.out.println("guessing is not crt and is above the number");
		else {
			System.out.println("guessing is not crt and is below the number");

		}
			
		
	}
}
		