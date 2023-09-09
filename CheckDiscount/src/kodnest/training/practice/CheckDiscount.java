package kodnest.training.practice;

import java.util.Scanner;

public class CheckDiscount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();
		CheckDiscount(d);

		// TODO Auto-generated method stub

	}

	public static void CheckDiscount(double purchaseAmount) {
		if (purchaseAmount > 100) {
			System.out.println("discount applicable");
		}

	}

}
