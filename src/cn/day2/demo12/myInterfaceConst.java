package cn.day2.demo12;
/*
接口中也可以定义”成员变量“ ，但是必须使用public static final 三个关键字进行修缮
效果上等同于，接口的【常量】
格式：
public static final 数据类型 常量名称=数据值；
备注：一旦使用final关键字进行修缮，说明不能改变

注意事项：
1.接口中的常量，可以省略public static final
2.接口中的常量，必须赋值，不赋值不能使用。
3.接口中常量名称，使用完全大写字母，用下划线进行分隔。

 */
public interface myInterfaceConst {
    public static final int NUM_MY_CLASS=100;
}
