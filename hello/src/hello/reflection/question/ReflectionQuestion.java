package hello.reflection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Vstay
 */
@SuppressWarnings("all")
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        // IO流的相对路径是从项目为根 开始算的
        properties.load(new FileInputStream("hello\\src\\hello\\reflection\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        // 打印获取到的文件的数据
        // 类的路径是 xxx.xxxx.xxx
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
    }
}
