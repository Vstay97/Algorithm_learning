package hello.oop.demo05.super0;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getMoney());
        /*
        * 在Java中所有的类都默认直接或间接继承Object类
        * */
        student.toString();

        student.test("student");

        student.test1();
    }
}
