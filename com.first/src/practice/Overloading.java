package practice;

public class Overloading {
	public static void getTea() {
		System.out.println("bill is 10rs");
	}
	public static void getTea(int quantity) {
		System.out.println("bill is"+(quantity*10));
	}
	public static void getTea(String type) {
		System.out.println("bill for"+type+"tea is 15rs");
		}
	public static void getTea(int quantity,String type) {
		System.out.println("bill for"+quantity+""+type+"tea is"+(quantity*15));
	}
	public static void main(String[]args) {
		getTea();
		getTea(5);
		getTea("lemon");
		getTea(10,"ginger");
	}
}
