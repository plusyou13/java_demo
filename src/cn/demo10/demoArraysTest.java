package cn.demo10;

import java.util.Arrays;

/*
请使用Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
1.一个数组用Arrays.sort方法
2.String-->数组，用toCharArray

n.for1正序
n.forr逆序
 */
public class demoArraysTest {
    public static void main(String[] args) {
        String str="kjhdsfiahb94ro71f9489ahjkjhafd";
        char[] charArray=str.toCharArray();
        Arrays.sort(charArray);
        for (int i = charArray.length - 1; i > 0; i--) {
            System.out.print(charArray[i]+"  ");

        }
    }
}
