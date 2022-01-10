package hello.base;

import java.util.Scanner;

public class Demo09_Scanner_nextLine {
    public static void main(String[] args) {
        /*
        * nextLine方式输入:
        *   以一行为结束
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1_");
        if(scanner.hasNextLine()){
            String str1 = scanner.nextLine();
            System.out.println("输入1_为: "+str1);
        }
        scanner.close();
    }
}
