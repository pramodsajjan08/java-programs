package practice;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 2 integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("additon result is " +(a+b));
		System.out.println("enter the 2 real numbers");
		float c=scan.nextFloat();
		float d= scan.nextFloat();
		System.out.println("addition of real number is " +(c+d));
		scan.nextLine();
		String name= scan.nextLine();
		System.out.println("hello" + name);
		System.out.println("enter tour insta id");
		String pramod=scan.nextLine();
		System.out.println("insta id :"+ pramod);
		
	}

}
