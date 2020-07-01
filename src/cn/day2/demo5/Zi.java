package cn.day2.demo5;

public class Zi extends Fu {
    public Zi() {
        System.out.println("子类构造方法执行");
    }

    @Override

    public void eat() {
        System.out.println("Zi eat");
    }
}
