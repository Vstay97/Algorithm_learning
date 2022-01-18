package hello.reflection.classMethod;

import hello.reflection.Car;

import java.lang.reflect.Field;

public class class_ {
    public static void main(String[] args) throws Exception{
        String classFullPath = "hello.reflection.Car";
        Class cls = Class.forName(classFullPath);
        // 打印 cls ,显示是哪个类的 Class 对象
        System.out.println(cls);
        // 打印运行类型: java.lang.Class
        System.out.println(cls.getClass());
        // 得到包名
        System.out.println(cls.getPackage().getName());
        // 得到全类名
        System.out.println(cls.getName());
        // 通过 cls 创建对象实例
        Car car = (Car)cls.newInstance();
        System.out.println(car);
        // 通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        // 通过反射给属性赋值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));
        // 得到所有的属性
        Field[] fields = cls.getFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }
    }
}
