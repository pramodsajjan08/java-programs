package kodnest.training.calculator;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator calculator=new Calculator();
		while(true) {
		System.out.println("hello user welcome to kodnestcalculator");
	System.out.println("+============>addition");
	System.out.println("-============>subtraction");
	System.out.println("*============>multiplication");
	System.out.println("/============>divison");
	System.out.println("%============>find remainder");
	System.out.println("^============>find square");
	System.out.println("!=============>to stop");
	System.out.println("enter your choice");
	char ch=scan.next().charAt(0);
	switch(ch)
	{
	case'+':calculator.addition();
	break;
		
	case'-':calculator.subtraction();
	break;
		
	case'*':calculator.multiplication();
	          break;
		
	case'/':calculator.division();
	break;
		
	case'%':calculator.findRemainder();
	break;
		
	case'^':calculator.findSquare();
	break;
		
	case'!':System.out.println("tata bye bye see u soon");
	return;
		
	default :System.out.println("go and see the kodnest video classes");
	
	
	           }
	    }
	}

}
