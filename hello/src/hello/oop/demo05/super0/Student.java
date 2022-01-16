package hello.oop.demo05.super0;

/**
 * 子类Student继承了基类Person
 * 就会拥有父类的全部Public方法
 */
public class Student extends Person {
	/**
	 * Ctrl+H 查看继承树
	 */
	private String name = "Student";
	
	public Student() {
		//
		/*
		 * 如果要调用父类的构造器, 必须在子类构造器的第一行
		 * this 子类构造和 super父类构造只能二选一的写
		 * 如果父类只定义了有参构造,那么子类在写无参构造的时候 就要显示的调用父类的有参构造
		 * 所以建议,在写有参构造方法的时候,一定要显式地编写无参构造方法
		 * */
		super();
		System.out.println("Student无参构造执行了");
	}
	
	public void print() {
		System.out.println("print: Student");
	}
	
	public void test(String name) {
		System.out.println("name: " + name + "(传进来的实参)");
		System.out.println("this.name: " + this.name + "(子类创建对象的私有name属性)");
		System.out.println("super.name: " + super.name + "(父类的保护属性)");
	}
	
	/**
	 * 若是私有的,则无法被继承
	 */
	public void test1() {
		print();
		this.print();
		super.print();
	}
	
	
}
