package hello.oop.demo01.create;

public class Person {
	String name;
	int age;
	
	/**
	 * 无参构造
	 */
	public Person() {
		this.name = "小明";
	}
	
	/**
	 * 有参构造:
	 * 一旦定义有参构造,无参构造就必须显式定义
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * 快捷键: Alt + Insert
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

