package cn.demo8;
/*
 String[] split(String regex)
          根据给定正则表达式的匹配拆分此字符串。

 String[] split(String regex, int limit)
          根据匹配给定的正则表达式来拆分此字符串。

split方法参数其实是正则表达式re，"."要转义
 */
public class demoStringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        String[] array1=str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);

        }
        System.out.println("======================");
        String str2="aaa bbb ccc";
        String[] array2=str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }
        System.out.println("======================");
        String str3="aaa.bbb.ccc";
        String[] array3=str3.split(".");
        System.out.println(array3.length);//0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);

        }

        System.out.println("======================");
        String str4="aaa.bbb.ccc";
        String[] array4=str4.split("\\.");
        System.out.println(array4.length);//0
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);

        }
    }
}
