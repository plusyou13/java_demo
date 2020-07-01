package cn.day2.demo6;

public class demoMain {
    public static void main(String[] args) {
       // Animal animal=new Animal();//抽象类
       // Dog dog=new Dog();//抽象类
        Dog1 dog1=new Dog1();
        Dog2 dog2=new Dog2();
        dog1.sleep();
        dog1.eat();
        System.out.println("====================");
        dog2.sleep();
        dog2.eat();

    }
}
