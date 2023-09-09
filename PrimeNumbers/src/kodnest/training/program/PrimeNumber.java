package kodnest.training.program;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}
		if (count == 2)
			System.out.println("enter number is prime number");
		else
			System.out.println("enter number is not prime number");

		// TODO Auto-generated method stub

	}

}


