package hello.reflection.reflection01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings("all")
public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        // IO流的相对路径是从项目为根 开始算的
        properties.load(new FileInputStream("hello\\src\\hello\\reflection\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        // 打印获取到的文件的数据
        // 类的路径是 xxx.xxxx.xxx   (从模块为根开始的,可以忽略掉src)
        System.out.println("classfullpath: "+classfullpath);
        System.out.println("method: "+methodName);

        // 使用反射机制
        // 1.加载类, 返回 Class 类型的对象 cls
        Class cls = Class.forName(classfullpath);
        // 2.通过 cls 得到加载的类 classfullpathsrc.hello.reflection.Cat 的实例
        Object o = cls.newInstance();
        // 3.通过 cls 得到加载的类 classfullpathsrc.hello.reflection.Cat 的方法的对象
        // 相当于python中的 "函数对象"
        Method method = cls.getMethod(methodName);
        // 4.通过方法对象来实现调用方法
        method.invoke(o);
        // 更换调用的方法类型时,只需要更改配置文件 re.properties 里的内容即可

        // `java.lang.reflect.Field`: 代表类的成员变量, Field对象表示某个类的成员变量
        // 只能获取到 public 变量
        // Field name = cls.getField("name");
        Field fieldName = cls.getField("age");
        // 传统方法: 对象.成员变量    ==>     反射: 成员变量.get(实例对象)
        System.out.println(fieldName.get(o));

        // `java.lang.reflect.Constructor`: 代表类的构造方法, Constructor对象表示构造器
        // () 里可以指定构造器的参数类型, 空着 则为无参构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);    // cat()
        // 这里传入的 String.class, 就是String的class对象
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);   // cat(String name)


    }
}
