package home;

public class Bus {
	
	int number;
	String name;
	String colour;
	String brand;
	String tyre;
	String company;
	int tickets;
	int ticketPrice ;
	String typeOfBooking;
	int costOfBus;
	
	public Bus(int number, String name, String colour, String brand, String tyre, String company, int tickets,
			int ticketPrice, String typeOfBooking, int costOfBus) {
		super();
		this.number = number;
		this.name = name;
		this.colour = colour;
		this.brand = brand;
		this.tyre = tyre;
		this.company = company;
		this.tickets = tickets;
		this.ticketPrice = ticketPrice;
		this.typeOfBooking = typeOfBooking;
		this.costOfBus = costOfBus;
	}
	
	void go() {
		System.out.println(name+" "+colour+"colour will go koppal");
	
	}
	
	void location() {
		System.out.println(company+"bus will cost of "+costOfBus);
	}













	
	
	
	
	
	
	
	
	
	

	

	
	
}
