package hello.base;

import java.util.Scanner;

public class Demo08_Scanner_next {
    public static void main(String[] args) {
        /*
        * next方式:
        *   空格停止
        * */
        // 创建一个扫描器对象,用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接受:");

        // 判断用户有没有输入字符串
        if (scanner.hasNext()){
            // 使用next方式接受
            String str = scanner.next();
            System.out.println("输入的内容为:"+str);
        }

        // 凡是属于IO流的类如果不关闭会一直占用资源,用完后要随手关闭
        scanner.close();
    }
}
