package constructors;
import java.util.*;

public class Switch1 {

	public static void main(String[]args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter 1 OR 2 OR 3 OR 4 or 5 or 6 or 7 or 8 or 9");
		 
		 int opt=scan.next().charAt(0);
		 switch(opt)
		 {
		 case '1':
			 System.out.println("super sunday");
			 break;
			 
		 case'2':
			 System.out.println("boring monday");
			 break;
		 case'3':
			 System.out.println("headache tuesday");
			 break;
		 case'4':
			 System.out.println("wednesday");
			 break;
		 case'5':
			 System.out.println("saibaba thursday");
			 break;
		 case'6':
			 System.out.println("realx friday");
			 break;
		 case'7':
			 System.out.println("enjoy saturday");
			 break;
		 default:
		 System.out.println("loude first enter message crt");
		 }
		}
	}
