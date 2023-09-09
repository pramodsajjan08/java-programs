import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter product code ");
		String code=scan.next();
		getProduct(code);
		
	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case"po1":System.out.println("COCA COLA");
		break;
		case"po2":System.out.println("THUMPS UP");
		break;
		case"po3":System.out.println("sprite");
		break;
		default:System.out.println("BINDU JAl JEERA");
		}
	}

}
