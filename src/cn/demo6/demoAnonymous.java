package cn.demo6;

import java.util.Scanner;

public class demoAnonymous {
    public static void main(String[] args) {
        //普通方式
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();

        //匿名对象方式
//        int num2=new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num2);
        //一般对象传参
//        Scanner sc=new Scanner(System.in);
//        methodParam(sc);

        //匿名对象进行传参
//        methodReturn(new Scanner(System.in));
        Scanner sc=methodReturn();
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodReturn(){
//        Scanner sc=new Scanner(System.in);
//        return sc;
    return new Scanner(System.in);

    }
}
