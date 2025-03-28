
package Inheritance;

public class Rectangle extends Shape {
	int length, breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double area() {
		return length * breadth; 
	}
}