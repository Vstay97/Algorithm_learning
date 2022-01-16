package hello.oop.demo09.converType;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 0:58
 */
public class Application {
	public static void main(String[] args) {
		/*
		 * 类型之间的转换: 父    子
		 * */
		Student student = new Student();
		student.go();
		Person person = student;
		// 子类转换为父类,可能会丢失一些子类的方法
		// person.go();
		person.run();
	}
	
}
