package hello.oop.demo10.static_;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 1:18
 */
public class Person {
	/**
	 * {
	 *     // 代码块(匿名代码块)
	 *     在创建对象的时候就创建了(在构造器之前),但并不主动去调用这个块
	 * }
	 *
	 * static {
	 *     // 静态代码块
	 *     类一加载就执行,但永久只执行一次
	 * }
	 */
	// 赋初值
	{
		System.out.println("匿名代码块");
	}
	
	// 只执行一次
	static {
		System.out.println("静态代码块");
	}
	
	public Person() {
		System.out.println("构造方法");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("====================");
		Person person1 = new Person();
	}
}
