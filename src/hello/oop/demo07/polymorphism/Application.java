package hello.oop.demo07.polymorphism;

public class Application {
	public static void main(String[] args) {
		/*
		 * 一个对象的实际类型是确定的
		 *   new Person();
		 *   new Student();
		 * */
		
		// 可以指向的引用类型就不确定了: 父类的引用指向子类
		
		// Student 能调用的方法都是自己的 或者继承父类的
		Student s1 = new Student();
		// Person 父类型, 可以指向子类, 但是不能执行子类独有的方法
		Person s2 = new Student();
		Object s3 = new Student();
		
		s1.run();
		// 父类的引用执行子类中被重写的方法
		s2.run();
		// 子类重写了父类的方法，执行子类的方法
		((Student) s2).eat();
		// 父类中没有eat()方法,所以执行不了
		// s2.eat()
		
	}
}
