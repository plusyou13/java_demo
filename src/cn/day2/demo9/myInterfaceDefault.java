package cn.day2.demo9;

/*
定义默认方法。
格式：
public default 返回值类型 方法名称（参数列表）{
方法体
}
接口中的默认方法，可以解决接口升级问题。


 */

public interface myInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    public default void methodAbs2() {

        System.out.println("这是默认方法");
    }

}
