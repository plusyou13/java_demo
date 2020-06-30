package cn.demo7;

import java.util.ArrayList;
import java.util.Random;

public class demoArrayListReturn {
/*
用一个大集合存入20个随机数字，然后筛选其中偶数，放到小集合中
要求使用自定义的方法来实现筛选

1.创建集合，用来存储int数字<Integer>
2.随机数字用Random  nextInt
3.循环20次，把随机数字放入大集合，用for，add
4.定义筛选方法

三要素
返回类型：ArrayList小集合（元素个数不确定）
方法名称：getSmallList
参数列表：ArrayList大集合（装着20个随机数字）

5.判断（if)是偶数：num%2==0
6.如果是偶数，就放到小集合，否则不放

 */
public static void main(String[] args) {
    ArrayList<Integer> bigList=new ArrayList<>();
    Random r=new Random();
    for (int i = 0; i < 20; i++) {
        int num=r.nextInt(100)+1;//1--100
        bigList.add(num);
    }
    ArrayList<Integer> smallList=getSmallList(bigList);
    System.out.println("偶数个数："+smallList.size());
    for (int i = 0; i < smallList.size(); i++) {
        System.out.println(smallList.get(i));
    }
}
//这个方法，接受大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
    //创建一个小集合，用来装偶数结果
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num=bigList.get(i);
            if(num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
