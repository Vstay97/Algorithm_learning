package hello.base;

public class Demo05_Variable {
	// 类变量:static
	static double salary = 2500;
	
	// 常量:final,修饰符 不存在先后顺序
	static final double PI = 3.1415926;
	// final static double PI = 3.1415926;
	
	// 属性: 变量
	// 实例变量:从属于对象;
	String name;
	int age;
	
	// main方法
	public static void main(String[] args) {
		// 局部变量:必须声明和初始化值
		int i = 10;
		System.out.println(i);
		
		// 变量类型 变量名字 = new Dome05_Variable();
		Demo05_Variable dome05 = new Demo05_Variable();
		System.out.println(dome05.age);
		System.out.println(dome05.name);
		
		// 类变量  static
		System.out.println(salary);
	}
	
	// 其他方法
	public void add() {
	
	}
}
