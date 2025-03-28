package Inheritance;

public class MainClass {
public static void main(String args[]) {
	Shape s;

	s = new Rectangle(20, 30);
	System.out.println("Rectangle Area: " + s.area());

	s = new Circle(10);
	System.out.println("Circle Area: " + s.area());
	
	System.out.println("\ncreating object of child class with default parameter");
	ZSGSStudent stud=new ZSGSStudent();
	stud.display();
	
	System.out.println("\ncreating object of child class with parameter");
	ZSGSStudent stud1=new ZSGSStudent("dharsh",21,"java",100);
	stud1.display();
	
	System.out.println("\ncreating parent class instance of child class ");
	Student stud2=new ZSGSStudent();
	stud2.display();
	
	
	
	System.out.println("\nCreating a Car Object:");
    Car car = new Car("Toyota", 30000, 5, "Petrol");
    car.display();

    System.out.println("\nCreating a Bike Object:");
    Bike bike = new Bike("Yamaha", 2000, true);
    bike.display();

    System.out.println("\nCreating a Truck Object:");
    Truck truck = new Truck("Volvo", 50000, 10.5);
    truck.display();

    System.out.println("\nCreating a Vehicle Reference to a Car Object:");
    Vehicle vehicleRef = new Car("Honda", 25000, 4, "Diesel");
    vehicleRef.display(); 
	
}
}
