import java.util.Scanner;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to check palindrome");
		int n=scan.nextInt();
		Palindrome palindrome=new Palindrome();
		int rev=palindrome.reverseNumber(n);
		System.out.println("reverse of number "+n+" is "+ rev);
		if(n==rev) {
			System.out.println("enter number is palindrome");}
			else
				System.out.println("enter number is not palindrome");
		}
	}


