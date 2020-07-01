package cn.day2.demo4;
/*
使用abstract 关键字修饰方法，该方法就成了抽象方法，抽象方法只包含一个方法名，而没有方法体。
修饰符 abstract 返回值类型 方法名 (参数列表)；

如果一个类包含抽象方法，那么该类必须是抽象类。
abstract class 类名字 {
}

注意：
1.不能直接创建抽象类对象
2.必须用一个子类继承父类
3.子类必须（实现）覆盖重写抽象父类的所有抽象方法
4.最后创建子类对象进行使用

 */
public abstract class Animal {
    //代表吃东西，具体吃什么，不确定
    public abstract void eat();
    public void method(){

    }
}
