package cn.demo8;
/*
字符串常量池：直接用双引号的字符串，就在其中。

对于基本型：==是【数值】的比较
对于引用型:==是进行【地址】的比较

双引号直接写的字符串在常量池中，new的不在，
 */
public class demoStringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);
        System.out.println(str3 == str2);
        System.out.println(str1 == str3);
    }

    }

