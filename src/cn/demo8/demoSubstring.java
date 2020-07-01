package cn.demo8;
/*
String substring(int beginIndex)返回一个新的字符串，它是此字符串的一个子字符串。
String substring(int beginIndex, int endIndex) 返回一个新字符串，它是此字符串的一个子字符串。
[)左闭右开

 */
public class demoSubstring {
    public static void main(String[] args) {
        String str1="helloworld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        String str3=str1.substring(4,7);
        System.out.println(str3);
        System.out.println("===============");
        //字符串内容没有改变，strA的地址值改变了
        //strA本来是保存的是，hello的地址0x666
        //后来就变为java的0x999
        String strA="Hello";
        System.out.println(strA);
        System.out.println(strA.getBytes());
        strA="java";
        System.out.println(strA);
        System.out.println(strA.getBytes());
    }
}
