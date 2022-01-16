package hello.base;

public class Demo13_VariableParameter {
	public static void main(String[] args) {
		Demo13_VariableParameter variableParameter = new Demo13_VariableParameter();
		variableParameter.test(1, 2, 3, 4, 5, 6, 7);
	}
	
	public void test(int i, int... j) {
		System.out.println("i:" + i);
		for (int s : j) {
			System.out.println("j:" + s);
		}
	}
}
