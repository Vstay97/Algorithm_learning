package hello.exp;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 21:45
 */
public class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		// 假设要捕获多个异常: 从小到大
		try {
			// try: 监控区域
			new Test().func(a, b);
		} catch (Error e) {
			// catch: 捕获异常
			System.out.println("Error!");
			// 打印错误的栈信息
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception!");
			e.printStackTrace();
		} catch (Throwable t) {
			System.out.println("Throwable!");
			t.printStackTrace();
		} finally {
			// 处理善后工作: 关闭IO流等
			System.out.println("finally!");
		}
	}
	
	public void func(int a, int b) throws ArithmeticException{
		if(b == 0){
			/*
			* 一般在方法里使用
			*   假设这个方法处理不了, 主动抛出异常
			 * */
			throw new ArithmeticException();
		}
		System.out.println(a / b);
	}
}
