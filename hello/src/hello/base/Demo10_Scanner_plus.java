package hello.base;

import java.util.Scanner;

public class Demo10_Scanner_plus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入");
		int i = 0;
		float j = 0.1f;
		if (scanner.hasNextInt()) {
			i = scanner.nextInt();
			System.out.println("整数为: " + i);
		} else {
			System.out.println("输入的不是整数");
		}
		if (scanner.hasNextFloat()) {
			j = scanner.nextFloat();
			System.out.println("小数为: " + j);
		}
	}
}
