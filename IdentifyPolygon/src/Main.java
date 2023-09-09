import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of sides to identify which polygon is");
		int sides=scan.nextInt();
		identifyPolygon(sides);
		
		
	}
	public static void identifyPolygon(int sides) {
	 switch(sides) {
	
	 case 3:System.out.println("triangle ");break;
	 case 4:System.out.println("quadrilateral ");break;
	 case 5:System.out.println("pentagon");break;
	 case 6:System.out.println("hexagon");break;
	 case 7:System.out.println("heptgon");break;
	 case 8:System.out.println("octagon");break;
	
	 default:
		 System.out.println("your entered sides is not polygon");
	 }
	}

}
