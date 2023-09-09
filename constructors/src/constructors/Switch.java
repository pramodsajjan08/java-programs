package constructors;
import java.util.*;

public class Switch {

	public static void main(String[]args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter + OR - OR * OR /");
	 
	 char opt=scan.next().charAt(0);
	 switch(opt)
	 {
	 case '+':
		 System.out.println("addition operator");
		 break;
		 
	 case'-':
		 System.out.println("substraction operator");
		 break;
	 case'*':
		 System.out.println("multiplication operator");
		 break;
	 case'/':
		 System.out.println("division operator");
		 break;
		 default:
			 System.out.println("idiot enter the crt message");
	 }
	}
}
