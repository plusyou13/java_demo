package cn0.day1.demo8;

import java.util.Scanner;

/*
统计字符个数
键盘录入一个字符，统计字符串中大小写字母及数字字符个数

Scanner
String str=sc.next();
定义4给变量，大写，小写，数字，其他
需要对字符串一个个检测，String-->char[];
打印结果

 */
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        //获取字符串
        String input = sc.next();
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if(ch<='Z'&&ch>='A')
                countUpper++;
            else if(ch<='z'&&ch>='a')
                countLower++;
            else if(ch<='9'&&ch>='0')
                countNumber++;
            else countOther++;

        }
        System.out.println("大写有："+countUpper);
        System.out.println("小写有："+countLower);
        System.out.println("数字有："+countNumber);
        System.out.println("其他有："+countOther);

    }
}
