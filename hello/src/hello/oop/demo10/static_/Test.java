package hello.oop.demo10.static_;

// 静态导入包
import static java.lang.Math.random;
import static java.lang.Math.PI;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 1:30
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(Math.random());
		// 静态导入包之后,可以直接下random()
		System.out.println(random());
		System.out.println(PI);
	}
}
