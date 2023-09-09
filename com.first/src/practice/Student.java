package practice;

public class Student {
	int id;
	String name;
	int age;
	
	void eat()
	{
		System.out.println("student is eating");
	}
    void sleep()
    {
    	System.out.println("student is sleeping");
    	
    }
    void study()
    {
    	System.out.println("student is studying");
    	
    }
    
}
class StudenApp{
	public static void main(String[]args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.id=100;
		s1.name="pramod";
		s1.age=22;
		s1.eat();
		s1.sleep();
		s2.study();
		
	}
}
