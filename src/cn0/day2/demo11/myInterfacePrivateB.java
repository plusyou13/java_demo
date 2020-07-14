package cn0.day2.demo11;
/*
问题描述：需要抽取一个公共方法，用来解决两个默认方法之间重复代码的问题
但是这个公共方法不能让实现类使用，应该是私有化的

解决方法：
定义私有方法
1.普通私有方法可以解决多个默认方法之间重复代码问题。
格式： private 返回值类型 方法名称（参数列表）{
方法体
}

2.静态私有方法，解决多个静态方法之间重复代码问题。
格式： private static 返回值类型 方法名称（参数列表）{
方法体
}
 */

public interface myInterfacePrivateB {
    public static void methodDefault1(){
        System.out.println("默认方法");
//        methodCommmon();

    }

    public static void methodDefault2(){
        System.out.println("默认方法");
//        methodCommmon();

    }
//    private static void methodCommmon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
  //  }
}
