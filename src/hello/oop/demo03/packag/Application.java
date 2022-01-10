package hello.oop.demo03.packag;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("小明");
        System.out.println(s1.getName());
        // age不合法
        s1.setAge(999);
        System.out.println(s1.getAge());
    }
}
