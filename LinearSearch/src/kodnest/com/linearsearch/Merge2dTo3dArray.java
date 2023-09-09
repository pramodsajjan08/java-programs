package kodnest.com.linearsearch;

import java.util.Scanner;

public class Merge2dTo3dArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array elements");
		int arr1[]=new int[scan.nextInt()];
		int arr2[]=new int[scan.nextInt()];
		System.out.println("enter"+arr1.length+"numbers to be stored in array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		int a =arr1.length;
		int b= arr2.length;
		int c =a+b;
		int arr3[]=new int[c];
		for(int i=0;i<a;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<b;i++) {
			arr3[a+i]=arr2[i];
		}
		for(int i=0;i<c;i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}

}
