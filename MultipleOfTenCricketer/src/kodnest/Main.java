package kodnest;

import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n) {
		if(n%10==0)
			System.out.println("accept the "+10);
		else
			System.out.println("enter the number is wrong");
	}
		
		public static void main(String[]args) {
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
          
         checkMultipleOfTen(n);
		}
	}


