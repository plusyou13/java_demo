package cn.day1.demo8;
/*
java.lang.String 类代表字符串。Java程序中所有的字符串文字（例如"abc" ）都可以被看作是实现此类的实例。
类 String 中包括用于检查各个字符串的方法，比如用于比较字符串，搜索字符串，提取子字符串以及创建具有翻译为大写或小写的所有字符的字符串的副本。

查看类
java.lang.String ：此类不需要导入。

三种构造方法
public String() ：初始化新创建的 String对象，以使其表示空字符序列。
public String(char[] value) ：通过当前参数中的字符数组来构造新的String。
public String(byte[] bytes) ：通过使用平台的默认字符集解码当前参数中的字节数组来构造新的
一种直接创建：
String str ="Hello";//
注意：直接写上双引号，就是字符串对象

 */
public class demoString {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();
        System.out.println("第一个字符串："+str1);
        //根据字符串数组创建字符串
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println("第二个字符串："+str2);
        //根据字节数组创建字符串
        byte[] byteArray={97,98,99,100,101};
        String str3=new String(byteArray);
        System.out.println("第三个字符串："+str3);
    }
}
