package cn0.day1.demo4;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        //求数组累加和
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"个元素");
            a[i]=sc.nextInt();
        }
        System.out.println("数组内容为");
        /*
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"     ");
        }
        */

         //增强型for循环
        for(int n:a){
            System.out.print(n+"   ");
        }
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("数组和为："+sum);
    }
}
