package hello.base;

public class Dome12_Overload {
    public static void main(String[] args) {
        double max = max(2.2,3.5);
        System.out.println(max);
    }
    public static int max(int a,int b ){
        System.out.println("int max:");
        return a>b ? a:b;
    }
    public static double max(double a,double b){
        System.out.println("double max");
        return a>b ? a:b;
    }
}
