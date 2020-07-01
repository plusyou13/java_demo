package cn.day2.demo3;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容，用法有三种：
1.在本类的成员方法中：访问本类的成员变量
2.在本类的成员方法中：访问本类的另外成员方法
3.在本类的构造方法中：访问本类的另一个构造方法，注意，this(...)调用的必须是构造方法的第一个语句，唯一一个。
注意：super和this两种构造调用，不能同时使用。

 */

public class Zi extends Fu {
    int num = 20;

    public Zi() {
       // super();
        this(123);
       // this(12,3)
    }
    public Zi(int n) {

    }
    public Zi(int n,int m) {

    }

    public void showNum() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);

    }

    public void methodA() {
        System.out.println("AAA");

    }

    public void methodB() {
        System.out.println("BBB");

    }
    @Override
    public void method() {
        super.method();//调用父类方法
        System.out.println("子类方法");

    }

}
