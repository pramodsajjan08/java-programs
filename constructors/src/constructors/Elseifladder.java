package constructors;

import java.util.Scanner;

public class Elseifladder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int marks=scan.nextInt();
		if (marks<50) 
			System.out.println("d-grade");
		
		else if(marks>=50 && marks<60)  
			System.out.println("c-grade");
		
		else if (marks>=60 && marks<70) 
			System.out.println("b-grade");
		
		else if (marks>=70 && marks<80) 
			System.out.println("a- grade");
		
		else 
			System.out.println("a+ - garde");
		System.out.println("congragulations");
		
	}
	

}
