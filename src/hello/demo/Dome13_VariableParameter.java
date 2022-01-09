package hello.demo;

public class Dome13_VariableParameter {
    public static void main(String[] args) {
        Dome13_VariableParameter variableParameter = new Dome13_VariableParameter();
        variableParameter.test(1,2,3,4,5,6,7);
    }
    public void test(int i,int... j){
        System.out.println("i:"+i);
        for (int s:j){
            System.out.println("j:"+s);
        }
    }
}
