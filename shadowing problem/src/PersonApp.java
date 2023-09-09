import java.util.Scanner;

public class PersonApp {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter id");
		int id =scan.nextInt();
		System.out.println("enter name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("enter gender");
		String gender=scan.next();
		System.out.println("enter email");
		String email=scan.next();
		System.out.println("enter the phone number");
		long phone=scan.nextLong();
		
		Person p=new Person(id, name, gender, email, phone);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "+p.email+" "+p.phone);
		p.eat();
		p.sleep();
	}

}





