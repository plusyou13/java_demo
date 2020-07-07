package cn0.day2.demo2;
/*
三个重名：
局部变量，
父类成员变量，
子类成员变量，


1.在继承的关系中，子类构造方法当中有一个默认隐含的“super()”调用，
所以一定是先调用父类构造，再调用子类构造。
2.子类调用可以通过super关键字来父类重载构造。
3.super的父类调用，必须是子类构造方法的第一个语句，不能一个子类多次调用super构造。

总结：子类必须调用父类构造方法，不写则赠送super（），
写了则用指定的super调用，super只有一个，而且是第一个。

 */
public class demoExtendsField {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.method();
        //super使用
        zi.method0();
    }
}
