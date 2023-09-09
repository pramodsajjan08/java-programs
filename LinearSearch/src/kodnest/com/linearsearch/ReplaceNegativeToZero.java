package kodnest.com.linearsearch;

import java.util.Scanner;

public class ReplaceNegativeToZero {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array elements");
		int arr1[]=new int[scan.nextInt()];
		
		System.out.println("enter"+arr1.length+"numbers to be stored in array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		Negative neg=new Negative();
		neg.merge(arr1);
		System.out.print(arr1);
	}

}
