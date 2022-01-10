package hello.oop.demo01.create;

public class Application {
    /**
     * 一个对象应该只存在一个main方法
     * @param args
     */
    public static void main(String[] args) {
        Student xiaoming = new Student();
        xiaoming.name = "小明";
        Student xiaohong = new Student();
        xiaohong.name = "小红";
        xiaoming.study();
        xiaohong.study();

        // 实例化一个对象
        Person person = new Person("小红");
        System.out.println(person.name);

    }
}
