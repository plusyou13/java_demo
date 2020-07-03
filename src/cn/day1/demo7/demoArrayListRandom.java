package cn.day1.demo7;

import java.util.ArrayList;
import java.util.Random;

public class demoArrayListRandom {
    /*
    生成6个 1--33之间的随机整数；
    1.创建集合<Integer>,存储6个数字
    2.产生随机数
    3.循环6次。
    4.循环内调用r.nextInt(int n),n=33,0--32,整体加一
    5.添加到集合add
    6。遍历一下
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            int num=r.nextInt(32)+1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
