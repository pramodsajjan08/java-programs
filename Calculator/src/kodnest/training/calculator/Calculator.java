package kodnest.training.calculator;

import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in); 
	public void addition() {
		System.out.println("enter the 2 numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("addition of"+a+"and"+b+" is"+(a+b));// TODO Auto-generated method stub

	}
	public void subtraction() {
		System.out.println("enter the 2 numbers for substraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("substraction of"+a+"and"+b+" is"+(a-b));// TODO Auto-generated method stub

	}
	public void multiplication() {
		System.out.println("enter the 2 numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("multiplication of"+a+"and"+b+" is"+(a*b));
		// TODO Auto-generated method stub

	}
	public void division() {
		System.out.println("enter the 2 numbers for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("division of"+a+"and"+b+" is"+(a/b));
		// TODO Auto-generated method stub

	}
	public void findRemainder() {
		System.out.println("enter the 2 numbers for remainder");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("remainder of"+a+"and"+b+" is"+(a%b));
		// TODO Auto-generated method stub

	}
	public void findSquare() {
		System.out.println("enter a number for finding square");
		int a=scan.nextInt();
		
		System.out.println("square  of a is "+(a*a));
		// TODO Auto-generated method stub

	}
}
