package cn.day2.demo2;

public class Zi extends Fu {
    int num=20;

    public void method() {
        int num=30;
        System.out.println("局部： "+num);//局部变量
        System.out.println("本类成员变量： "+this.num);//本类成员变量
        System.out.println("父类成员变量： "+super.num);//父类成员变量
    }
}
