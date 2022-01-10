package hello.oop.demo04.inherit;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getMoney());
        /*
        * 在Java中所有的类都默认直接或间接继承Object类
        * */
        student.toString();
    }
}
