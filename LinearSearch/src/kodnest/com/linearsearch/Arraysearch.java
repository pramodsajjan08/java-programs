package kodnest.com.linearsearch;

import java.util.Scanner;

public class Arraysearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array elements");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter"+arr.length+"numbers to be stored in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key to search");
		int target=scan.nextInt();
		Search search=new Search();
		boolean res=search.isPresent(target,arr);
		if (res=true) {
			System.out.println("target found");
		}
		else {
			System.out.println("target not found");
		}
	}

}
