package hello.oop.demo05.super0;

public class Person {
	private int money = 10_0000_0000;
	
	protected String name = "Person";
	
	public Person() {
		System.out.println("Person无参构造执行了");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void print() {
		System.out.println("print: Person");
	}
}
