package cn0.day1.demo7;

import java.util.ArrayList;

public class demoArrayListBasic {
 /*
基本类型    包装类（引用类型，包装类都位于java.lang包下）
 byte       Byte
 short      Short
  int       Integer   【*】
  long      Long
  float     Float
  double    Double
  char      Charater  【*】
  boolean   Boolean

  自动装箱：基本类型---->包装类型
  自动拆箱：包装类型---->基本类型
  */
 public static void main(String[] args) {
     ArrayList<String> listA=new ArrayList<>();
     ArrayList<Integer> listC=new ArrayList<>();
     listC.add(1);
     listC.add(2);
     listC.add(3);
     System.out.println(listC);
     for(int i=0;i<listC.size();i++){
         int num=listC.get(i);
         System.out.println("第"+i+"号元素:"+num);
     }
 }
}
