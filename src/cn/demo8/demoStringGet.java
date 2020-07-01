package cn.demo8;
/*
int length() 返回此字符串的长度。

String concat(String str)将指定字符串连接到此字符串的结尾。

char charAt(int index)  返回指定索引处的 char 值。

int indexOf(int ch, int fromIndex) 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。如果没有则返回-1.


 */
public class demoStringGet {
    public static void main(String[] args) {
        String str1="abcdefghijklmnopqrstuvwxyz";
        System.out.println("length:"+str1.length());
        String str2="hello";
        String str3="world";
        String str4=str2.concat(str3);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("=================");

//获取指定索引位置的字符
        char ch="Hello".charAt(2);
        System.out.println("在2号索引位置的字符是"+ch);
        System.out.println("=================");
//在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。如果没有则返回-1.
        String original ="hello world hello world hello world hello world";
        int index=original.indexOf("llo");
        System.out.println("第一次索引值是："+index);
        int index2=original.indexOf("aaa");
        System.out.println("第一次索引值是："+index2);

    }
}
