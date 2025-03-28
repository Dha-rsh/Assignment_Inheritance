package Inheritance;


public class Vehicle {
 String brand;
 int wheels;
 double price;


 Vehicle() {
     System.out.println("Vehicle Constructor Called (No Parameters)");
 }


 Vehicle(String brand, int wheels, double price) {
     System.out.println("Vehicle Constructor Called");
     this.brand = brand;
     this.wheels = wheels;
     this.price = price;
 }

 void display() {
     System.out.println("Brand: " + brand);
     System.out.println("Wheels: " + wheels);
     System.out.println("Price: $" + price);
 }
}


class Car extends Vehicle {
 int seats;
 String fuelType;

 Car() {
     super(); 
     System.out.println("Car Constructor Called (No Parameters)");
  
 }


 Car(String brand, double price, int seats, String fuelType) {
     super(brand, 4, price); 
     this.seats = seats;
     this.fuelType = fuelType;
 }

 @Override
 void display() {
     super.display();
     System.out.println("Seats: " + seats);
     System.out.println("Fuel Type: " + fuelType);
 }
}


class Bike extends Vehicle {
 boolean hasGear;

 
 Bike() {
     super(); 
     System.out.println("Bike Constructor Called (No Parameters)");
     this.hasGear = false;
 }

 
 Bike(String brand, double price, boolean hasGear) {
     super(brand, 2, price); 
     this.hasGear = hasGear;
 }

 
 @Override
 void display() {
     super.display();
     System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
 }
}


class Truck extends Vehicle {
 double loadCapacity;

 
 Truck() {
     super(); 
     System.out.println("Truck Constructor Called (No Parameters)");
     
 }

 
 Truck(String brand, double price, double loadCapacity) {
     super(brand, 6, price); 
     this.loadCapacity = loadCapacity;
 }

 
 @Override
 void display() {
     super.display();
     System.out.println("Load Capacity: " + loadCapacity + " Tons");
 }
}


