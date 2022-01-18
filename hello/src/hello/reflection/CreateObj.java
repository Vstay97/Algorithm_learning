package hello.reflection;

import java.lang.reflect.Constructor;

public class CreateObj {
    public static void main(String[] args) throws Exception {
        // 先获取到User类的Class对象
        Class<?> userClass = Class.forName("hello.reflection.User");
        // 通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        // 通过public的有参构造器创建实例
        // 先得到对应的构造器, 再创建实例, 并传入实参
        /*
        * constructor 对象, 就是:
        * // 有参public构造
        * public User(String name){
        *       this.name = name;
        * }
        * */
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object vstay = constructor.newInstance("vstay");
        System.out.println("vstay="+vstay);

        // 通过private的有参构造器创造实例
        // 先得到private构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        // 创建实例
        // 爆破, 使用反射可以访问private构造器, 在反射面前 都是纸老虎
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2: "+user2);
    }
}

class User {
    private int age = 10;
    private String name = "jack";

    // 无参public构造
    public User(){}

    // 有参public构造
    public User(String name){
        this.name = name;
    }

    // private 有参构造
    private User(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}