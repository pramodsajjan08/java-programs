package kodnest.training.arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float s[]=new float[10];
		System.out.println("enter the elements");
		for(int i=0;i<=s.length-1;i++) {
			s[i]=scan.nextFloat();
				
		}
		System.out.println("arrays contents are");
		for(int i=0;i<=s.length-1;i++) {
			System.out.println(s[i]+"");
				
		}
	}

}
