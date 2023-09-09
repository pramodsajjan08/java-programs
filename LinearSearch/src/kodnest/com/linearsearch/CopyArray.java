package kodnest.com.linearsearch;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array elements");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("enter"+arr1.length+"numbers to be stored in array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		int arr2[]=new int[arr1.length];
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("array1 contents are ....");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		System.out.println("array 2 contents are...");
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
