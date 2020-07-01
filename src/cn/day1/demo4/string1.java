package cn.day1.demo4;

public class string1 {
    public static void main(String[] args) {
        String s1 = "Hello";
// 使用+运算符连接
        String s2 = s1 + " ";
        String s3 = s2 + "World";
        System.out.println(s3);
        String s4 = "Hello";
// 使用+运算符连接，支持+=赋值运算符
        s4 += " ";
        s4 += "World";
        System.out.println(s4);
        String s5 = "Hello";
// 使用concat方法连接
        s5 = s5.concat(" ").concat("World");
        System.out.println(s5);
        int age = 18;
        String s6= "她的年龄是" + age + "岁。";
        System.out.println(s6);
        char score = 'A';
        String s7= "她的英语成绩是" + score;
        System.out.println(s7);
        java.util.Date now = new java.util.Date();
        //对象拼接自动调用toString()方法
        String s8= "今天是：" + now;
        System.out.println(s8);
    }
}
