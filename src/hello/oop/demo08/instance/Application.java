package hello.oop.demo08.instance;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 0:13
 */
public class Application {
	public static void main(String[] args) {
		/*
		 * Object -> String
		 * Object -> Person -> Teacher
		 * Object -> Person -> Student
		 * */
		
		Object object = new Student();
		// true
		System.out.println(object instanceof Student);
		// true
		System.out.println(object instanceof Person);
		// true
		System.out.println(object instanceof Object);
		// false
		System.out.println(object instanceof Teacher);
		// false
		System.out.println(object instanceof String);
		System.out.println("===============================");
		
		Person person = new Student();
		// true
		System.out.println(person instanceof Student);
		// true
		System.out.println(person instanceof Person);
		// true
		System.out.println(person instanceof Object);
		// false
		System.out.println(person instanceof Teacher);
		// 编译出错
		// System.out.println(person instanceof String);
		System.out.println("=============================");
		Student student = new Student();
		// true
		System.out.println(student instanceof Student);
		// true
		System.out.println(student instanceof Person);
		// true
		System.out.println(student instanceof Object);
		// 编译出错
		//	System.out.println(student instanceof Teacher);
		// 编译出错
		//	System.out.println(student instanceof String);
	}
}
