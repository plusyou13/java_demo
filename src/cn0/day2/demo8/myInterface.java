package cn0.day2.demo8;
/*
接口定义抽象方法
格式为：public abstract 返回类型 方法名称（参数列表）

注意：
1.接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
2.这两个关键字修饰符，可以选择性省略

 */
public interface myInterface {
    public abstract void methodAbs1();
    public void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();
}
