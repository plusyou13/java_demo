package cn0.day1.demo7;

import java.util.ArrayList;
/*
打印格式 x@x@x@x
 */
public class demoArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        printArrayList(list);
    }
/*
方法定义的三要素：
返回类型：void
方法名称：printArrayList
参数列表：ArrayList
 */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if(i==list.size()-1) {
                System.out.print(name);
            }
            else {
                System.out.print(name + " @ ");
            }

        }
        System.out.print("}");
    }
}
