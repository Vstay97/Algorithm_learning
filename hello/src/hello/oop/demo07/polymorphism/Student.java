package hello.oop.demo07.polymorphism;

public class Student extends Person {
	@Override
	public void run() {
		System.out.println("Stu:run");
	}
	
	public void eat() {
		System.out.println("Stu:eat");
	}
}
