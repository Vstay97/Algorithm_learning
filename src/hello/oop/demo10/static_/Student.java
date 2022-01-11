package hello.oop.demo10.static_;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 1:10
 */
public class Student {
	/**
	 * age: 静态变量
	 */
	private static int age;
	private double score;
	
	public void run() {
	
	}
	
	public static void go() {
	
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		// 直接用类去调用方法
		System.out.println(Student.age);
		// 不应该通过实例访问类成员
		System.out.println(s1.age);
		System.out.println(s1.score);
		
		// 通过new一个类,来调用方法
		new Student().run();
		// 用类直接调用
		Student.go();
	}
}
