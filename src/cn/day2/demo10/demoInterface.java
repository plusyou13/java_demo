package cn.day2.demo10;
/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法。

正确使用：通过接口名称，直接调用其中的静态方法。
格式：  接口名称.静态方法名（参数）

静态和对象没关系，只和类有关系。

 */
public class demoInterface {
    public static void main(String[] args) {
    //直接通过接口名称调用静态方法；
        myInterfaceStatic.methodStatic();

    }
}
