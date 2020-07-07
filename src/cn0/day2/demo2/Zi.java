package cn0.day2.demo2;

public class Zi extends Fu {
    int num = 20;

    public Zi() {
        System.out.println("子类构造方法");
    }

    public void method() {
        int num = 30;
        System.out.println("局部： " + num);//局部变量
        System.out.println("本类成员变量： " + this.num);//本类成员变量
        System.out.println("父类成员变量： " + super.num);//父类成员变量
    }
    //3种使用super方法
      //  System.out.println("========================");

    public void methodZi() {
        System.out.println(super.num);//父类的num
    }

    public void method0() {

        super.method0();
        System.out.println("子类方法");
    }
}
