package cn.demo10;
/*
java.lang.Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。类似这样的工具
类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单.

public static double abs(double a) ：返回 double 值的绝对值。
public static double ceil(double a) ：返回大于等于参数的最小的整数。向上取整
public static double floor(double a) ：返回小于等于参数最大的整数。
public static long round(double a) ：返回最接近参数的 long。(相当于四舍五入方法)
 */
public class demoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-3.7));
        System.out.println("==================");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println("==================");

        //向下取整
        System.out.println(Math.floor(30.01));
        System.out.println(Math.floor(30.0));
        System.out.println(Math.floor(30.90));
        System.out.println("==================");

        //四舍五入
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.54));
        System.out.println(Math.round(3.99));

        System.out.println(Math.PI);
    }
}
