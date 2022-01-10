package hello.base;

public class Demo03_DataType_plus {
    public static void main(String[] args) {
        // 整数拓展:    进制  二进制0b   十进制 八进制0    十六进制0x
        int i = 10;
        int i2 = 010;   // 八进制10->'8'
        int i3 = 0x10;  // 十六进制10-> '16'

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        // 浮点数拓展:
        // 精度损失,尽量避免使用浮点数进行比较!
        float f = 0.1f;     // 0.1
        double d = 1.0/10;  // 0.1

        System.out.println(f == d);     // false

        float d1 = 123124234234324234f;
        float d2 = d1+1;

        System.out.println(d1==d2);     // false

        // 字符拓展
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1);    // 字符的强制转换

        System.out.println(c2);
        System.out.println((int)c2);
        // 所有的字符本质还是数字

        // 字符串
        String sa = new String("hello,world");
        String sb = new String("hello,world");
        System.out.println(sa == sb);       // false    是类的一个对象,地址不同

        String sc = "hello,world";
        String sd = "hello,world";
        System.out.println(sc == sd);       // true     指向同一块地址(字符串常量池)

        // 布尔值拓展
        boolean flag = true;

    }
}
