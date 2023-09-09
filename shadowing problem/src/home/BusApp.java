package home;

import java.util.Scanner;

public class BusApp {

	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int number =scan.nextInt();
		System.out.println("enter the name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("enter colour");
		String colour=scan.next();
		System.out.println("enter brand");
		String brand=scan.next();
		System.out.println("enter the tyre");
		String tyre=scan.next();
		System.out.println("enter the company");
		String company=scan.next();
		System.out.println("enter the tickets");
		int tickets=scan.nextInt();
		System.out.println("enter the ticket price");
		int ticketPrice=scan.nextInt();
		System.out.println("enter the type of booking");
	   String typeOfBooking=scan.next();
	   System.out.println("enter the cost of bus");
	   int costOfBus=scan.nextInt();
	   
	   Bus b=new  Bus(number, name, colour, brand, tyre, company, tickets, ticketPrice, typeOfBooking, costOfBus);				
	   System.out.println(b.number+""+b.name+""+b.colour+""+b.brand+""+b.tyre+""+b.company+""+b.tickets+""+b.ticketPrice+""+b.typeOfBooking+""+b.costOfBus);
	   b.go();
	   b.location();
			   
	}
}
