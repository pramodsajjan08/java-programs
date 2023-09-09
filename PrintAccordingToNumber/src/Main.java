import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Main2 m=new Main2();
		m.divisible_by_two(n);
		m.divisible_by_three(n);
		m.divisible_by_four(n);
		m.divisible_by_five(n);
		m.divisible_by2and5(n);
	}

}
