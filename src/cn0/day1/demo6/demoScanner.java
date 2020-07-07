package cn0.day1.demo6;

import java.util.Scanner;

//import java.util.Scanner;
//alt+enter 自动导包
public class demoScanner {
    public static void main(String[] args) {
        //从键盘输入
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("num:" + num);
        String str = sc.next();
        System.out.println("str:" + str);
    }
}
