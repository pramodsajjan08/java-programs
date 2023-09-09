package kodnest.com.linearsearch;

import java.util.Scanner;

public class SumOf2dArrayTO3dArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array elements");
		int arr1[]=new int[scan.nextInt()];
		
		System.out.println("enter"+arr1.length+"numbers to be stored in array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		int arr2[]=new int[arr1.length];
		System.out.println("enter"+arr2.length+"numbers to be stored in array");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		SumOf2dArrayTo3dArray sum=new SumOf2dArrayTo3dArray ();
		int res[]=sum.merge(arr1, arr2);
		for(int x : res) {
			System.out.print(x+" ");
		}
		
	}
}
