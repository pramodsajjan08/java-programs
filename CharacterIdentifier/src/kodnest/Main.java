package kodnest;

import java.util.Scanner;

public class Main {
public static void identifyCharacter(char ch)
{
	if (Character.isDigit(ch)) {
		System.out.println("entered character "+ch+" is Digit");
	}
	else if(!Character.isLetter(ch)) {
		System.out.println("entered character "+ch+" is special character");
		
	}
	else
	{
		switch(Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case '0':
		case 'u':
			if(Character.isLowerCase(ch)) {
				System.out.println("enterd character "+ch+"is lower case vowel");
			}
			else {
				System.out.println("entered character"+ch+"is upper case");
			}
			break;
			
			default:
				if(Character.isLowerCase(ch)) {
					System.out.println("entered character"+ch+"is lower case consonent");
				}
				else
				{
					System.out.println("entered character"+ch+"upper case consonent");
				}
				
			
		}
	}
		
}
public static void main(String[]args) {
	System.out.println("enter a charchter to check for digit or vowel");
	Scanner scan=new Scanner(System.in);
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
}

}

