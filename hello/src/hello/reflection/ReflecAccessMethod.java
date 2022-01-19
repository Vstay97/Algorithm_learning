package hello.reflection;

import java.lang.reflect.Method;

/**
 * @author Vstay
 * @date 2022/1/19 17:34
 */
public class ReflecAccessMethod {
    public static void main(String[] args) throws Exception{
        // 得到Boss类 对应的class对象
        Class<?> bossClass = Class.forName("hello.reflection.Boss");
        // 实例化
        Object o = bossClass.newInstance();
        // 得到class的hi方法
        Method hi = bossClass.getDeclaredMethod("hi", String.class);
        // 通过反射调用public方法
        hi.invoke(o,"哪吒");

        // 调用private方法
        // 得到say方法对象
        Method sayMethod = bossClass.getDeclaredMethod("say", String.class,int.class);
        // 爆破
        sayMethod.setAccessible(true);
        sayMethod.invoke(o,"二郎神",99);
        // 因为是static的, 所以对象可以传null
        sayMethod.invoke(null,"二郎神",82);

        // 在反射中, 如果有返回值, 统一返回object
        // 但是他的运行类型, 和方法的返回类型一致
        Object obj = sayMethod.invoke(null, "二郎神", 12);



    }
}


class Boss {

    public int age;
    private static String name;

    public Boss() {}

    public void hi(String s){
        System.out.println("hi! "+s);
    }

    private static void say(String s,int age){
        System.out.println("私有静态方法 "+s+"  "+age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +","+
                "name="+ name +
                '}';
    }
}
