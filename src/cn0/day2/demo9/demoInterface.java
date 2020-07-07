package cn0.day2.demo9;
/*
接口的默认方法，可以通过接口实现类对象，直接调用。
接口的默认方法，可以通过接口实现类进行覆盖重写。
 */
public class demoInterface {
    public static void main(String[] args) {
        //创建了实现类对象
        myInterfaceDefaultA a=new myInterfaceDefaultA();
        a.methodAbs();
        a.methodAbs2();
        System.out.println("================");
        myInterfaceDefaultB b=new myInterfaceDefaultB();
        b.methodAbs();
        b.methodAbs2();
    }
}
