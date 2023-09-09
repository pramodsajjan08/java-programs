package practice;

public class Calculator 
{
	public static void add(int _1, int _2) {
		System.out.println("addition of 2 number is " + (_1+_2));
	}
	public static void add(int x,int y,int z) {
		System.out.println("addition of 3 number is"+( x+y+z));
	
	}
	public static void sub( int m,int n) {
		System.out.println("substraction of 2 number is "+(m-n));
		
	}
	public static void sub(float x,float y,float z) {
		System.out.println("substraction of 3 number is"+(x-y-z));
		
	}
	public static void mul(long p,long n) {
		System.out.println("multiplication of two number is"+(p*n));
	}
		public static void div(int b,int d) {
			System.out.println("division of two number is "+(b/d));
			
		}
		public static void main(String[]args) {
			add(8,7);
			add(5,3,2);
			sub(8,4);
			sub(9.7f,1.6f,9.0f);
			mul(75l,5123l);
			div(15,5);
			
		}
} 
