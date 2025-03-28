package Inheritance;

public class Student {
	String name;
	int age;
Student(){
	System.out.println("Student Constructor with no parameter");
}
Student(String name,int age){
	this.name=name;
	this.age=age;
}
void display() {
	System.out.println("Student name: " + name);
	System.out.println("Student age: " + age);
}
}



class ZSGSStudent extends Student{
	String course;
	int courseId;
	ZSGSStudent(){
		super();
		System.out.println("ZSGS Student Constructor with no parameter");

	}
	ZSGSStudent(String name,int age,String course,int courseId){
		super(name,age);
		this.course=course;
		this.courseId=courseId;
		
	}
	void display() {
		super.display();
		System.out.println("Student course: " + course);
		System.out.println("Student courseId: " + courseId);
	}
}



