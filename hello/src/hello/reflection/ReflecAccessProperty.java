package hello.reflection;

import java.lang.reflect.Field;

/**
 * @author Vstay
 * @date 2022/1/19 16:49
 * 反射操作属性
 */
public class ReflecAccessProperty {
    public static void main(String[] args) throws Exception{
        // 1.得到Student的Class对象
        Class<?> stuClass = Class.forName("hello.reflection.Student");
        // 2.创建对象; o的运行类型就是Student类型
        Object o = stuClass.newInstance();
        // 3.使用反射得到 age 属性对象
        Field age = stuClass.getField("age");
        // 通过反射操作属性
        age.set(o,88);
        System.out.println(o);
        // 返回 age 属性的值
        System.out.println(age.get(o));
        // 4.使用反射操作操作 name 的值
        Field name = stuClass.getDeclaredField("name");
        // 对 name 进行爆破, 可以操作private属性
        name.setAccessible(true);
        name.set(o,"vstay");
        // 因为name是static的, 所以对象是null也可以
        name.set(null,"vstay1");
        System.out.println(o);
    }
}

class Student {

    public int age;
    private static String name;

    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +","+
                "name="+ name +
                '}';
    }
}
