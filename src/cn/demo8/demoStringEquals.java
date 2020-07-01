package cn.demo8;

import javax.crypto.spec.PSource;

/*
由于==是地址值的比较，如果确实需要字符串内容比较，有一下两个方法：

 boolean equals(Object anObject) 将此字符串与指定的对象比较。 内容相同则返回true，否则false。
equals具有对称性。str1.equals(str2)和str2.equals(str1)一样
推荐用"abc".equals(str3)，把常量放到前面

 boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写。

 */
public class demoStringEquals {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("abc"));
        System.out.println("abc".equals(str3));
        System.out.println("========================");

        String str5=null;
        System.out.println("abc".equals(str5));
        //System.out.println(str5.equals("abc"));//报错java.lang.NullPointerException
        System.out.println("========================");
        String str6="ABC";
        System.out.println(str1.equalsIgnoreCase(str6));


    }

}
