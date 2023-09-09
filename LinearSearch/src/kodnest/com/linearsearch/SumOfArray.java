package kodnest.com.linearsearch;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array elements");
		int arr[]=new int [scan.nextInt()];
		System.out.println("enter "+ arr.length+" number to stored in array ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=arr[i]+sum;
		}
		System.out.println("sum of numbers "+sum );
	}

}
